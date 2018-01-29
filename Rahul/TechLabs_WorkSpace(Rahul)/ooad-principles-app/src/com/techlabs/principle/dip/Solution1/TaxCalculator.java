package com.techlabs.principle.dip.Solution1;

import com.techlabs.principle.dip.Solution1.errorlog.EmailErrorLog;
import com.techlabs.principle.dip.Solution1.errorlog.XmlErrorLog;
import com.techlabs.principle.dip.Solution1.logtype.LogType;

public class TaxCalculator {
	//Ivars
	private LogType logType;
	
	//constructor
	public TaxCalculator(LogType currentLogType){
		logType = currentLogType;
	}
	
	//method
	public double calculate(int a,int b){
		try{
		return a/b;
		}
		catch(Exception ex){
			if(logType == LogType.EMAIL_ERROR_LOG){
				EmailErrorLog logError = new EmailErrorLog();
				logError.handleError("Attempt to Divide by Zero");
			}
			if(logType == LogType.XML_ERROR_LOG){
				XmlErrorLog logError = new XmlErrorLog();
				logError.handleError("Attempt to Divide by Zero");
				
			}
			
		}
		return 0;
	}

}
