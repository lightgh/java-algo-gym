package datastructures.streams.strmdrill;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class CompletableFutureCombination {
    public static void main(String[] args) {
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> 50);
        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> 40 );
        CompletableFuture<Integer> future3 = CompletableFuture.supplyAsync(() -> 30 );

        CompletableFuture<Void> finalFuture = CompletableFuture.allOf(future1, future2, future3);

        try {
            System.out.println(finalFuture.get());
        } catch ( Exception e){
            e.printStackTrace();
        }

        System.out.println("code that should be executed after all the features complete.");


        Optional<Integer> maxIntegerOptional = Stream.of(future1, future2, future3)
                .map(CompletableFuture::join)
                .max(Integer::compareTo);

        System.out.println(maxIntegerOptional);


        CompletableFuture<Object> firstCompletedFuture = CompletableFuture.anyOf(future1, future2, future3);

        try {
            System.out.println("The first completed future value is: " + firstCompletedFuture.get());
        } catch( Exception e ){
            e.printStackTrace();
        }

        System.out.println("code that should be executed after any of the futures complete.");


    }
}
