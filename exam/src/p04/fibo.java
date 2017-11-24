package p04;

public class fibo {
	
	int ff(int num) {
		int sum = 0;
		for(int i=0; i<num; i++) {
			sum += i;
			
		}return sum ;
	}
	
	public static void main(String[] args) {
		fibo fn = new fibo();
		System.out.print(fn.ff(6));
		
	}
	
	
	
	
	

}
