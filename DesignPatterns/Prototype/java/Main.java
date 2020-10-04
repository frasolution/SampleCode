package Prototype;

class Main{ 
    public static void main (String[] args){ 
        PrototypStore.getSpecific("a").printName(); 
        PrototypStore.getSpecific("b").printName(); 
        PrototypStore.getSpecific("b").printName(); 
        PrototypStore.getSpecific("a").printName(); 
    } 
} 