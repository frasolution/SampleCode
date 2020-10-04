package Builder;

public class Sample {
	
	public Sample() {}
	
	private Integer number;
	private String name;
	
	public Integer getNumber() {
		return number;
	}
	public Sample setNumber(Integer number) {
		this.number = number;
		return this;
	}
	public String getName() {
		return name;
	}
	public Sample setName(String name) {
		this.name = name;
		return this;
	}
	public void printThis(){
		System.out.println(name + " " + number);
	}
	
	
}
