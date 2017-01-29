package com.abc.draw.geometry;

import java.awt.*;

import com.abc.draw.*;

public class Square extends Rectangle implements Drawable {

    public Square(Point upperLeft, double width) {
        super(upperLeft, width, width);
    }

    @Override
    public Point getUpperLeft() {
        return super.getUpperLeft();
    }

    @Override
    public double getWidth() {
        return super.getWidth();
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void draw(Graphics2D g2) {
        super.draw(g2);
    }
}
