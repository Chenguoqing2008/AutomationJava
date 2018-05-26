package learnjava;

public class Box<T> {
	
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	
	//the <U> before the return type tell the compiler that the U is a generic type
	//run time check is much easier and quicker
	//add bounces to your type paramters
	public <U extends Number> void inspect(U u){
		
		System.out.println(" the u type is" +u.getClass().getName());
		System.out.println(" the t type is" +obj.getClass().getName());
		
		
	}
}
