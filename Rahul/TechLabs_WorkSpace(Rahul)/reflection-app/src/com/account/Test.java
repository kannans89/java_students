package com.account;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
  String stringValue();

  int intValue();
}

@Retention(RetentionPolicy.RUNTIME)
@interface What {
  String description();
}

public class Test {
	
	public static void main(String[] args) throws Exception {
	  
	Class<Account> account=  Account.class;
	
	System.out.println(account.getDeclaredMethod("toString").getAnnotations().length);
	
	
	}

}
