package Reflect.jack.com;

public class Factory {
	public static Object getClass(String type) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		
		Object deme= Class.forName(type).newInstance();
		return deme;
		
	}

}
