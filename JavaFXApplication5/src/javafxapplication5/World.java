package javafxapplication5;

 // TODO: Change to your package name

import javafx.scene.paint.Color;

/**
 * A representation of a world containing a set of moving shapes. NB! The worlds
 * y-axis points downward.
 *
 * @author Anders Lindström, anderslm@kth.se 2020-09-15
 */
public class World {

    private double width, height; // this worlds width and height

    private final Shape[] shapes; // an array of references to the shapes

    /**
     * Creates a new world, containing a pad and a set of balls. NB! The worlds
     * y-axis points downward.
     *
     * @param width the width of this world
     * @param height the height of this world
     */
    public World(double width, double height) {
        this.width = width;
        this.height = height;

        shapes = new Shape[5]; // an array of references (change to non-zero size)
        shapes[0]= new Line(0.0,0.0,70.0,70.0,Color.AQUA);// Create the actual Shape objects (sub types)
        shapes[0].setVelocity(10.0, 20.0);
        shapes[1] = new Line(1.1,1.1,50.0,50.0,Color.CHARTREUSE);
        shapes[1].setVelocity(20.0, 40.0);
        shapes[2]= new Rectangle(3.0,5.0, false,20.0,40.0, Color.AQUAMARINE);
        shapes[2].setVelocity(50.0, 60.0);
        shapes[3]= new Circle(90.0,6.0, false, 60.0, Color.PINK);
        shapes[3].setVelocity(100.0, 50.0);
        shapes[4]= new Circle(90.0,90.0, true, 30.0, Color.RED);
        shapes[4].setVelocity(50.0, 50.0);
        for(int i = 0; i<5; i++){
            if(shapes[i] instanceof FillableShape){
                FillableShape f =(FillableShape) shapes[i];
                if(f.isFilled()){
                    f.setFilled(false);
                }
                else{
                    f.setFilled(true);
                }
            }
         }
    }

    /**
     * Sets the new dimensions, in pixels, for this world. The method could be
     * used for example when the canvas is reshaped.
     *
     * @param newWidth
     * @param newHeight
     */
    public void setDimensions(double newWidth, double newHeight) {
        this.width = newWidth;
        this.height = newHeight;
    }

    /**
     * Move the world one step, based on the time elapsed since last move.
     *
     * @param elapsedTimeNs the elapsed time in nanoseconds
     */
    public void move(long elapsedTimeNs) {
        // alterantive loop: for(Shape s : shapes) { ...
        for (int i = 0; i < shapes.length; i++) { 
            shapes[i].move(elapsedTimeNs);
            shapes[i].constrain(0, 0, width, height);
        }
    }

    /**
     * Returns a copy of the list of ball references.
     * Due to the implementation of clone, a shallow copy is returned.
     *
     * @return a copy of the list of balls
     */
    public Shape[] getShapes() {
        return (Shape[]) shapes.clone();
    }
}
