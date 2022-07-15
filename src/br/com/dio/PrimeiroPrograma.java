package br.com.dio;

import br.com.dio.model.Cat;
import br.com.dio.model.Person;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		
		Cat cat = new Cat("Gengibirra", "Grey w/ orange", 4);
		Person person = new Person("Heric", "hericfelix@gmail.com", 27, 180);
		
		System.out.println(person);
		System.out.println(cat);
		
		/*int a = 2;
		int b = 3;
		System.out.println("Hello World! " + (a + b));*/
	}
	

}
