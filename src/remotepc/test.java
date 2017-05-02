/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remotepc;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.ServerSocket;

/**
 *
 * @author Garvit Patel
 */
public class test {

    public static void main(String[] args) throws InstantiationException, IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        String hostName = InetAddress.getLocalHost().getHostName();
        InetAddress[] IP;
        IP = Inet4Address.getAllByName(hostName);
        for(InetAddress IP1:IP)
        {
            System.out.println(IP1.toString());
        }
        

    }
}
