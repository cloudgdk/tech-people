package com;

public class DataTMain {

	public static void main(String[] args) {
		
		DataT d1 = new DataT();
		int Value = d1.IntD(5, 5);
		long Valued = d1.longD(1000000, 1000000);
		System.out.println(Value + Valued);

	}

}
