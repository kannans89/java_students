package com.techlabs.manager;

public class ManagerService {

	private static ManagerService service;

	private ManagerService() {
		System.out.println("Manager Service Created!");
	}

	public static ManagerService getInstance() {
		if (service == null) {

			synchronized (ManagerService.class) {
				if (service == null)
				service = new ManagerService();

			}

		}
		return service;
	}

	public void doesWork() {
		System.out.println(System.identityHashCode(this) + " is working");
	}
}
