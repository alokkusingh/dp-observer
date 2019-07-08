package com.alok.test.dp.observer.observer;

import java.util.Observable;
import java.util.Observer;

public class Government implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Government :: weather update received");
	}
}
