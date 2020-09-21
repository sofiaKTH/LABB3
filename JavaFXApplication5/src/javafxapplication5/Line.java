package javafxapplication5;


import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author sofia
 */
public class Line extends Shape{
    private double x2,y2;
    
    public Line() {
        x2=1;
        y2=1;
    }
    public double getX2(){
        return x2;
    }
    public double getY2() {
        return y2;
    }
    public void setX2(double x2) {
        if(x2<=0) {
            this.x2=1;
        }
        else this.x2=x2;
    }
    public void setY2(double y2) {
        if(y2<=0) {
            this.y2=1;
        }
        else this.y2=y2;
    }
    
    @Override
    public void paint (GraphicsContext g) {
    }
    @Override
    public void constrain (double d1, double d2, double d3, double d4) {
        
    }
    @Override
    public String toString() {
        String S="";
        return S;
    }
}
    

