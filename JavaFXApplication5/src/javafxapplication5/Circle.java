
package javafxapplication5;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *makes a circle
 * 
 */
public class Circle extends FillableShape{
    
    private double diameter;

    public Circle(double x, double y,boolean filled, double diameter, Color color){
        super(filled, x, y, color);
        this.diameter=diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
        

    @Override
    public void constrain(double boxX, double boxY, 
            double boxWidth, double boxHeight){
        double newDx,newDy;
        // If outside the box - calculate new dx and dy
        if (getX() < boxX || getX()+getDiameter()< boxX) {
             newDx = Math.abs(getDx());
             newDy = Math.abs(getDy());
            setVelocity(newDy, newDy);
            
        } else if (getX()> boxWidth || getX()+getDiameter() > boxWidth) {
            newDx = -Math.abs(getDx());
            newDy = -Math.abs(getDy());
            setVelocity(newDy, newDy);
        }
        if (getY() < boxY || getY()+getDiameter()< boxY) {
            newDx = Math.abs(getDx());
            newDy = Math.abs(getDy());
            setVelocity(newDy, newDy);
        } else if (getY()> boxHeight || getY()+getDiameter() > boxHeight) {
            newDx = -Math.abs(getDx());
            newDy = -Math.abs(getDy());
            setVelocity(newDy, newDy);
        }
    }
        
    
    @Override
    public void paint(GraphicsContext gc) {
        if(isFilled()){   
            gc.setFill(getColor());
            gc.fillOval(getX(), getY(), getDiameter(), getDiameter());
        }
        gc.setStroke(getColor());
        gc.strokeOval(getX(), getY(), getDiameter(), getDiameter());
        gc.setLineWidth(3.0);
    }

    @Override
    public String toString() {
        return "Circle{" + '}';
    }
   
    
}

