package org.mrumrocks.pong;

import java.awt.Color;

import jgame.GRootContainer;
import jgame.Game;
import jgame.ImageCache;

public class Pong extends Game{
	
	public enum View{
		GAME, GAME_OVER;
	}
	
	/**
	 * @param args
	 */
	public static void main(String args[]){
		//create a root container
		//assign the root container with setRootContainer
		//set up the components (paddles, etc.)
		ImageCache.create(Pong.class, "/pong/rsc/");
		//TODO Auto-generated method stub
		Pong pongGame = new Pong();
		pongGame.startGame("Pong");
	}
	
	public Pong () {
		
		GRootContainer root = new GRootContainer(Color.BLACK);
		setRootContainer(root);
		
		PongGameView gameView = new PongGameView();
		root.addView(View.GAME, gameView);
		
		GameOverView gameOverView = new GameOverView();
		root.addView(View.GAME_OVER, gameOverView);
		
		
	}

}
