package com.abc.draw;

import java.awt.*;
import java.util.*;

public class Drawing extends Object {
    private ArrayList<Drawable> drawables;

	public Drawing() {
        drawables = new ArrayList<>();
	}

	public void drawAll(Graphics2D g2) {
	    for (Drawable d : drawables) {
	        d.draw(g2);
	    }
	}

	public void append(Drawable drawable) {
	    drawables.add(drawable);
	}
}
