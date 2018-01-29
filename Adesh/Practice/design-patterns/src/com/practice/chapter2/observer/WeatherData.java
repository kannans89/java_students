package com.practice.chapter2.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

	private float temp;
	private float humidity;
	private float pressure;
	private List<Observer> observers;
	
	public WeatherData(){
		observers = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i >= 0){
			observers.remove(i);
		}
	}

	public void notifyObserver() {
		for(Observer x:observers){
			x.update(temp, humidity, pressure);
		}
	}

	public float getTemp() {
		return temp;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
	
	public void measurementsChanged(){
		notifyObserver();
	}
	
	public void setMeasurements(float temp, float humidity, float pressure){
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}
