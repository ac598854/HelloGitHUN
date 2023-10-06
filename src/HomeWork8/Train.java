package HomeWork8;


public class Train implements Comparable<Train>{
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;
//	班次 number,型別為int - 車種 type,型別為String - 出發地 start,型別為String
//	  - 目的地 dest,型別為String - 票價 price,型別為double
	public Train() {
		
	}
	
	public Train(int number,String type,String start,String dest,double price) {
		super();
	  this.number = number;
	  this.type = type;
	  this.start = start;
	  this.dest = dest;
	  this.price = price;
  }
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStart() {
		return start;
	}
	public void setstart(String start) {
		this.start = start;
	}
	public String getdest() {
		return dest;
	}
	public void setdest(String dest) {
		this.dest = dest;
	}
	public double getprice() {
		return price;
	}
	public void setprice(double price) {
		this.price = price;
	}
	
	public String toString() {
	    return "班次: " + number + ", 車種: " + type + ", 出發地: " + start + ", 目的地: " + dest + ", 票價: " + price;
	}

@Override
public int compareTo(Train aTrain) {
	if (this.number>aTrain.number) {
		return 1;
	}else if(this.number<aTrain.number){
		return -1;
	}else {
        return this.type.compareTo(aTrain.type);
    }
}
	
public boolean equals(Object obj) {
	if(this==obj)
		return true;
	if(obj!=null&&this.getClass()==obj.getClass()) {
		Train t=(Train) obj;
		if(this.number==t.number&&this.type.equals(t.type)) {
			return true;
		}
	}
	return false;
}

public int hashCode() {
	final int prime=31;
	int result=1;
	result=result*prime+number;
	result=result*prime+(type==null?0:type.hashCode());   
	return result;
}
}
