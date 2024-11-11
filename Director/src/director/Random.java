package director;


import java.io.InputStream;
import java.util.*;
import java.util.Scanner;

class Random {

	public static void main(String[] args)
	{
	     int rand=0,n=0;
		while(true)
		{
		
	     if(rand==n)
		{
			System.out.println("got!!");
			break;
		}
		if(rand<n)
		{
			System.out.println("larger");
		}
		else if(rand<n+10 || rand<n-10)
		{
			System.out.println(" almost near");
		}
		
		else if(rand>n)
		{
			System.out.println("smallerr");
		}
		else
		{
			break;
		}
		
		}
		}

   
	}

