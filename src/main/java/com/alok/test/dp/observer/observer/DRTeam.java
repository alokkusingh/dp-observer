package com.alok.test.dp.observer.observer;

import java.util.Observable;
import java.util.Observer;

import com.alok.test.dp.observer.observable.WeatherReporter;

public class DRTeam implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherReporter) {
			System.out.println("DRTeam :: weather update received");
		}
	}
	
	public void init() {
		System.out.println("DRTeam::init");
	}
	
	public void destroy() {
		System.out.println("DRTeam::destroy");
	}
}
