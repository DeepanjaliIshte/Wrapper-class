// Write a program which shows the use of Byte class methods
	//Creating and comparing Byte Object
import java.io.*;
import java.util.Scanner;
public class Byte_Test_2 
	{
		public static void main(String args[]) throws IOException
	{
			Scanner sn=new Scanner(System.in); 
			byte b1=sn.nextByte();
			byte b2=sn.nextByte();
	System.out.print ("Enter a byte number: ");
	String str = sn.next(); 
	Integer it=sn.nextInt();;
	//convert str into Byte 
	Object b11  = new Byte (str);
	System.out.print ("Enter a another byte number: ");
	
	//convert str into Byte obj 
	byte b21 = Byte.valueOf (str); //compare b1 and b2
	int n =sn.compareTo(b21); 
	if (n==0)
		{
		System.out.println ("Both are Same"); 
		}
	else 
		{
		System.out.println (b11 + "is bigger");
		}
	 {
	System.out.println (b21 + " is bigger");
	}
	}
	}

