package com.techlabs.client.service;

import com.techlabs.input.SourceType;
import com.techlabs.printer.ConsolePrinterService;

public class ClientTest {

	public static void main(String[] args) {
		
		ConsolePrinterService printer =new ConsolePrinterService();
		printer.printToConsole(SourceType.FileReader);
	}

}
