/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication5;

import javafx.scene.paint.Color;

/**
 *
 * @author nadri
 */
abstract public class FillableShape extends Shape{
    
    private boolean filled;

    protected FillableShape(boolean filled, double x, double y, Color color) {
        super(x, y, color);
        this.filled = filled;
    }

    protected FillableShape() {
        
    }

   public boolean isFilled(){
       return filled;
   }
   
   public void setFilled(boolean filled){
       this.filled=filled;
   }
    
}
