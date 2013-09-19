package org.mrumrocks.pong;

import jgame.GContainer;
import jgame.controller.ControlScheme;

public class PongGameView extends GContainer {
	public PongGameView(){
		setSize(640, 480);
		
        PongPaddle paddle = new PongPaddle(ControlScheme.WASD);
        add(paddle);
		
        paddle.setLocation(50, 480/2);
        
        PongPuck puck= new PongPuck();
		addAtCenter(puck);
		
		PongPaddle paddle2 = new PongPaddle(ControlScheme.IJKL);
		add(paddle2);
		paddle2.setLocation(640-50, 480/2);
	}
}
