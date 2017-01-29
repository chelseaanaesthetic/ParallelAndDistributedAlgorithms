package com.abc.draw.geometry;

import java.awt.*;

import com.abc.draw.*;

public class Rectangle implements Drawable {

    private Point upperLeft;
    private double width;
    private double height;

    public Rectangle(Point upperLeft, double width, double height) {
        this.upperLeft = upperLeft;
        this.width = width;
        this.height = height;
    }

    public Point getUpperLeft() {
        return upperLeft;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void draw(Graphics2D g2) {
        Point p2 = (new Point(upperLeft.getX()+width, upperLeft.getY()));
        Point p3 = (new Point(upperLeft.getX()+width, upperLeft.getY()+height));
        Point p4 = (new Point(upperLeft.getX(), upperLeft.getY()+height));

        (new Line(upperLeft, p2)).draw(g2);
        (new Line(p2, p3)).draw(g2);
        (new Line(p3, p4)).draw(g2);
        (new Line(p4, upperLeft)).draw(g2);
    }

}
