package datastructures.streams.strmdrill;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompletableFutureDemo3 {
    public static void main(String[] args) {

        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> {
            try{
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException interruptedException) {
                throw new IllegalStateException(interruptedException);
            }
            return 50;
        });


        CompletableFuture<Integer> resultFuture = completableFuture.thenCompose(num ->
            CompletableFuture.supplyAsync(() -> num * 2));

            try {
                System.out.println(resultFuture.get());
            } catch ( InterruptedException interruptedException ){
                interruptedException.printStackTrace();
            } catch ( ExecutionException executionException ) {
                executionException.printStackTrace();
            }

            CompletableFuture<Integer> resultCompletableF =  completableFuture.thenCombine(
                    CompletableFuture.supplyAsync(() -> 20 ), (num1, num2) -> {
                        System.out.println("FNUM-1: " + num1 );
                        System.out.println("FNUM-2: " + num2 );
                        return num1 + num2; } );

            try {
                System.out.println(resultCompletableF.get());
            } catch ( InterruptedException e ) {
                e.printStackTrace();
            } catch ( ExecutionException e ) {
                e.printStackTrace();
            }


    }
}
