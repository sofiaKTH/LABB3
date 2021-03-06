package javafxapplication5;


import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;


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
        this.x2=x2;
    }
    public void setY2(double y2) {
        this.y2=y2;
    }
    
    @Override
    public void paint (GraphicsContext gc) {
 
        gc.setStroke(getColor());
        gc.setLineWidth(5);
        gc.strokeLine(getX(),getY(),x2,y2);
        
    }
    @Override
    public void constrain (double boxX, double boxY, 
            double boxWidth, double boxHeight) {
        // If outside the box - calculate new dx and dy
        double dx,dy;
        if (getX() < boxX || x2 < boxX) {
            dx = Math.abs(super.getDx());
            dy = Math.abs(super.getDy());
            super.setVelocity(dx, dy);
        } else if (getX() > boxWidth || x2 > boxWidth) {
            dx = -Math.abs(getDx());
            dy = -Math.abs(getDy());
            super.setVelocity(dx, dy);
        }
        if (getY() < boxY || y2 < boxY) {
            dx = Math.abs(super.getDx());
            dy = Math.abs(super.getDy());
            super.setVelocity(dx, dy);
        } else if (getY() > boxHeight || y2 > boxHeight) {
            dx = -Math.abs(getDx());
            dy = -Math.abs(getDy());
            super.setVelocity(dx, dy);
        }
    }
    @Override
    public void move(long elapsedTimeNs) {
        double newX1,newY1;
        newX1 = getX() + getDx() * elapsedTimeNs / BILLION;
        setX(newX1);
        newY1 = getY() + getDy() * elapsedTimeNs / BILLION;
        setY(newY1);
        x2 += getDx() * elapsedTimeNs / BILLION;
        y2 += getDy() * elapsedTimeNs / BILLION;
    }
    
    @Override
    public String toString() {
        String S="";
        return S;
    }
}
    

