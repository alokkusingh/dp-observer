package com.alok.test.dp.observer.observer;

import java.util.Observable;
import java.util.Observer;

public class DRTeam implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("DRTeam :: weather update received");
	}
}
