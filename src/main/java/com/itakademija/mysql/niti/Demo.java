package com.itakademija.mysql.niti;

/**
 * Concurrency -> Thread/Niti
 *
 * Više radnika ne znači brže završen posao UVIJEK.
 * 4 radnika : August POC
 *
 * Vlasnik = > ako ste vas 4 završili ovo za 3 mjeseca
 * Ako uposlije 20 ljudi => 3 mjeseca / 5
 *
 * Jedna žena za 9 mjeseci donese na svijet dijete.
 * Ali 9 žena za jedan mjesec to ne mogu.
 *
 *  <p>
 *      Imamo brdo pijeska i imamo jednu lopatu.
 *  </p>
 *   PROBLEMI prilikom rada sa threadovima/nitima
 *   <li>1. Thread interferencija</li>
 *   <li>2. Memory inkonzistencija</li>
 *
 *
 *   DEAD LOCK
 *   LIVE LOCK
 *   THREAD starvation/ izgladnjivanje
 */
public class Demo {
    public static void main(String[] args) {
        // MAIN Thread: najmanje 1 Thread
        // Java Program: JRE i memory space
        // RADNIK koji izvršava linije koda.. uposlio druge radnike možda bi se program izvršavao brže..
        String mainThreadName = Thread.currentThread().getName();
        System.out.println("Hejj ko je izvršio ovu liniju koda... Odgovor= " + mainThreadName);
        // List<Person> personList = new ArrayList<>();
        //1. način da neki kod izvršite u drugom Thread
        Runnable printTask = new PrintTask();
//        printTask.run();
        Thread thread = new Thread(printTask);
        thread.start();

        //2. način
        Thread drugiThread = new PrintThreadTask();
        drugiThread.start();
    }
}
