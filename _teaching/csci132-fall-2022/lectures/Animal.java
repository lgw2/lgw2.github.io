package day9;

public abstract class Animal {
	
	protected String name;
	protected int id;
	protected int age;
	protected int weight;
	
	public Animal(String n, int i, int a, int w) {
		this.name = n;
		this.id = i;
		this.age = a;
		this.weight = w;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract String sound();
	
}
