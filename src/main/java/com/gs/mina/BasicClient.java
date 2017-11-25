package com.gs.mina;

import com.gs.Constants;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by Wang Genshen on 2017-04-18.
 */
public class BasicClient {

    public static void main(String[] args) throws IOException, InterruptedException {
        Socket socket = new Socket(Constants.IP, Constants.PORT);
        OutputStream out = socket.getOutputStream();
        out.write("hello".getBytes());
        out.flush();
        InputStream in = socket.getInputStream();
        byte[] bytes = new byte[1024];
        in.read(bytes);
        System.out.println(new String(bytes, "utf-8"));
        Thread.sleep(100000);
    }
}
