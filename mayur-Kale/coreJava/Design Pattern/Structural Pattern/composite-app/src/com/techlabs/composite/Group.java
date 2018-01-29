package com.techlabs.composite;

import java.util.ArrayList;
import java.util.List;

public class Group implements IGraphicObject {

	private final List<IGraphicObject> list;
	private String groupName;

	public Group(String gName) {
		list = new ArrayList<IGraphicObject>();
		this.groupName = gName;
	}

	public void add(IGraphicObject object) {
		list.add(object);
	}

	@Override
	public void draw() {
		
		System.out.println(groupName + ">");
		for (IGraphicObject iGraphicObject : list) {
			iGraphicObject.draw();

		}
	}

}
