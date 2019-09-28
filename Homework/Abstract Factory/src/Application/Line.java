package Application;
/**
 * Una linea que se puede crear usando el Abstract Factory mediante la 2DShapeFactory
 */
public class Line implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Line Drawn.");
    }
}

