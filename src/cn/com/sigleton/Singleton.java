package cn.com.sigleton;

public class  Singleton {
	private static final Singleton uniqueInstance = new Singleton();
	private Singleton(){
		System.out.println("New instance");
	}
	public static  Singleton getInstance() {
		return uniqueInstance;
	}
	
	public void print(){
		System.out.println("I'm a singleton instance");
	}

}

//another type of singleton.
/*public class  Singleton {
	private static Singleton uniqueInstance; 
	private Singleton(){
		System.out.println("New instance");
	}
	public static synchronized Singleton getInstance() {
		if (uniqueInstance== null){
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
	
	public void print(){
		System.out.println("I'm a singleton instance");
	}

}*/
