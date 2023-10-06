package HomeWork8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection {
	public static void main(String[] args) {
		List coll = new ArrayList();
		coll.add(new Integer(100));
		coll.add(new Double(3.14));
		coll.add(new Long(21L));
		coll.add(new Short("100"));
		coll.add(new Double(5.1));
		coll.add("Kitty");
		coll.add(new Integer(100));
		coll.add(new Object());
		coll.add("Snoopy");
		coll.add(new BigInteger("1000"));
		System.out.println("=============Iterator================");
		Iterator iter =coll.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next()); 
		}
		System.out.println("===============for============");
		for(int i = 0; i < coll.size(); i++) {
			System.out.println(coll.get(i));
		}
		System.out.println("===============foreach=============");
		for(Object xx : coll) {
			System.out.println(xx);
		}
		System.out.println("==============移除Number類別以外的=================");
		Iterator iterremove =coll.iterator();
		while(iterremove.hasNext()) {
			if(!(iterremove.next() instanceof Number)) {
				iterremove.remove();
			}
		}
		Iterator afterremove =coll.iterator();
		while(afterremove.hasNext()) {
			System.out.println(afterremove.next());
		}
		
		
	}
}
