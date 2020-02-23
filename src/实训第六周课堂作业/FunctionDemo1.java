package 实训第六周课堂作业;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionDemo1 {
	public static void main(String[] args) {
		Function<String, Boolean> fun = "##hello"::startsWith;
		System.out.println(fun.apply("##"));
		
		String[] atp = {"Rafael Nadal", "Novak Djokovic",
			       "Stanislas Wawrinka",
			       "David Ferrer", "Roger Federer",
			       "Andy Murray", "Tomas Berdych",
			       "Juan Martin Del Potro"};
		List<String> players = Arrays.asList(atp);
			 
		// 以前的循环方式
		for (String player : players) {
			System.out.print(player + "; ");
		}
	 
		// 使用 lambda 表达式以及函数操作(functional operation)
		players.forEach((player) -> System.out.print(player + "; "));
			 
		// 在 Java 8 中使用双冒号操作符(double colon operator)
		players.forEach(System.out::println);
	}
}
