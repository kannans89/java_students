package com.techlabs.controllers.services;

public interface INotifier {

	public void sendNotification(String messageTitle, String messageContent,
			String destination);
}
