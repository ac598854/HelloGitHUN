package xxx;

public class MyRectangle5_4 {
	private double width;
	private double depth;
	void setWidth(double width) {
		this.width=width;
	}
	void setDepth(double depth) {
		this.depth=depth;
	}
	double getArea() {
		System.out.println(width*depth);
		return width*depth;
	}
	public MyRectangle5_4() {
		
	}
	public MyRectangle5_4(double width,double depth) {
		this.width=width;
		this.depth=depth;
	}
}
