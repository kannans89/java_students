package com;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.util.ValueStack;

public class MyInterceptor implements Interceptor{

	public void init() {}
	public String intercept(ActionInvocation ai) throws Exception {
		ValueStack stack=ai.getStack();
		String s=stack.findString("name");
		stack.set("name",s.toUpperCase());
		System.out.println(s);
		if(s.length()<5){
			System.out.println("log");
			return "log";
		}
		else
		return ai.invoke();
	}
	public void destroy() {}
}
