package abstractFactory;

public class Main {

	public static void main(String[] args) {
		AbstractFactory germanATest = FactoryProducer.getFactory("ger");
		AbstractProduct aTest = germanATest.generateProduct("a");
		aTest.printName();
		AbstractFactory englishBTest = FactoryProducer.getFactory("eng");
		AbstractProduct bTest = englishBTest.generateProduct("b");
		bTest.printName();
	}

}
