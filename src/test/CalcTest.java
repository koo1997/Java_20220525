package test;

import java.util.Scanner;

public class CalcTest {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("숫자 입력1 :");
		int a = sc.nextInt();
		System.out.println("숫자 입력2 :");
		int b = sc.nextInt();
		
		CalcClass sum= new CalcClass();
		int c = sum.add(a, b);
		System.out.println("더하기 : "+c);
		int d = sum.subtract(a, b);
		System.out.println("빼기 :"+d);
		int e = sum.multiply(a, b);
		System.out.println("곱하기 :" +e);
		float f = sum.divide(a, b);
		System.out.println("나누기 :"+f);
		int g = sum.remainder(a, b);
		System.out.println("나머지 :" +g);
		
		
	
	
	}

}
