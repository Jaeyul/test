package p02;

public class FuntionTest {
	
	static void add(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
//	static int add2(int num1, int num2 ) {
//		return num1 + num2;
//	}
	static String add2(int num1, int num2 ) {
		return num1 + "+" + num2 + "의 결과값은" + (num1+num2) +  "입니다.";
	}
	
	static int add4(int[7] numArr) {
		int result ;
		for(int i=0; i<numArr.length; i++) {
			
		}
	}
	
	public static void main(String[] args) {
		add(1,2);
//		System.out.println(add2(1,3));
//		String result = add2(1,3);
//		System.out.println(result);
		System.out.println(add2(1,3));
		String a = "    3      1     ";
		System.out.println(a);
		System.out.println(a.trim());
		System.out.println(a+"끝");
		System.out.println(a.trim()+"끝");


		
		
	
	}
}
