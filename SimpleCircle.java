package week13;

/**
 * 
 * @author YOUR NAME HERE
 * @date 11/29/2018
 *
 */
public class SimpleCircle extends SimpleShape{

	public SimpleCircle() {
		// default constructor
	}
	
	public SimpleCircle(int r) {
		this.radius = r;
	}
	
	
    // variable to the circle's radius
    private double radius;
    private String uom;

    /*
     * Returns the area of this circle
     */
    public double findArea() {
        return radius * radius * Math.PI;
    }
    
    /*
     * Returns the circumference of this circle
     */
    public double findCircumference(){
    	return 2 * radius * Math.PI;
    }
    
    /*
     * Returns the diameter of this circle
     */
    public double findDiameter() {
    	return radius * 2;
    }
    
    public void setRadius(double r){
        this.radius = r;
    }
    
    public double getRadius(){
        return this.radius;
    }
}
