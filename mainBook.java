package hackathonBayview;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class mainBook {
	String title, author, category, link, summary;
	Double rating;
	int pages;

	public mainBook(String s)
	{
		String temp=s;
		String split=(temp.substring(temp.indexOf("[")+1,temp.indexOf("]") )) ;
		for(int i=0;i<7;i++) {
			 author=split;
		
			}
	}
	public String getAuthor()
	{
		return author;
	}
}
