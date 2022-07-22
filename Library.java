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
	
}
