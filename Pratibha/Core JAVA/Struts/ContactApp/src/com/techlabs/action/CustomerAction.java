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
	CSVFileWriter cfw = new CSVFileWriter(model.getList());
	BinaryFileReader bfr = new BinaryFileReader(model.getList());

	@Override
	public String execute() throws Exception {
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