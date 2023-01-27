package com.eci.url;


import java.net.URL;
import java.net.MalformedURLException;


class Main {

        public static void main(String[]args){

                try {
                        URL personalSite = new URL("http://www.google.com:8080/test/test.html?name=Wilson#test");
                        System.out.println("Protocol: " + personalSite.getProtocol());
                        System.out.println("Host: " + personalSite.getHost());
                        System.out.println("Port: " + personalSite.getPort());
                        System.out.println("Path: " + personalSite.getPath());
                        System.out.println("File: " + personalSite.getFile());
                        System.out.println("Query: " + personalSite.getQuery());
                        System.out.println("Ref: " + personalSite.getRef());

                } catch (MalformedURLException x) {
                        System.err.println(x);
                }
        }


}
