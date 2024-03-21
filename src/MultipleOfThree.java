import java.util.Scanner;

public class MultipleOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a;
		System.out.println("정수를 입력해주세요 : ");
		a = input.nextInt();
		if(a%3 == 0) {
			System.out.println(a +"는 3의 배수 입니다.");
		}else {
			System.out.println(a + "는 홀수 입니다.");
		}
	}

}
