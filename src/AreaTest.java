import java.util.Scanner;

public class AreaTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);		
		
		System.out.println("반지름을 입력해주세요 : ");//숫자 입력을 위한 안내문
		int radius;//반지름을 저장하기 위한 변수
		radius = input.nextInt();// 반지름을 입력 받고 저장 하는 과정
		
		
		final double PI = 3.141592; //원주율

		double area = radius * radius * PI;	//원의 면적을 구하는 과정
		System.out.println("반지름이"+radius+"인 원의 면적은"+area+"입니다");
	}

}
