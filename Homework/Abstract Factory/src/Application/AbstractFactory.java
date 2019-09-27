package Application;
/**
 * Abstract Factory
 */
public abstract class AbstractFactory {
    abstract GeometricShape getShape(ShapeType name);
}