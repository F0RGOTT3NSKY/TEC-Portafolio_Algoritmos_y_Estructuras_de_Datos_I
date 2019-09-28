package Application;
/**
 * Una Esfera que se puede crear usando el Abstract Factory mediante la 3DShapeFactory
 */
public class Sphere implements GeometricShape{
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Sphere drawn.");
	}

}
