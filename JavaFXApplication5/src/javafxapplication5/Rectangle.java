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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
     public void constrain(
            double boxX, double boxY, 
            double boxWidth, double boxHeight) {
        // If outside the box - calculate new dx and dy
       /* if (x < boxX) {
            dx = Math.abs(dx);
        } else if (x > boxWidth) {
            dx = -Math.abs(dx);
        }
        if (y < boxY) {
            dy = Math.abs(dy);
        } else if (y > boxHeight) {
            dy = -Math.abs(dy);
        }*/
    }
    
}
