package com.techlabs.user;

public class User {
	private final String fName; //required
	private final String lName; //required
	private final int age;	//optional		
	private final String address; //optional
	private User(UserBuilder builder){
		this.fName = builder.fName;
		this.lName = builder.lName;
		this.age = builder.age;
		this.address = builder.address;
	}
	public String getfName() {
		return fName;
	}
	public String getlName() {
		return lName;
	}
	public int getAge() {
		return age;
	}
	public String getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "User:" + fName + "," + lName
				+ "," + age + "," + address;
	}
	public static class UserBuilder{
		private final String fName;
		private final String lName; 
		private int age;		
		private String address; 

		public UserBuilder(String fName,String lName) {
			// TODO Auto-generated constructor stub
			this.fName = fName;
			this.lName = lName;
		}
		public UserBuilder age(int age){
			this.age = age;
			return this;
		}
		public UserBuilder address(String address){
			this.address = address;
			return this;
		}
		
		public User build(){
			User user = new User(this);
			return user;
		}
	}
}
