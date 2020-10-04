package Prototype;

abstract class Prototyp implements Cloneable{
	
	protected String name;
	
	abstract void printName();
	
	public Object clone() 
    { 
        Object clone = null; 
        try 
        { 
            clone = super.clone(); 
        }  
        catch (Exception e)  
        { 
            e.printStackTrace(); 
        } 
        return clone; 
    } 
	
}