package co.arum.lambda.collection;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample01 {
	private static List<Emp> list = Arrays.asList(new Emp("Sar", 63), new Emp("mony", 23), new Emp("yei", 54));
	
	public static void printString(Function<Emp, String> function) {
		for(Emp emp : list) {
			System.out.println(function.apply(emp));
		}
	}
	public static void printInt(ToIntFunction<Emp> function) {
		for(Emp emp : list) {
			System.out.println(function.applyAsInt(emp));
		}
	}
	public static void main(String[] args) {
		//이르만 출력 
		printString(e->e.name);
		printInt(e->e.age);
	}
}
