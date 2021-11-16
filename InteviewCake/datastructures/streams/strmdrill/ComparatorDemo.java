package datastructures.streams.strmdrill;

import datastructures.streams.grp1.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.*;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Hanna", 90, "Nigeria"));
        people.add(new Person("Simon", 89, "Ghana"));
        people.add(new Person("Simon", 70, "hana"));
        people.add(new Person("Carl", 56, "Cameroon"));
        people.add(new Person("Tina", 80, "Romeo"));

        Collections.sort(people, Comparator.comparing(Person::getName)
                .thenComparing(Person::getAge)
                .thenComparing(Person::getCountry));

        List<String> fruits3 = new ArrayList<>();
        fruits3.add("guava");
        fruits3.add("peach");
        fruits3.add("apple");

        fruits3.add("banana");

        System.out.println("Natural Order");
        Collections.sort(fruits3, Comparator.naturalOrder());
        fruits3.forEach(System.out::println);

        System.out.println("Reverse Order");
        Collections.sort(fruits3, Comparator.reverseOrder());
        fruits3.forEach(System.out::println);

        fruits3.add(null);
        fruits3.add("Carrot");
        fruits3.add("Orange");

        Collections.sort(fruits3, Comparator.nullsFirst(Comparator.naturalOrder()));

        System.out.println("NULL-FIRST");
        fruits3.forEach(System.out::println);

        Collections.sort(fruits3, Comparator.nullsLast(Comparator.naturalOrder()));

        System.out.println("NULL-LAST");
        fruits3.forEach(System.out::println);


        CompletableFuture<String> completableFuture = CompletableFuture.completedFuture("Hello World");
        try{
            System.out.println(completableFuture.get());
        }catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("=============================================");

        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            try{
                TimeUnit.SECONDS.sleep(5);
            }catch(InterruptedException e){
                throw new IllegalStateException(e);
            }
            System.out.println("Doing some processing " + Thread.currentThread().getName());
        });

        System.out.println("This will print immediately " + Thread.currentThread().getName());

        try{
            future.get();
        }catch (InterruptedException e){
            e.printStackTrace();
        }catch (ExecutionException e){
            e.printStackTrace();
        }

        System.out.println("This would print after 5 seconds " + Thread.currentThread().getName());


    }

    public Future<Integer> getSquareAsynchronously(int num) throws InterruptedException {

        CompletableFuture<Integer> completableFuture
                = new CompletableFuture<>();

        Executors.newCachedThreadPool().submit(() -> {
            Thread.sleep(500);
            completableFuture.complete(num * num);
            return null;
        });

        return completableFuture;

    }
}
