package Prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypStore {
	private static Map<String, Prototyp> prototypMap = new HashMap<String, Prototyp>();  
    
    static 
    { 
    	prototypMap.put("a", new SpecificA()); 
    	prototypMap.put("b", new SpecificB()); 
    } 
       
    public static Prototyp getSpecific(String name) 
    { 
        return (Prototyp) prototypMap.get(name).clone(); 
    }
}
