import java.util.Scanner;
public class CharacterOnly{
	public static void main(String d[]){
		char ch;
		int x;
		Scanner r=new Scanner(System.in);
		System.out.print("Enter any character : ");
		ch=r.next().charAt(0);
		x=ch;
		while(true){
			while((x>=65&&x<=90)||(x>=97&&x<=122)){
				System.out.print("Enter Character :");
				ch=r.next().charAt(0);
				x=ch;
			}
			if(!(x>=65&&x<=90)||!(x>=97&&x<=122)){
				System.out.print("Ohhh!! It does not belongs to  Alphabet");
				break;
			}
		}
	}
}