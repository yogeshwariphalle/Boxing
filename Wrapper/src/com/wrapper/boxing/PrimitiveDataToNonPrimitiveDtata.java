package com.wrapper.boxing; 

public class PrimitiveDataToNonPrimitiveDtata {
	public static void main(String[] args) {
		// Primitive Data Types into Non Primitive Data Types
		int a = 25;
		Integer obj = Integer.valueOf(a);
		System.out.println(a);//value 
		System.out.println(obj);//address of the object 
		
	    short s = 10;
	    Short obj1 = Short.valueOf(s);
	    System.out.println(s);
	    System.out.println(obj1);
	    
	    byte b = 5;
	    Byte obj2 = Byte.valueOf(b);
	    System.out.println(b);
	    System.out.println(obj2);
	    
	    long l = 100;
	    Long obj3 = Long.valueOf(l);
	    System.out.println(l);
	    System.out.println(obj3);
	    
	    float f = 45f;
	    Float obj4 = Float.valueOf(f);
	    System.out.println(f);
	    System.out.println(obj4);
	    
	    double d = 100.10;
	    Double obj5= Double.valueOf(d);
	    System.out.println(d);
	    System.out.println(obj5);
	    
	    char c = 'A';
	    Character obj6 = Character.valueOf(c);
	    System.out.println(c);
	    System.out.println(obj6);
	    		
	    boolean n = false;
	    Boolean obj7 = Boolean.valueOf(n);
	    System.out.println(n);
	    System.out.println(obj7);
	     
	    String g = "java";
	    String obj8 = String.valueOf(g);
	    System.out.println(g);
	    System.out.println(obj8);
	}
}
