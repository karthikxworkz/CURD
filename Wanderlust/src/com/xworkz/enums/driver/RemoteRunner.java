package com.xworkz.enums.driver;

import com.xworkz.enums.constant.Remote;

public class RemoteRunner {
    public static void main(String[] args) {
		Remote remote = new Remote();
		Remote remote1=new Remote();
		remote1.name="Philips";
		System.out.println(remote.getClass().toString());
		System.out.println(remote.toString());
        System.out.println(remote.equals(remote1));
	}
}
