
package javafxapplication5;

import javafx.scene.paint.Color;


abstract public class FillableShape extends Shape{
    
    private boolean filled;

    protected FillableShape(boolean filled, double x, double y, Color color) {
        super(x, y, color);
        this.filled = filled;
    }


   public boolean isFilled(){
       return filled;
   }
   
   public void setFilled(boolean filled){
       this.filled=filled;
   }
    
}
