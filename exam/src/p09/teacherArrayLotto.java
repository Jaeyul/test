package p09;

import java.util.Random;

public class teacherArrayLotto {
	
	
	public static void main(String[] args) {
		Random r = new Random();
		int[] t = new int[9];
		for(int i=0; i<t.length; i++) {
			t[i] = r.nextInt(20);
			for(int j=0; j<i; j++) {
				if(t[i]==t[j]) {
					i--;					
				}				
			}			
		}
		
		for(int i=0; i<t.length; i++) {
			System.out.print(t[i]);
		}
				
		int[][] tt = new int[3][3];
		
		int cnt = 0;
		for(int i=0; i<tt.length; i++) {
			for(int j=0; j<tt[i].length; j++) {
				tt[i][j] = t[cnt];
				cnt++;				
			}			
		}
		
		System.out.println("");
				
		for(int i=0; i<tt.length; i++) {
			for(int j=0; j<tt[i].length; j++) {
				System.out.print(tt[i][j]);					
			}						
		}
		
		for(int i=0; i<tt.length; i++) {
			for(int j=0; j<tt[i].length; j++) {
				if()			
			}						
		}
		
		
		
		
		
		
		
	}

}
