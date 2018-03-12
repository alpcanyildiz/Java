import java.util.ArrayList;

public class AuthorList {

	private ArrayList<Author> author_list;
	
	public AuthorList(){
		author_list=new ArrayList<Author>();	
	}
	public ArrayList<Author> getAuthor_list() {
		return author_list;
	}

	public void addAuthor_list(Author author) {
		author_list.add(author);
	}


		
	}
	
	
	
