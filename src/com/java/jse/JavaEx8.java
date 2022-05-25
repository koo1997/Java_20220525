package com.java.jse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
//외부클래스는 디폴트 퍼블릭만 가능 
//stutic X
public class JavaEx8 {
	
	//내부클래스 :인스턴스 멤버 클래스
	//has-A 관계
	//캡슐화:보안
 	//내부 클래스는 다가능
	class InnerClass{
		
		String name;
		InnerClass() {
		System.out.println("내부 클래스의 생성자");
			// TODO Auto-generated constructor stub
		}
	void method() {
		System.out.println("내부 클래스의 메서드");
	}
	
	}
	
	void localMethod() {
		class LocalClass{
			String name;
			LocalClass() {
				System.out.println("지역 클래스의 메서드");
				// TODO Auto-generated constructor stub
			}
			void method() {
				System.out.println("지역 클래스의 메서드");
			}
		}
		LocalClass local = new LocalClass();
		local.method();
		
	}
	
	//정적 내부클래스
	static class Staticclass{
		String name;
		Staticclass() {
		System.out.println("정적클래스의 생성-자");	// TODO Auto-generated constructor stub
		}
		void method() {
			System.out.println("정적 클래스의 메서드");
		}
	}
	
	public static void main(String[] args) {
		
		
		JavaEx8.InnerClass inner
		=new JavaEx8().new InnerClass();
		
		InnerClass inner2=new JavaEx8().new InnerClass();
		
		JavaEx8 outer= new JavaEx8();
		InnerClass inner3 = outer.new InnerClass();
		
		//StraticClass stClass= new Staticclass();
		JavaEx8 obj = new JavaEx8();
		obj.localMethod();
		
		List<String> list = new ArrayList<>();
		list = Arrays.asList(new String[] {"Java", 
				                           "Python",
				                           "C++"});
		for (String s : list) {
			System.out.print(s + " ");
		}
//		List<String> list = new ArrayList<>();
//		list = ArrayList.list(new String[] {"java"
//				
//		});
//		Collections.sort(list);
		
		
	}

}
class SortedClass implements Comparator<String> {
	
	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2); // 오름차순 정렬
		// return o2.compareTo(o1); // 내림차순 정렬
	}
}
