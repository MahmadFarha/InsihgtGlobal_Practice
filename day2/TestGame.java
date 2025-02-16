package com.insight.day2;

public class TestGame {

	public static void main(String[] args) {
		Game[] games=new Game[5];
		games[0]=new cricket();
		games[1]=new football();
		games[2]=new tennis();
		games[3]=new cricket();
		games[4]=new football();

		for(Game game:games) {
			game.displayInfo();
		}

	}

}
