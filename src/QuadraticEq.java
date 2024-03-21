import java.util.Scanner;

public class QuadraticEq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double a,b,c; // 계수를 저장하기위한 변수
		double discriminant, plus, minus; // 판별식, 근의 공식중 판별식을 더할경우와 뺄경우
		
		//System.out.println("이차식의 계수를 입력해주세요 : "); 이차식의 계수를 입력 받는 경우 사용
		//a = input.nextDouble();	
		a = 1;
		
		System.out.println("일차식의 계수를 입력해주세요 : ");
		b = input.nextDouble();
		
		System.out.println("상수항의 계수를 입력해주세요 : ");
		c = input.nextDouble();
		
		discriminant = b * b - 4 * a * c;// 판별식
		
		if (discriminant > 0) {// 판별식이 0보다 큰 경우
			plus = (-b + Math.sqrt(discriminant))/(2 * a); // 판별식을 더할 경우
			minus = (-b - Math.sqrt(discriminant))/(2 * a); // 판별식을 뺄 경우
			System.out.println("근은" + plus + "와" + minus + "입니다.");
		} else if (discriminant == 0) {// 판별식이 0 일 경우 중근을 구하는 과정
			plus = -b/(2 * a); 
			System.out.println("중근은" + plus + "입니다");
		} else {//판별식이 0 보다 작아 실근이 존재하지 않을 경우
			System.out.println("실근이 존재하지 않습니다");
		}
		
	}

}
