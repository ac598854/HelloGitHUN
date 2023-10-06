package xxx;

import java.util.Scanner;

public class Idnumber {
	
	public static void main(String[] args) {
		String id="^[A-Za-z][12]\\d{8}$";
		Scanner sc = new Scanner(System.in);
		
		String idnumber=sc.next().toUpperCase();
		if(idnumber.matches(id)) {
			System.out.println("ok");
		}else {
				System.out.println("No good.....");
			}
		sc.close();
		}
	}

