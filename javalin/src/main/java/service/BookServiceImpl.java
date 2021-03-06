package service;

import java.util.List;

import dao.BookDao;
import dao.BookHibernateDaoImpl;
import dao.BookJdbcImpl;
import pojo.BookPojo;
import dao.DBUtil;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import exception.ApplicationException;



public class BookServiceImpl implements BookService{
	
	private static final Logger logger = LogManager.getLogger(BookServiceImpl.class);
	
	BookDao bookDao;
	
	public BookServiceImpl() {
		// this.bookDao = new BookDaoImpl();
		// this.bookDao = new BookJdbcImpl();
		this.bookDao = new BookHibernateDaoImpl();
		
	}

	@Override
	public BookPojo addBook(BookPojo bookPojo) throws ApplicationException {
		logger.info("Entered addBook() in service.");
		BookPojo returnBookPojo = this.bookDao.addBook(bookPojo);
		logger.info("Exited addBook() in service.");
		return returnBookPojo;
	}

	@Override
	public BookPojo updateBook(BookPojo bookPojo) throws ApplicationException {
		logger.info("Entered updateBook() in service.");
		BookPojo returnBookPojo = this.bookDao.updateBook(bookPojo);
		logger.info("Exited updateBook() in service.");
		return returnBookPojo;
	}

	@Override
	public boolean deleteBook(int id) throws ApplicationException {
		logger.info("Entered deleteBook() in service.");
		boolean returnFlag = this.bookDao.deleteBook(id);
		logger.info("Exited deleteBook() in service.");
		return returnFlag;
	}

	@Override
	public List<BookPojo> getAllBooks() throws ApplicationException {
		logger.info("Entered getAllBooks() in service.");
		List<BookPojo> allBooks = this.bookDao.getAllBooks();
		logger.info("Exited getAllBooks() in service.");
		return allBooks;
	}

	@Override
	public BookPojo getABook(int bookId) throws ApplicationException {
		logger.info("Entered getABook() in service.");
		BookPojo returnBookPojo = this.bookDao.getABook(bookId);
		logger.info("Exited getABook() in service.");
		return returnBookPojo;
	}

	@Override
	public void exitApplication() {
		logger.info("Entered exitApplication() in service.");
		bookDao.exitApplication();
		logger.info("Exited exitApplication() in service.");
	}
	
}