package com.company;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args){
        ExecutorService executor = Executors.newFixedThreadPool(16);
            for (int i = 0; i < 16; i++){
                executor.submit(new Task(i));
            }
        executor.shutdown();
    }
}

class Task implements Runnable {
    private int id;

    public Task(int id){
        this.id = id;
    }
    @Override
    public synchronized void run() {
        long time = System.currentTimeMillis();
        Integer z = 0;
            for (Integer k = 214748367; k > 0; k--){
        z += k;
        }
        System.out.println("Task number " + id + " is completed and took " + (System.currentTimeMillis() - time) + " milliseconds");
    }

}