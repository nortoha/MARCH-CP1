package week13;

public class SimpleRectangle extends SimpleShape {
	
	private int width;
	private int length;

	@Override
	public double findArea() {
		return length * width;
	}

	@Override
	public double findCircumference() {
		return (2*length) + (2*width);
	}


 
}
