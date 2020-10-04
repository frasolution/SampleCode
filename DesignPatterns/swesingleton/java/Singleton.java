package swesingleton;

public class Singleton {

	private static Singleton instance;
	private int callA;
	private int callB;

	public Singleton(){
	}
	
	public static Singleton getInstance(){
		if (Singleton.instance == null) {
			Singleton.instance = new Singleton();
		}
		return instance;
	}

	public int total(){
		return this.getCallA() + this.getCallB();
	}


    /**
     * @return int return the callA
     */
    public int getCallA() {
        return callA;
    }

    /**
     * @param callA the callA to set
     */
    public void setCallA(int callA) {
        this.callA = callA;
    }

    /**
     * @return int return the callB
     */
    public int getCallB() {
        return callB;
    }

    /**
     * @param callB the callB to set
     */
    public void setCallB(int callB) {
        this.callB = callB;
    }

}
