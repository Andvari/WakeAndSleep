package com.nemo.WakeAndSleep;

import java.io.IOException;
import java.net.*;

/**
 * Created by Nemo on 1/23/14.
 */

public class Thread_WOL extends Thread{
    byte[] kdg = new byte[1000];

    public Thread_WOL(byte[] msg){
        super();
        kdg = msg;
    }
    public void run()
    {
        DatagramSocket s = null;

        try {
            s = new DatagramSocket(null);
        }
        catch (SocketException e) {
            e.printStackTrace();
        }

        DatagramPacket p = new DatagramPacket(kdg, kdg.length);

        try {
            p.setAddress(InetAddress.getByName("255.255.255.255"));
        }
        catch (UnknownHostException e) {
            e.printStackTrace();
        }

        try {
            s.setBroadcast(true);
        }
        catch (SocketException e) {
            e.printStackTrace();
        }

        try {
            s.send(p);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
