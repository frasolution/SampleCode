package abstractFactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String lang){   
	      if(lang.equals("ger")){
	         return new FactoryGer();         
	      }else{
	         return new FactoryEng();
	      }
	   }
}
