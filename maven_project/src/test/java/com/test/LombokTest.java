package com.test;

import org.junit.Test;

import com.bean.LombokBean;

public class LombokTest {

	public static void main(String[] args) {		
		LombokBean lb = new LombokBean();
		lb.setId(111111);
		lb.setName("Shalvey");
		lb.setAge(27);
		System.out.println(lb.toString());		
	}
	
	@Test
	public void add(){
		int a=1;
		int b=2;
		System.out.println(a+b);
	}
	
}
