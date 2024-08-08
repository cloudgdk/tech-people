package java_inheritence;

import java.util.ArrayList;
import java.util.List;

public class CalcMain {

	public static void main(String[] args) {
		Calc cal = new Calc();
		int r1 =cal.add(1, 1);
		int r2 =cal.add(1, 2, 1);
		int r3 =cal.add(1, 2, 1, 1);
		System.out.println(r1+r2+r3);
		
		String r4 = cal.add("JaiSri", "Ram");
		System.out.println(r4);
	
		
		

	}

}
