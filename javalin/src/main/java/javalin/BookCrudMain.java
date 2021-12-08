package javalin;
import io.javalin.Javalin;
import pojo.BookPojo;
import service.BookServiceImpl;
import service.BookService;

public class BookCrudMain {

	public static void main(String[] args) {
		
		BookService bookService = new BookServiceImpl();
		Javalin server = Javalin.create((config) -> config.enableCorsForAllOrigins()).start(4040);
		
		//http://localhost:4040/hello
		server.get("hello", (ctx) -> {
			//tell here what to do when the hello endpoint is requested for
			System.out.println("Hello endpoint is requested!!");
			ctx.result("HELLO ENDPOINT IS REQUESTED!!");
			
		});
		
		//http://localhost:4040/api/books
		server.get("api/books", (ctx) -> {
			ctx.json(bookService.getAllBooks());
		
			//System.out.println("get all books!");
		});
		
		//get endpoint to fetch one book
		// http://localhost:4040/api/books/5
		// 5 is a pathParam and they are given in a {}
		server.get("api/books/{bid}", (ctx) -> {
			ctx.json(bookService.getABook(Integer.parseInt(ctx.pathParam("bid"))));
			System.out.println("get one book!" + ctx.pathParam("bid"));
		});
		
		//delete endpoint to delete a book
		// http://localhost:4040/api/books/5
		server.delete("api/books/{bid}", (ctx) -> {
			bookService.deleteBook(Integer.parseInt(ctx.pathParam("bid")));
			System.out.println("Delete book called! :" + ctx.pathParam("bid"));
		});
		
		//post endpoint to add a book
		//http://localhost:4040/api/books
		server.post("api/books", (ctx) -> {
			BookPojo returnBookPojo = bookService.addBook(ctx.bodyStreamAsClass(BookPojo.class));
			ctx.json(returnBookPojo);
			System.out.println("post endpoint called: "+ ctx.body());
		});
		
		//put endpoint to update a book
		//http://localhost:4040/api/books
		server.put("api/books", (ctx) -> {
			System.out.println("Put endpoint called: " + ctx.body());
		});
		
	}
}
