package com.itakademija.mysql.niti;

public class PrintTask implements Runnable{

    @Override
    public void run() {
        Thread currentThread = Thread.currentThread();
        String currentThreadName = currentThread.getName();
        System.out.printf("Printam neki tekst na printeru...To radim preko threada '%s'%n", currentThreadName);
    }
}
