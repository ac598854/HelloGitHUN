package HomeWork10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HW10_3 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        SimpleDateFormat sdfd = new SimpleDateFormat("yyyyMMdd");

	        System.out.println("請輸入日期（年月日，例如: 20110131）:");
	        String inputDate = sc.next();
	        try {
	            Date date = sdfd.parse(inputDate);

	            System.out.println("欲格式化成(1) 年/月/日(2) 月/日/年(3) 日/月/年");
	           
	            int number = sc.nextInt();
	            SimpleDateFormat sdfn;
	            sc.close();
	            switch (number) {
	                case 1:
	                	sdfn = new SimpleDateFormat("yyyy/MM/dd");
	                	System.out.println("年/月/日：" + sdfn.format(date));
	                    return;
	                case 2:
	                	sdfn = new SimpleDateFormat("MM/dd/yyyy");
	                	System.out.println("月/日/年：" + sdfn.format(date));
	                    return;
	                case 3:
	                	sdfn = new SimpleDateFormat("dd/MM/yyyy");
	                	System.out.println("日/月/年：" + sdfn.format(date));
	                    return;
	                default:
	                    System.out.println("請輸入1到3!");
	                    return;
	            }

	            
	        } catch (ParseException e) {
	            System.out.println("日期不正確，請再輸入一次！");
	        }
	    }
	}

