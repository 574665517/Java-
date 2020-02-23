package 实训第六周课堂作业;

import 实训第六周课堂作业.RepeatingAnnotations.Filter;

public class FilterableTest {
	
	@Filter( "filter1" )
	@Filter( "filter2" )
	public interface Filterable {
	}
	public static void main(String[] args) {
		for(Filter filter:Filterable.class.getAnnotationsByType(Filter.class)) {
			System.out.println(filter.value());
		}
	}
}