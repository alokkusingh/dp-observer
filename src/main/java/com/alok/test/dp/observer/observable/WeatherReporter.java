package com.alok.test.dp.observer.observable;

import java.util.Observable;

import org.springframework.stereotype.Component;

@Component
public class WeatherReporter extends Observable {
	
	public WeatherReporter() {
		super();
		System.out.println("WeatherReporter::constructor");
	}
	
	public void changeWeatherData() {
		System.out.println("WeatherReporter: broadcasting weather change");
		this.setChanged();
		this.notifyObservers();
	}
}
