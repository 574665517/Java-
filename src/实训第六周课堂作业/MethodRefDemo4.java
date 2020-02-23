package 实训第六周课堂作业;

interface IFunction4<R> { 
	public R create(String t, double p); 
}
class Book {
	private String titile;
	private double price;
	public Book(String titile, double price) {
		this.titile = titile;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [titile=" + titile + ",price=" + price + "]"; 
	}
}

public class MethodRefDemo4 {
	public static void main(String[] args) {
		IFunction4<Book> fun = Book::new;
		Book book = fun.create("Java编程思想", 89.5);
		System.out.println(book);
	}
}