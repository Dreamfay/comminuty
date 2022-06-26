package com.woniuxy.community.Test611;

import java.io.File;
import java.io.FileReader;

public class M2 {
    public static void main(String[] args) {
        Th ios = new Th();
        Thread a = new Thread(ios);
        a.start();
    }
}

class Th extends Thread{
    @Override
    public void run() {
        try {
            FileReader f = new FileReader(new File("C:\\jiangjiang\\info.txt"));
            char[] c = new char[1];
            while ((f.read(c)) != -1) {

                Thread.sleep(1000);

                System.out.println(c);
            }
            f.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}