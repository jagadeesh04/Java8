package lambda;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*class ConsImpl implements Consumer<Integer>{

	@Override
	public void accept(Integer i) {
		System.out.println(i);
		
	}
	
}*/

public class Lambda {

	
	
	public static void main(String[] args) {
		
		List<Integer> values = Arrays.asList(4,5,6,7);
		
		//values.forEach(i -> System.out.println(i)); //lambda //consumer
		
		Consumer<Integer> c = i ->System.out.println(i);
		
		values.forEach(c);
		
		
	}
	
}
