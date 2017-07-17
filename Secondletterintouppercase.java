package player;
import java.util.Scanner;
public class Secondletterintouppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the word:");
Scanner s=new Scanner(System.in);
String a=s.nextLine();
String b=a.substring(0,1)+a.substring(1,2).toUpperCase()+a.substring(2,a.length());
System.out.println(b);

	}

}
