package com.multithread;

public class FileDownloader {
    public void startDownload(int totalParts) {
        Thread[] threads = new Thread[totalParts];

        for (int i = 0; i < totalParts; i++) {
            int downloadTime = (int) (Math.random() * 3000) + 1000; // random 1-4 seconds
            threads[i] = new Thread(new DownloadTask(i + 1, downloadTime), "Thread-" + (i + 1));
            threads[i].start();
        }

        // Wait for all threads to finish
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\n✅ File downloaded successfully in " + totalParts + " parts!");
    }
}

