package com.multithread;

public class DownloadTask implements Runnable {
    private int partNumber;
    private int downloadTime;

    public DownloadTask(int partNumber, int downloadTime) {
        this.partNumber = partNumber;
        this.downloadTime = downloadTime;
    }

    @Override
    public void run() {
        System.out.println("Downloading part " + partNumber + " started by " + Thread.currentThread().getName());
        try {
            Thread.sleep(downloadTime); // simulate time delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Downloading part " + partNumber + " completed by " + Thread.currentThread().getName());
    }
}

