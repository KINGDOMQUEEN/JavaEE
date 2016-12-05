package com.thefg;


public class test {

	private int a = 3;
	private String b = "bb";
	public int panduan() {
		this.a = b.equals("bbb")?3:4;
		return (this.a==4)?2:1;
	}
	public static void main(String[] args) throws NumberFormatException{
		
		System.out.println((4==3)?2:1);
		System.out.println((new test()).panduan());
		System.out.println(Integer.toBinaryString(-3));
		System.out.println(Integer.toString(-3,2));
		System.out.println(Integer.parseInt("1e", 15));
		System.out.println(Integer.parseInt("1010", 2));
		//System.out.println(Integer.parseInt("1.2", 2));
		System.out.println(3/0);
	}

}
