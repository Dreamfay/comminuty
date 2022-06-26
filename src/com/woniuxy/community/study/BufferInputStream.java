package com.woniuxy.community.study;

import java.io.*;

public class BufferInputStream {
    public static void main(String[] args) {

        try {
            BufferedInputStream bis = new BufferedInputStream(new
                    FileInputStream("F:\\123\\1.jpg"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("F:\\123\\2.jpg"));
            byte[] bytes = new byte[1024];
           while (bis.read(bytes)!= -1){
               bos.write(bytes);
           }
            bis.close();
           bos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
