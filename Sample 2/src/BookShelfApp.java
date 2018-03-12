import java.util.Scanner;

public class BookShelfApp {
	public static void main(String[] args) {

		DataAccessLayer x1 = new DataAccessLayer();
		BookShelf bookShelf = new BookShelf();
		AuthorList authorList = new AuthorList();
		BookShelfMenu bookShelfMenu = new BookShelfMenu();
		
		x1.readingFromFile();
		bookShelf.addBookshelflist(x1.getBookList().get(0));
		bookShelf.addBookshelflist(x1.getBookList().get(1)); // firstl :D
		authorList.addAuthor_list(x1.getAuthorList().get(0));
		authorList.addAuthor_list(x1.getAuthorList().get(1));
		System.out.println(authorList.getAuthor_list().get(0).getName());
		bookShelfMenu.printMenu();
		
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		switch (number) {
		case 1:
			number = 1; {
			Book book_object = new Book();
			boolean flag = false;
			System.out.println("What is the book's title ? ");
			String title = input.next();
			book_object.setTitle(title);
			
			System.out.println("What is the book's ISBN ? ");
			String isbn = input.next();
			book_object.setISBN(isbn);
			
			System.out.println("What is the genre of the book ? ");
			Genre genre = Genre.valueOf(input.next().toUpperCase());
			book_object.setGenre(genre);
			
			System.out.println("What is the publishing Year of the book ? ");
			int publishingYear = input.nextInt();
			book_object.setPublishingYear(publishingYear);
			
			System.out.println("What is the publishing Company ? ");
			String publishingCompany = input.next();
			book_object.setPublishingCompany(publishingCompany);
			
			System.out.println("What is the price of the book ?");
			double price =Double.parseDouble(input.next());
			book_object.setPrice(price);

			System.out.println("How many authors does the book have ? ");
			int authors_number = input.nextInt();
			for (int i = 0; i < authors_number; i++) {
				System.out.println("What is the name of the" + (i + 1) + ". author");
				String name = input.next();
				name += input.nextLine();
				System.out.println(name);
				for (Author x : authorList.getAuthor_list()) {
					if (x.getName().equals(name)) {
						book_object.addBook_of_authors_list(x);
						flag = true;
						break;
					}
				}
				if (flag == false) {
					Author author_object = new Author();
					System.out.println("What is the birth Year ? ");
					int year = input.nextInt();
					System.out.println("what is the birth Place ? ");
					String birthPlace = input.next();
					author_object.setName(name);
					author_object.setBirthPlace(birthPlace);
					author_object.setBirthYear(year);
					author_object.setBooks(book_object);
					book_object.addBook_of_authors_list(author_object);
				}

			}
		}
		case 2: number=2;	

		}

	}

}
