package org.benjamin.annotation.example;

import org.benjamin.annotation.FruitColor;
import org.benjamin.annotation.FruitColor.Color;
import org.benjamin.annotation.FruitName;
import org.benjamin.annotation.FruitProvider;

public class Apple {
	@FruitName("Apple")
	private String appleName;

	@FruitColor(fruitColor = Color.RED)
	private String appleColor;

	@FruitProvider(id = 1, name = "Bejing Fruit Group", address = "Zhong Guancun, Beijing")
	private String appleProvider;

	public void setAppleColor(String appleColor) {
		this.appleColor = appleColor;
	}

	public String getAppleColor() {
		return appleColor;
	}

	public void setAppleName(String appleName) {
		this.appleName = appleName;
	}

	public String getAppleName() {
		return appleName;
	}

	public void setAppleProvider(String appleProvider) {
		this.appleProvider = appleProvider;
	}

	public String getAppleProvider() {
		return appleProvider;
	}

	public void displayName() {
		System.out.println("水果的名字是：苹果");
	}
}
