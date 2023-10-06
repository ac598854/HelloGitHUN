package xxx;

public class Cube {
	private double length;
	public Cube() {
		
	}
	public Cube(double length) throws CubeException{
		setter(length);
	}
	public void setter(double length) throws CubeException{
		if(length>0) 
				this.length=length;
		else 
			throw new CubeException("邊長必須為正數");
	}
	public double getter(){
		return length;
	}
	public double cubeVolume() {
		return Math.pow(length, 3);
	}
}
