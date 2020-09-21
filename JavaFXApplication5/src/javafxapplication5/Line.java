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
        x2=10;
        y2=30;
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
 
        gc.setStroke(Color.BLUE);
 
        gc.strokeLine(40, 10, 10, 40);

  
        gc.fillArc(10, 110, 30, 30, 45, 240, ArcType.OPEN);
        gc.fillArc(60, 110, 30, 30, 45, 240, ArcType.CHORD);
        gc.fillArc(110, 110, 30, 30, 45, 240, ArcType.ROUND);
        gc.strokeArc(10, 160, 30, 30, 45, 240, ArcType.OPEN);
        gc.strokeArc(60, 160, 30, 30, 45, 240, ArcType.CHORD);
        gc.strokeArc(110, 160, 30, 30, 45, 240, ArcType.ROUND);
        gc.fillPolygon(new double[]{10, 40, 10, 40},
                       new double[]{210, 210, 240, 240}, 4);
        gc.strokePolygon(new double[]{60, 90, 60, 90},
                         new double[]{210, 210, 240, 240}, 4);
        gc.strokePolyline(new double[]{110, 140, 110, 140},
                          new double[]{210, 210, 240, 240}, 4);
        
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
    

