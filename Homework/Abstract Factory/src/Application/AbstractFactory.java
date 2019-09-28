package Application;
/**
 * Abstract Factory para llamar a una Factory y crear un objeto
 */
public abstract class AbstractFactory {
    abstract GeometricShape getShape(ShapeType name);
}