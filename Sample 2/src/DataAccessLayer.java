import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;


public class DataAccessLayer {
private ArrayList<Author> authorList ;
public ArrayList<Author> getAuthorList() {
	return authorList;
}
public void setAuthorList(ArrayList<Author> authorList) {
	this.authorList = authorList;
}
public ArrayList<Book> getBookList() {
	return bookList;
}
public void setBookList(ArrayList<Book> bookList) {
	this.bookList = bookList;
}
private ArrayList<Book> bookList ;

public DataAccessLayer(){
authorList =new ArrayList<Author>();	
bookList =new ArrayList<Book>();
}
public void readingFromFile(){

	try {
		Scanner inAuthorFile = new Scanner(new File("C:\\Users\\Ulpcan\\Desktop\\authors.dat"));
		Scanner inBookFile = new Scanner(new File("C:\\Users\\Ulpcan\\Desktop\\books.dat"));
		while (inAuthorFile.hasNextLine()) {
			Author author_object = new Author();
			Book book_object = new Book();
			String line=inAuthorFile.nextLine();
			StringTokenizer st = new StringTokenizer(line,",");
			String username = st.nextToken();
			int birth_year = Integer.parseInt(st.nextToken());
			String birth_place=st.nextToken();
			String title=st.nextToken();
			author_object.setName(username);
			author_object.setBirthYear(birth_year);
			author_object.setBirthPlace(birth_place);
			author_object.setBooks(book_object);
			book_object.setTitle(title);
			
			
			String line1 =inBookFile.nextLine();
			StringTokenizer st1 = new StringTokenizer(line1,",");
			st1.nextToken();
			String ISBN = st1.nextToken();
			Genre genre = Genre.valueOf(st1.nextToken().toUpperCase());
			int publish_year=Integer.parseInt(st1.nextToken());
			String publishingCompany = st1.nextToken();
			double price = Double.parseDouble(st1.nextToken());
			book_object.setISBN(ISBN);
			book_object.setGenre(genre);
			book_object.setPublishingYear(publish_year);
			book_object.setPublishingCompany(publishingCompany);
			book_object.setPrice(price);
			book_object.addBook_of_authors_list(author_object);
			System.out.println(title+"bu önceki okudugun title  "+birth_place+" buda birddtt place" );
			System.out.println(ISBN+" ýsbn bu " + genre );
			authorList.add(author_object);
			bookList.add(book_object);
			System.out.println(bookList.size());
			System.out.println(authorList.size());
			
		}
		
		
		
		
		
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
