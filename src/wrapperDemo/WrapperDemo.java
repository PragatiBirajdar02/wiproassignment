package wrapperDemo;

public class WrapperDemo {

	public static void main(String[] args) {
		byte a = 1;//Primitive type
		//wrapping around byte object
		Byte byteobj = new Byte(a);//Boxing -- primitive to wrapper class
		
		//Integer data type
		int b = 10; //Primitive type	
		//wrapping around Integer object
		Integer intobj = new Integer(b);
		
		//float data type 
		float c= 18.6f;
		//wrapping around Float object
		float flotobj = new Float(c);
		
		//Double float type
		double d = 250.5;
        //wrapping around Double float object
		Double doubleobj = new Double(d);
		
		//char data type
		char e = 'a';
		//wrapping around character object
		Character charobj = e;
		
		//PRINTING THE VALUES FROM OBJECTS
		System.out.println("values of wrapper objects (printing as objects)");
		System.out.println(byteobj);
		System.out.println(intobj);
		System.out.println(flotobj);
		System.out.println(doubleobj);
		System.out.println(charobj);
		
		
		
		//Objects to data types (Retriving data types from objects)
		//Unwrapping objects to primitive data types
		byte bv=byteobj;
		int iv = intobj;
		float fv = flotobj;
		double dv = doubleobj;
		char cv = charobj;
		
		//PRINTING THE VALUES FROM DATA TYPES
		System.out.println("values of wrapper in data types (printing as data types)");
		System.out.println(bv);
		System.out.println(iv);
		System.out.println(fv);
		System.out.println(dv);
		System.out.println(cv);

	}

}
