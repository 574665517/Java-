package 集合类;
import java.util.*;

public class IteratorTest {
	public static void main(String[] args) {
		Book b1 = new Book("isbn-7-111","Thinking in Java","Bruce Eckel");
		Book b2 = new Book("isbn-7-5382","The Moments","Jimmy");
		Book b3 = new Book("isbn-7-5004","Class","Paul Fussell");
		Book b4 = new Book("isbn-7-5600","The Scarlet Letter","Nathaniel Hawthorne");
		Book b5 = new Book("isbn-7-5611","The Portrait Of a Lady","Henry James");
		Book b6 = new Book("isbn-7-302-06986-7","Programming With J2ME","Alex Wen");
		//泛型,指定类型
		List<Book> al = new ArrayList<Book>();
		al.add(b1);
		al.add(b2);
		al.add(b3);
		al.add(b4);
		al.add(b5);
		al.add(b6);
		System.out.println("length: " + al.size());//6
		System.out.println(al);
	       
		System.out.println("-----------------------");
	     
		for(int i = 0; i < al.size(); i++) {
		     System.out.println(al.get(i));
		}
         
		 System.out.println("-----------------------");
		 Iterator<Book> iterator = al.iterator();//迭代器
		 while (iterator.hasNext()){  
			 Book book = iterator.next();
			 System.out.println(book);
		 }
		 System.out.println("-----------------------");
		 for(Book bk : al) {
			 System.out.println(bk);
		 }
	}			
		
}

class Book {
	private String isbn,title,author;
	public Book(String theIsbn,String theTitle,String theAuthor)
	{
		isbn = theIsbn;
		title = theTitle;
		author = theAuthor;
	}
	
	public String getIsbn()
	{
		return isbn;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public String getAuthor()
	{
		return author;
	}
	 
  // public String toString()
  // {
 	//  return "[isbn="+isbn+" ,title="+title+" ,author="+author+"]";
	 // }	
   
}
