import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Library 
{
	ArrayList<Book> Books = new ArrayList<Book>();
	public Library() throws FileNotFoundException
	{
		File fileText = new File("in.txt");
		Scanner bookLine = new Scanner(fileText);
		while(bookLine.hasNext())
		{
				String s = bookLine.nextLine();
				Book book = new Book(s);
				Books.add(book);
		}
	}
	
	public String completeLibrary()
	{
		String complete ="";
		for(int i = 0; i < Books.size(); i++)
		{
			complete += Books.get(i).getTitle()+"\n";
		}
		return complete;
	}
	public ArrayList<Book> getBooksWithTitle(String s)
	{
		ArrayList<Book> newBooks = new ArrayList<Book>();
		for(int i = 0; i < Books.size(); i++)
		{
			if(Books.get(i).getTitle() == s)
			{
				newBooks.add(Books.get(i));
			}
		}
		return newBooks;
	}
	public ArrayList<Book> getBooksWithAuthor(String s)
	{
		ArrayList<Book> newBooks = new ArrayList<Book>();
		for(int i = 0; i < Books.size(); i++)
		{
			if(Books.get(i).getAuthor() == s)
			{
				newBooks.add(Books.get(i));
			}
		}
		return newBooks;
	}
	public ArrayList<Book> getBooksWithGenre(String s)
	{
		ArrayList<Book> newBooks = new ArrayList<Book>();
		for(int i = 0; i < Books.size(); i++)
		{
			if(Books.get(i).getCategory() == s)
			{
				newBooks.add(Books.get(i));
			}
		}
		return newBooks;
	}
	public ArrayList<Book> getBooksWithPages(int low, int high)
	{
		ArrayList<Book> newBooks = new ArrayList<Book>();
		for(int i = 0; i < Books.size(); i++)
		{
			if(Books.get(i).getPages() >= low && Books.get(i).getPages() <= high)
			{
				newBooks.add(Books.get(i));
			}
		}
		return newBooks;
	}
	public ArrayList<Book> getBooksWithRating(ArrayList<Book> selection,double rating)
	{
		ArrayList<Book> newBooks = new ArrayList<Book>();
		for(int i = 0; i < selection.size(); i++)
		{
			if(selection.get(i).getRating() >= rating)
			{
				newBooks.add(selection.get(i));
			}
		}
		return newBooks;
	}
	public ArrayList<Book> getBooks()
	{
		return Books;
	}
	
}
