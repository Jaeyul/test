package p16;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayExam {
	
	
	private ArrayList list;
	ArrayExam(){
		list = new ArrayList();		
		getArrayList(0,9);
		System.out.println(list);
	}

	public ArrayList getArrayList(int a, int b) {		
		
		for(int i=a; i<=b; i++) {
			list.add(i);			
		}		
		return list;
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
	}

}
