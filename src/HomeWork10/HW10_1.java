package HomeWork10;

import java.util.Random;

public class HW10_1 {
	
		    public static void main(String[] args) {
		        Random random = new Random();

		        System.out.println("生成的隨機整數：");
		        for (int i = 0; i < 5; i++) {
		            int randomNumber = random.nextInt(100) + 1; // 生成介於 1 到 100 之間的整數

		            if (isPrime(randomNumber)) {
		                System.out.println(randomNumber + " 是質數");
		            } else {
		                System.out.println(randomNumber + " 不是質數");
		            }
		        }
		    }

		    // 檢查一個整數是否為質數的輔助函數
		    public static boolean isPrime(int number) {
		        if (number <= 1) {
		            return false;
		        }

		        if (number <= 3) {
		            return true;
		        }

		        if (number % 2 == 0 || number % 3 == 0) {
		            return false;
		        }

		        for (int i = 5; i * i <= number; i += 6) {
		            if (number % i == 0 || number % (i + 2) == 0) {
		                return false;
		            }
		        }

		        return true;
		    }
		}


