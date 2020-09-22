/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication5;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *
 * @author nadri
 */
public class Rectangle extends FillableShape{
private double With, height;

    public Rectangle(double With, double height, boolean filled, double x, double y, Color color) {
        super(filled, x, y, color);
        this.With = With;
        this.height = height;
    }

    public double getWith() {
        return With;
    }

    public double getHeight() {
        return height;
    }

    public void setWith(double With) {
        this.With = With;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    
    @Override
    public void paint(GraphicsContext gc) {
        if(isFilled()){   
            gc.setFill(getColor());
            gc.fillRect(getX(), getY(), getWith() , getHeight());
        }
        /*else{
            gc.setFill(Color.WHITE);
        } */   
        gc.setStroke(getColor());
        gc.strokeRect(getX(), getY(), getWith(), getHeight());
        gc.setLineWidth(5.0);
            
    }
    
    @Override
     public void constrain(
            double boxX, double boxY, 
            double boxWidth, double boxHeight) {
        // If outside the box - calculate new dx and dy
        if (getX() < boxX || getX()+getWith()< boxX) {
            double newDx = Math.abs(super.getDx());
            double newDy = Math.abs(super.getDy());
            super.setVelocity(newDy, newDy);
            
        } else if (getX()> boxWidth || getX()+getWith() > boxWidth) {
            double newDx = -Math.abs(super.getDx());
            double newDy = -Math.abs(super.getDy());
            super.setVelocity(newDy, newDy);
        }
        if (getY() < boxY || getY()+getHeight()< boxY) {
            double newDx = Math.abs(super.getDx());
            double newDy = Math.abs(super.getDy());
            super.setVelocity(newDy, newDy);
        } else if (getY()> boxHeight || getY()+getHeight() > boxHeight) {
            double newDx = -Math.abs(super.getDx());
            double newDy = -Math.abs(super.getDy());
            super.setVelocity(newDy, newDy);
        }
    }

    @Override
    public String toString() {
        String s="";
        return s;
    }
    

}
