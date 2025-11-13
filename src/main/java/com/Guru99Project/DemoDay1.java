
package com.Guru99Project;

import utils.loginUrl;

public class DemoDay1 extends loginUrl {

	public static void main(String[] arg) {
		loginUrl lgLogin = new loginUrl();
		lgLogin.login();
		System.out.println("login successfully");
		
		//DemoDay2 task
		String actualTitle = driver.getTitle();
		String expectedTitle = "Guru99 Bank Manager HomePage";
		System.out.println("Expected Title is:-"+expectedTitle);
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("pass");
		} else {
			System.out.println("Fail");
		}

	}
}
