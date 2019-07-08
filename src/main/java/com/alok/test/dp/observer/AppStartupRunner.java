package com.alok.test.dp.observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.alok.test.dp.observer.observable.WeatherReporter;

@Component
public class AppStartupRunner implements ApplicationRunner {

	@Autowired
	WeatherReporter weatherReporter;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		weatherReporter.changeWeatherData();
	}
}
