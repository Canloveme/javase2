package com.itheima.inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author csq
 * @date 2020/8/9 9:32
 */
public class InetAddressDemo01 {
    public static void main(String[] args) throws UnknownHostException {

        InetAddress msi = InetAddress.getByName("MSI");
        String hostAddress = msi.getHostAddress();
        System.out.println("hostAddress = " + hostAddress);
        String hostName = msi.getHostName();
        System.out.println("hostName = " + hostName);
        String canonicalHostName = msi.getCanonicalHostName();
        System.out.println("canonicalHostName = " + canonicalHostName);

        InetAddress byName = InetAddress.getByName("185.199.108.153");
        System.out.println("byName = " + byName);
        System.out.println(byName.getHostName());
        System.out.println(byName.getCanonicalHostName());

        InetAddress top = InetAddress.getByName("canloveme.top");
        System.out.println("byName = " + top);
        System.out.println(top.getHostName());
        System.out.println(top.getCanonicalHostName());
    }
}
