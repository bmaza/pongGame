package org.mrumrocks.pong;

import jgame.GSprite;
import jgame.ImageCache;
import jgame.controller.ControlScheme;
import jgame.controller.KeyboardLocationController;

public class PongPaddle extends GSprite {
	public PongPaddle(ControlScheme cs) {
		super(ImageCache.forClass(Pong.class).get("paddle.png"));
	
		KeyboardLocationController klc = new KeyboardLocationController(
				cs, 10);
		addController(klc);
		klc.setHorizontalAllowed(false);
		
		
	}

}
