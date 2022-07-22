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
	public ArrayList<Book> getBooksWithTitle(ArrayList<Book> selectedBooks, String s)
	{
		ArrayList<Book> newBooks = new ArrayList<Book>();
		for(int i = 0; i < selectedBooks.size(); i++)
		{
			if(selectedBooks.get(i).getTitle().toLowerCase().contains(s.toLowerCase()))
			{
				newBooks.add(selectedBooks.get(i));
			}
		}
		return newBooks;
	}
	public ArrayList<Book> getBooksWithAuthor(ArrayList<Book> selectedBooks,String s)
	{
		ArrayList<Book> newBooks = new ArrayList<Book>();
		for(int i = 0; i < selectedBooks.size(); i++)
		{
			if(selectedBooks.get(i).getAuthor().toLowerCase().contains(s.toLowerCase()))
			{
				newBooks.add(selectedBooks.get(i));
			}
		}
		return newBooks;
	}
	public ArrayList<Book> getBooksWithGenre(ArrayList<Book> selectedBooks,String s)
	{
		ArrayList<Book> newBooks = new ArrayList<Book>();
		for(int i = 0; i < selectedBooks.size(); i++)
		{
			if(selectedBooks.get(i).getCategory().toLowerCase().contains(s.toLowerCase()))
			{
				newBooks.add(selectedBooks.get(i));
			}
		}
		return newBooks;
	}
	public ArrayList<Book> getBooksWithPages(ArrayList<Book> selectedBooks,int low, int high)
	{
		ArrayList<Book> newBooks = new ArrayList<Book>();
		for(int i = 0; i < selectedBooks.size(); i++)
		{
			if(Books.get(i).getPages() >= low && selectedBooks.get(i).getPages() <= high)
			{
				newBooks.add(selectedBooks.get(i));
			}
		}
		return newBooks;
	}
	public ArrayList<Book> getBooksWithRating(ArrayList<Book> selectedBooks,double rating)
	{
		ArrayList<Book> newBooks = new ArrayList<Book>();
		for(int i = 0; i < selectedBooks.size(); i++)
		{
			if(selection.get(i).getRating() >= rating)
			{
				newBooks.add(selectedBooks.get(i));
			}
		}
		return newBooks;
	}
	public ArrayList<Book> getBooks()
	{
		return Books;
	}
	
}
