import java.util.ArrayList;

public class Book {
	private String title;
	private String ISBN;
	private Genre genre;
	private int publishingYear;
	private String publishingCompany;
	private double price;
	private ArrayList<Author> book_of_authors_list;

	public Book() {
		book_of_authors_list = new ArrayList<Author>();

	}

	public ArrayList<Author> getlist() {
		return book_of_authors_list;
	}

	public void addBook_of_authors_list(Author author) {
		book_of_authors_list.add(author);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public int getPublishingYear() {
		return publishingYear;
	}

	public void setPublishingYear(int publishingYear) {
		this.publishingYear = publishingYear;
	}

	public String getPublishingCompany() {
		return publishingCompany;
	}

	public void setPublishingCompany(String publishingCompany) {
		this.publishingCompany = publishingCompany;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}