package lambda;


//used when we have a class which implements an Interface only.
//No other methods it has
interface A{
	void show();
}

/*class XYZ implements A{
	public void show(){
		System.out.println("Hello");
	}
}*/

public class LambdaDemo {

	public static void main(String[] args) {
		A obj;
		/*obj = new A(){

			@Override
			public void show() { //annonymous inner class
				System.out.println("hello");	
			}
		};*/
		
		//Lambda expression
		//new way of implementing interface
		obj =() ->	System.out.println("Hello");
		
		obj.show();
		
	}
	
}
