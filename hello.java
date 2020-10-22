import java.util.Scanner;

public class hello{
	public static void main(String[] args) {
		String name;
		Scanner sc = new Scanner(System.in);
		if(sc.hasNextLine())
		name = sc.nextLine();
		else name = "khanh";
		System.out.println("Hello " + name);
	}
}