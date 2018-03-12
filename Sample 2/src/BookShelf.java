import java.util.ArrayList;

public class BookShelf {
	private ArrayList<Book> bookshelflist;

public ArrayList<Book> getBookshelflist() {
		return bookshelflist;
	}

	public void addBookshelflist(Book book) {
		bookshelflist.add(book);
	}

public BookShelf(){
bookshelflist = new ArrayList<Book>();	
}




}