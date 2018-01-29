package com.techlabs.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.BinaryFileReader;
import com.techlabs.CSVFileWriter;
import com.techlabs.model.Contact;

@SuppressWarnings({ "serial" })
public class CustomerAction extends ActionSupport implements
		ModelDriven<CustomerVeiwModel> {
	CustomerVeiwModel model;
	CSVFileWriter cfw ;
	BinaryFileReader bfr;
	public CustomerAction(){
	}
	@Override
	public void validate(){
		if(model.getCont().getFirstName().length()<1)
			addFieldError("cont.firstName","First Name can't be blank");
	if(model.getCont().getLastName().length()<1)
		addFieldError("cont.lastName","Last Name can't be blank");
	if(model.getCont().getAddress().length()<1)
		addFieldError("cont.address","Address can't be blank");
	if(model.getCont().getMobile().length()<1)
			addFieldError("cont.mobile","Mobile No. can't be blank");
	}
		@Override
	public String execute() throws Exception {
		bfr = new BinaryFileReader(model.getList());
		cfw = new CSVFileWriter(model.getList());
		System.out.println("execute");
		model.setList(bfr.readFile());
		System.out.println("read" + model.getList().size());
		model.getList().add(model.getCont());
		for (Contact c : model.getList()) {
			System.out.println(c.getFirstName());
		}
		System.out.println("add" + model.getCont().getFirstName());
		cfw.fileWriter(model.getList());
		System.out.println("fileWrite");
		return SUCCESS;
	}

	public CustomerVeiwModel getModel() {
		model = new CustomerVeiwModel();
		return model;
	}
}