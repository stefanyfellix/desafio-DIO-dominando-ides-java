package br.com.dio.model;

public class Person {
	
	private String name;
	private String email; 
	private Integer age;
	private Integer height;
	
	
	public Person(String name, String email, Integer age, Integer height) {
		this.name = name;
		this.email = email;
		this.age = age;
		this.height = height;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public Integer getHeight() {
		return height;
	}


	public void setHeight(Integer height) {
		this.height = height;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", age=" + age + ", height=" + height + "]";
	} 

}
