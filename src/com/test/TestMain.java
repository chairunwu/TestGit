package com.test;

import org.apache.commons.lang3.StringUtils;

public class TestMain {

	public static void main(String[] args) {
		String str = "1245";
		
		if(StringUtils.isNotEmpty(str)) {
			System.out.println(str + "hahaha");
		}
		
		System.out.println("测试提交git");
		System.out.println("测试更新git");
	}
}
