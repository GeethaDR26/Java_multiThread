package com.multithread;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Multi-threaded File Downloader Simulation ===\n");

        FileDownloader downloader = new FileDownloader();
        downloader.startDownload(5);
    }
}
