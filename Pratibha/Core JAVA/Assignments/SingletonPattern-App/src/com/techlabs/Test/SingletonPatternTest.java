package com.techlabs.Test;

import com.techlabs.singletonPattern.SingleObject;

public class SingletonPatternTest {
	public static void main(String[] args) {
		SingleObject object = SingleObject.getInstance();
		object.showMessage();
	}
}

