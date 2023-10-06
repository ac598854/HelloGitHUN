package xxx;

public class CubeTest {
	public static void main(String[] args) {
		try {
		Cube x=new Cube();
		x.setter(6);
		System.out.println(x.cubeVolume());
		}catch(CubeException e) {
			e.printStackTrace();
		}
	}
}

