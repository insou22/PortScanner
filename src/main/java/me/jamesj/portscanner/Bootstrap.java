package me.jamesj.portscanner;

/**
 * Created by James on 16/07/2016.
 * (c) JamesJ, or respective owners, 2016
 */
public class Bootstrap {

    public static void main(String[] args) {
        PortScanner portScanner = new PortScanner();
        portScanner.start(args);
    }



}
