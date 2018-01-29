package com.practice.chapter2.observer;

public class StatisticsDisplay implements Observer, DisplayElement{

	private float tempSum = 0.0f;
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float numReadings;
	private Subject weatherData;
	
	public StatisticsDisplay(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temp, float humidity, float pressure) {
		tempSum = tempSum + temp;
		numReadings++;
		
		if(temp > maxTemp){
			maxTemp = temp;
		}
		
		if(temp < minTemp){
			minTemp = temp;
		}
		display();
	}
	
	public void display() {
		System.out.println("Avg/max/min temperature : "+(tempSum / numReadings)+"/"+maxTemp+"/"+minTemp);
	}
}
