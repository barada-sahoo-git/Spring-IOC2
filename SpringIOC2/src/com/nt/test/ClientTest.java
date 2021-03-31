package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

public class ClientTest {
	public static void main(String[] args) {
		
		FileSystemResource res = new FileSystemResource("src/com/nt/cfgs/applicationcontext.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);
		
		Object obj= factory.getBean("wmg");
		WishMessageGenerator wmg = (WishMessageGenerator)obj;
		String rs = wmg.wish("barada");
		System.out.println(rs);
	}

}
