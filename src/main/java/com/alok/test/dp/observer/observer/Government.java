package com.alok.test.dp.observer.observer;

import java.util.Observable;
import java.util.Observer;

import com.alok.test.dp.observer.observable.WeatherReporter;

public class Government implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		
		if (o instanceof WeatherReporter) {
			System.out.println("Government :: weather update received");
		}
	}
}
