package com.techlabs.manager.test;

import com.techlabs.manager.ManagerService;

public class TestManager {

	public static void main(String[] args) {

		ManagerService manager1 = ManagerService.getInstance();
		
		ManagerService manager2 = ManagerService.getInstance();

		manager1.doesWork();

		manager2.doesWork();
	}

}
