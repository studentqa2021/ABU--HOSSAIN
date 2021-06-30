package com.exception;

public class ExceptionPractice {
	static  int a;
	static String b;

	public static void main(String[] args) {
		System.out.println("hi");
//		try {
//			System.out.println(b);
//			System.out.println(20 / a);
//			System.out.println(10 / a);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	finally {
//			//System.exit(0);
//		}
//		
		System.out.println("good evening");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		System.out.println("good night");
//		
//		try{System.out.println(30/a);
//		}//catch(Exception e) {
//			
//		//}
//				finally {
//			
//		}
		System.out.println("good midnight");
	}
}
