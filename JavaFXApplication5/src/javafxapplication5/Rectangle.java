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
    
    public void constrain(){
        
    }
    
}
