package abstractFactory;

public class FactoryEng implements AbstractFactory {

	@Override
	public AbstractProduct generateProduct(String info) {
		if(info.equals("a")){
			return new ProductAEng();
		}else if(info.equals("b")) {
			return new ProductBEng();
		}else {
			System.out.println("not a Product");
			return null;
		}
	}

}
