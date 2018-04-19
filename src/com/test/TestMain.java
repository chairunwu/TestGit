package com.test;

import org.apache.commons.lang3.StringUtils;

public class TestMain {

	public static void main(String[] args) {
		String str = "1245";
		
		if(StringUtils.isNotEmpty(str)) {
			System.out.println(str + "hahaha");
		}
	}
}
