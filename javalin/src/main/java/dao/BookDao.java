package dao;

import java.util.List;
import pojo.BookPojo;
import exception.ApplicationException;

public interface BookDao {

	BookPojo addBook(BookPojo bookPojo) throws ApplicationException;

	BookPojo updateBook(BookPojo bookPojo) throws ApplicationException;

	boolean deleteBook(int id) throws ApplicationException;

	List<BookPojo> getAllBooks() throws ApplicationException;

	BookPojo getABook(int id) throws ApplicationException;

	void exitApplication();

}
