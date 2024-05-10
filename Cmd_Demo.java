// write a java program to work with command line argument
public class Cmd_Demo 
{
	public static void main(String[] args) 
	{
		System.out.println("Before type casting ");
		System.out.println(args[0]+args[1]);
		System.out.println("After type casting ");
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("a+b");
	}
}
