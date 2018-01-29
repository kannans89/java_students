package com.techlabs.principles.dip.solution1;

public class TaxCalculator {

	private LogType logtype;

	public TaxCalculator(LogType logType) {
		this.logtype = logType;
	}

	public double calculate(int income, int rate) {

		try {
			return income / rate;
		} catch (Exception e) {
			
			if (logtype == LogType.XML) {
				XMLErrorHandlor xmlLog=new XMLErrorHandlor();
				xmlLog.errorHandlor("XML Error occurred.. sending to the ADMIN");
				xmlLog.errorHandlor(e.getMessage());
			}
			if (logtype == LogType.EMAIL) {
				EmailErrorHandler emailLog=new EmailErrorHandler();
				emailLog.errorHandlor("EMAIL Error occurred.. sending to the ADMIN");
				emailLog.errorHandlor(e.getMessage());
			}
		}
		return 0.0;
	}
}
