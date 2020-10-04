package Prototype;

public class SpecificB extends Prototyp{
	
	public SpecificB() {
		this.name = "B";
	}
	
	@Override
	void printName() {
		System.out.println(this.name);
		
	}
}
