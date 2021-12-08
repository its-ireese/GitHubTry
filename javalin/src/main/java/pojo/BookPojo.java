package pojo;

public class BookPojo {
	private int id;
	private String bookTitle;
	private String bookGenre;
	private String bookAuthor;
	private int bookCost;
	private boolean bookRemoved;
	private String bookImage;
	
	
	
	public BookPojo() {
		super();
	}
	
	
	public BookPojo(int id, String bookTitle, String bookGenre, String bookAuthor, int bookCost, boolean bookRemoved, String bookImage) {
		super();
		this.id = id;
		this.bookTitle = bookTitle;
		this.bookGenre = bookGenre;
		this.bookAuthor = bookAuthor;
		this.bookCost = bookCost;
		this.bookRemoved = bookRemoved;
	}


	public int getBookId() {
		return id;
	}


	public void setBookId(int id) {
		this.id = id;
	}


	public String getBookTitle() {
		return bookTitle;
	}


	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}


	public String getBookGenre() {
		return bookGenre;
	}


	public void setBookGenre(String bookGenre) {
		this.bookGenre = bookGenre;
	}


	public String getBookAuthor() {
		return bookAuthor;
	}


	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}


	public int getBookCost() {
		return bookCost;
	}


	public void setBookCost(int bookCost) {
		this.bookCost = bookCost;
	}


	public boolean isBookRemoved() {
		return bookRemoved;
	}


	public void setBookRemoved(boolean bookRemoved) {
		this.bookRemoved = bookRemoved;
	}
	

	public String getBookImage() {
		return bookImage;
	}


	public void setBookImage(String bookImage) {
		this.bookImage = bookImage;
	}
	
	
	
	
	
	

}
