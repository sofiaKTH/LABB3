package javafxapplication5;


import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
/**
 *
 * @author sofia
 */
public class Line extends Shape{
    private double x2,y2;
    
    public Line() {
        super(0.0,0.0,Color.GREEN);
        x2=10;
        y2=30;
    }
    public Line(double x1, double y1, double x2, double y2, Color color) {
        super(x1,y1,color);
        this.x2=x2;
        this.y2=y2;
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
    public void paint (GraphicsContext gc) {
 
        gc.setStroke(getColor());
        gc.setLineWidth(5);
        gc.strokeLine(getX(),getY(),x2,y2);
        
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
    

