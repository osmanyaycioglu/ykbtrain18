package com.ykb.java.train.io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileRead {
    public static void main(final String[] args) {
        File file = new File("my.txt");
        byte[] bytes = new byte[1024
                                * 1024
                                * 16];
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            int read = fileInputStream.read(bytes);

            FileChannel channel = fileInputStream.getChannel();
            ByteBuffer dst = ByteBuffer.allocateDirect(1024);
            int read2 = channel.read(dst);

            BufferedInputStream inputStream = new BufferedInputStream(fileInputStream);

            // Reader
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String lineStr = null;
            while ((lineStr = bufferedReader.readLine()) != null) {
                System.out.println("Line : "
                                   + lineStr);
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            List<String> readAllLines = Files.readAllLines(Paths.get("my.txt"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
