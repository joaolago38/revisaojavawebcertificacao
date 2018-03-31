package br.com.certificacaojava;

public class StringTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="welcome";  
		String s1="Welcome";  
		String s2="Welcome";//will not create new instance  
		System.out.println("s => " + s);
		System.out.println("s1 => " + s1);
		System.out.println("s2 =>" + s2);
		String s5=new String("Welcome");//creates two objects and one reference variable  
		

	}

}
