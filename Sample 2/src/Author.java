import java.util.ArrayList;

public class Author {
	private String name;

	private int birthYear;
	private String birthPlace;
	private ArrayList<Book> author_of_books_list;
	public Author() {
		author_of_books_list = new ArrayList<Book>();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public ArrayList<Book> getList() {
		return author_of_books_list;
	}

	public void setBooks(Book books) {
		author_of_books_list.add(books);
	}
}
