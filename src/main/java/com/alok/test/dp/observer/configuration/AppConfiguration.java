package com.alok.test.dp.observer.configuration;

import java.util.Observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alok.test.dp.observer.observable.WeatherReporter;
import com.alok.test.dp.observer.observer.DRTeam;
import com.alok.test.dp.observer.observer.Government;

@Configuration
public class AppConfiguration {
	
	@Autowired
	WeatherReporter weatherReporter;
	
	@Bean("drTeam")
	public Observer getDRTeamBean() {
		Observer observer = new DRTeam();
		
		weatherReporter.addObserver(observer);
		
		return observer;
		
	}
	
	@Bean("government")
	public Observer getGovernmentBean() {
		Observer observer = new Government();
		
		weatherReporter.addObserver(observer);
		
		return observer;
		
	}

}
