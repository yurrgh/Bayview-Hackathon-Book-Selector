package hackathonBayview;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class Book {
	String title, author, category, link, summary;
	Double rating;
	int pages;

	public Book(String s) {
		String temp=s;
		String split=(temp.substring(temp.indexOf("[")+1,temp.indexOf("]") )) ;
		title=split;

		
		for(int i=0;i<6;i++)
		{
			temp=temp.substring(  temp.indexOf("]")+1);
			split=(temp.substring(temp.indexOf("[")+1,temp.indexOf("]") )) ;
			switch(i)
			{
			   case 0:
			
				 
			}
		}
	}
	public String getAuthor()
	{
		return author;
	}
}