
package javafxapplication5;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;


public class Rectangle extends FillableShape{
private double With, height;

    public Rectangle(double x, double y, boolean filled, double With, double height, Color color) {
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
          
        gc.setStroke(getColor());
        gc.strokeRect(getX(), getY(), getWith(), getHeight());
        gc.setLineWidth(5.0);
            
    }
    
    @Override
     public void constrain(
            double boxX, double boxY, 
            double boxWidth, double boxHeight) {
         double newDx,newDy;
        // If outside the box - calculate new dx and dy
        if (getX() < boxX || getX()+getWith()< boxX) {
             newDx = Math.abs(getDx());
             newDy = Math.abs(getDy());
            setVelocity(newDy, newDy);
            
        } else if (getX()> boxWidth || getX()+getWith() > boxWidth) {
            newDx = -Math.abs(getDx());
            newDy = -Math.abs(getDy());
            setVelocity(newDy, newDy);
        }
        if (getY() < boxY || getY()+getHeight()< boxY) {
            newDx = Math.abs(getDx());
            newDy = Math.abs(getDy());
            setVelocity(newDy, newDy);
        } else if (getY()> boxHeight || getY()+getHeight() > boxHeight) {
            newDx = -Math.abs(getDx());
            newDy = -Math.abs(getDy());
            setVelocity(newDy, newDy);
        }
    }

    @Override
    public String toString() {
        String s="";
        return s;
    }
    

}
