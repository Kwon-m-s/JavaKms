import java.util.Scanner;
public class Lec2Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a;
		System.out.println("정수를 입력해주세요 : ");
		a = input.nextInt();
		int b;
		System.out.println("정수를 입력해주세요 : ");
		b = input.nextInt();
		
		if(a > b) {
			System.out.println("더 큰수는 "+a+"입니다");
		}else {
			System.out.println("더 큰수는 "+b+"입니다");
		}

	}

}
