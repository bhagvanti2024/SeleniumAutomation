package com.Guru99Project;

import utils.loginUrl;

public class Demo2 extends loginUrl {

	public static void main(String arg[]) {
		loginUrl lg = new loginUrl();
		lg.login();

		String actualTitle = driver.getTitle();
		String expectedTitle = "Guru99 Bank Manager HomePage";
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("pass");
		} else {
			System.out.println("Fail");
		}

	}

}
