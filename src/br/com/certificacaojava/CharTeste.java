package br.com.certificacaojava;

public class CharTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch={'j','a','v','a','t','p','o','i','n','t'}; 
		String s=new String(ch);  
		System.out.println(ch.length);
		System.out.println(ch.clone());
		System.out.println(s.substring(1, 4));
		System.out.println(s.length());
		System.out.println(s.indexOf(s));
		System.out.println(s.startsWith(s));
		System.out.println(s.compareToIgnoreCase(s));
	}

}
