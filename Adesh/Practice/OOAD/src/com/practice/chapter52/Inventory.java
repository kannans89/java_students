package com.practice.chapter52;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	@SuppressWarnings("rawtypes")
	private List inventory;

	@SuppressWarnings("rawtypes")
	public Inventory() {
		inventory = new LinkedList();
	}

	@SuppressWarnings("unchecked")
	public void addInstrument(String serialNumber, double price,
			InstrumentSpec spec) {
		Instrument instrument = new Instrument(serialNumber, price, spec);
		inventory.add(instrument);
	}

	@SuppressWarnings("rawtypes")
	public Instrument get(String serialNumber) {
		for (Iterator i = inventory.iterator(); i.hasNext();) {
			Instrument instrument = (Instrument) i.next();
			if (instrument.getSerialNumber().equals(serialNumber)) {
				return instrument;
			}
		}
		return null;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List search(InstrumentSpec searchSpec) {
		List matchingInstruments = new LinkedList();
		for (Iterator i = inventory.iterator(); i.hasNext();) {
			Instrument instrument = (Instrument) i.next();
			if (instrument.getSpec().matches(searchSpec))
				matchingInstruments.add(instrument);
		}
		return matchingInstruments;
	}
}