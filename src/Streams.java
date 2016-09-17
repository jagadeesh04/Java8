import java.util.ArrayList;
import java.util.Random;

//Why Streams??

//Speed is fast. executes fast
//#functional programming


public class Streams {
	
	public static int f(int n){
		for(int i=1; i<10000; i++){
			n = (n^i) % i;
			if(n<=0)
				n=10;
		}
		return n;
	}

	public static void main(String[] args) {
		
		Random random = new Random();
		ArrayList<Integer> data = new ArrayList<>();
		
		for(int i=0; i<1000000; i++){
			data.add(random.nextInt());
		}
		System.out.println("Staring");
		
		
		//traditional way
		/*int result =0;
		for(int i: data){
			result +=f(i);
		}
		System.out.println(result);*/
		
		int result = data.stream().map(i-> f(i)).reduce(Integer::sum).get();
		
		System.out.println(result);
		
	}
	
}
