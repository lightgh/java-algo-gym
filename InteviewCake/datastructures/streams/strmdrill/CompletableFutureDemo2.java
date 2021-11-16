package datastructures.streams.strmdrill;

import java.util.concurrent.*;

public class CompletableFutureDemo2 {
    public static void main(String[] args) {
        Executor executor = Executors.newFixedThreadPool(5);

        CompletableFuture<Void> future = CompletableFuture.runAsync(()-> {
           try{
               TimeUnit.SECONDS.sleep(5);
           }catch(InterruptedException e){
               throw new IllegalStateException(e);
           }
            System.out.println("Doing some processing");
        }, executor);

        System.out.println("This will print immediately");

        try{
            future.get();
        }catch (InterruptedException interruptedException){
            interruptedException.printStackTrace();
        }catch(ExecutionException ex){
            ex.printStackTrace();
        }

        System.out.println("This will print after 5 seconds");

        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            try{
                TimeUnit.SECONDS.sleep(5);
            } catch(InterruptedException e){
                throw new IllegalStateException(e);
            }
            return "Hello World";
        });

        System.out.println("This will print immediately");

        try{
            System.out.println(future1.get());
        }catch(InterruptedException e){
            e.printStackTrace();
        }catch(ExecutionException e){
            e.printStackTrace();
        }

        System.out.println("This will print after 5 seconds");

        Executor executor1 = Executors.newFixedThreadPool(5);

        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            try{
                TimeUnit.SECONDS.sleep(5);
            }catch (InterruptedException e){
                throw new IllegalStateException(e);
            }
            return "Hello World";
        }, executor1);

        System.out.println("This will print immediately");

        try{
            System.out.println(future2.get());
        }catch (InterruptedException e){
            e.printStackTrace();
        }catch(ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("This will print after 5 seconds");

        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() ->{
            try{
                TimeUnit.SECONDS.sleep(1);
            }catch(InterruptedException e){
                throw new IllegalStateException(e);
            }
            return 50;
        });

        //calling thenApply()
        CompletableFuture<Integer> resultFuture = completableFuture.thenApply( num -> {
            System.out.println(Thread.currentThread().getName());
            return num * 2;
        });

        try{
            System.out.println(resultFuture.get());
        }catch (InterruptedException e){
            e.printStackTrace();
        }catch (ExecutionException e){
            e.printStackTrace();
        }

        CompletableFuture<String> resultFuture2 = resultFuture.thenApplyAsync((num) -> {
            System.out.println(Thread.currentThread().getName());
            return String.valueOf(num * 90);
        });

        try{
            System.out.println(resultFuture2.get());
        }catch (InterruptedException e){
            e.printStackTrace();
        }catch (ExecutionException e){
            e.printStackTrace();
        }

        CompletableFuture<Integer> resultFuture3 = resultFuture2.thenApplyAsync((numStr) -> {
            System.out.println(Thread.currentThread().getName());
            return Integer.parseInt(numStr) * 26;
        }, executor );

        try {
            System.out.println(resultFuture3.get());
        } catch ( InterruptedException e ) {
            e.printStackTrace();
        } catch ( ExecutionException e ){
            e.printStackTrace();
        }

        resultFuture3.thenAccept( (num) -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println("The final Value is: " + num );
        });

        resultFuture3.thenRun(() -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println("Hello");
        });



    }
}
