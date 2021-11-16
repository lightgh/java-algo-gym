package datastructures.streams.strmdrill;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.StampedLock;

public class StampedLockDemo {

    static Map<String, Integer>  data = new HashMap<>();
    static StampedLock lock = new StampedLock();

    public static Integer readDataFromMap(String key){
        long stamp = lock.readLock();


        try {
            return data.get(key);
        } finally {
            lock.unlockRead(stamp);
        }
    }

    public static void writeDataToMap(String key, Integer value){
        long stamp = lock.writeLock();
        try{
            data.put(key, value);
        }finally {
            lock.unlockWrite(stamp);
        }
    }


    public static void main(String[] args) {
        // Couple of important points about ReentrantReadWriteLock:

        // Multiple Threads can acquire a read Lock simultaneously
        // Only One Thread can acquire a write lock
        // If a thread wants to acquire a write lock and there are some threads that
        // have read
        // lock, the thread will wait until all the threads release the read lock

        // There are a few problems with the using the ReentrantReadWriteLock class

        // 1. It can lead to starvation
        // 2. Sometimes it can be significantly lower other synchronizers


        writeDataToMap("ray", 123);
        Integer val = readDataFromMap("ray");
        System.out.println(val);



    }
}
