package xxx;
public class Plane implements Weightable{
	private String kind;     // 種類
	private double weight;
	
	public void printWeightTool() {
		System.out.println("地磅");
	}
	public Plane() {
		super();
	}

	public Plane(String kind, double weight) {
		super();
		this.kind = kind;
		this.weight = weight;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public double getWeight() {
//		System.out.println(weight);
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	
	
}
