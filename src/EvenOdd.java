import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a;
		a = input.nextInt();
		if(a%2 == 0) {
			System.out.println(a +"는 짝수 입니다.");
		}else {
			System.out.println(a + "는 홀수 입니다.");
		}

	}

}
