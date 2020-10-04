package abstractFactory;

public class FactoryGer implements AbstractFactory {

	@Override
	public AbstractProduct generateProduct(String info) {
		if(info.equals("a")){
			return new ProductAGer();
		}else if(info.equals("b")) {
			return new ProductBGer();
		}else {
			System.out.println("not a Product");
			return null;
		}
		
	}
	
}
