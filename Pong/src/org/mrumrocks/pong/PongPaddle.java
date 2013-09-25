package org.mrumrocks.pong;

import jgame.Context;
import jgame.GObject;
import jgame.GSprite;
import jgame.ImageCache;
import jgame.controller.ControlScheme;
import jgame.controller.KeyboardLocationController;
import jgame.listener.ParentBoundsListener;

public class PongPaddle extends GSprite {
	
	public PongPaddle(ControlScheme cs) {
		super(ImageCache.forClass(Pong.class).get("paddle.png"));
	
		KeyboardLocationController klc = new KeyboardLocationController(cs, 10);
		addController(klc);
		klc.setHorizontalAllowed(false);
		
		ParentBoundsListener limiter = new ParentBoundsListener() {
		    public void invoke1(GObject target, Context context) {

		    	double parentHeight = getParent().getHeight();
		        double y = getY();
		        double h = getHeight() * getScaleY();
		        
		        if (y > parentHeight / 2) {
		            setY(parentHeight - h / 2);
		        } else {
		            setY(h / 2);
		        }
		    }

			@Override
			public void invoke(GObject target, Context context) {
				// TODO Auto-generated method stub
				
			}
		};

		limiter.setValidateHorizontal(false);
		addListener(limiter);
	}
}
