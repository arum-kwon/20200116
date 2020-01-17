package co.arum.lambda;

import java.util.function.BiFunction;

public class MyTest {
	
	public static void main(String[] args) {
//		MyFunctionalInterface dan = () -> System.out.println("hello, Dan");
//		MyFunctionalInterface toto = () -> System.out.println("Hello, Toto");
//		MyFunctionalInterface mooni = () -> System.out.println("Hello, Mooni");
//		dan.callName();
//		toto.callName();
//		mooni.callName();
		
//		MyFunctionalInterface f1 = (x, y) ->  x * y;	
//		System.out.println(f1.mul(5, 6));

		MyFunctionalInterface f2 = (x,y) -> { //람다식
			if(x>y) { return x; 
			}else { return y; }
		};
		System.out.println(f2.max(7, 2));
		
		MyFunctionalInterface f3 = new MyFunctionalInterface() { //익명함수

			@Override
			public int max(int x, int y) {
				return 0;
			}
			
		};
		
		BiFunction<Integer, Integer, Integer> f4 = (x,y) -> { //익명함수
			if(x>y) { return x; 
			}else { return y; }
		};
		System.out.println(f4.apply(4, 2));
	}
}
