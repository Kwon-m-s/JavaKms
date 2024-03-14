import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);	
		System.out.print("년도를 입력해 주세요 : ");
		int year = input.nextInt();
		
		if ((year %4 == 0 && year %100 != 0)|| year % 400 == 0) {// 윤년의 조건 년도가 4로 나누어 떨어지는 년도는 윤년, 그중 100으로 나누어 떨어지는 년도는 평년
			System.out.println(year + " : 윤년입니다");             // 또한 그중 400으로 나누어 떨어지는 년도는 윤년으로 계산하는 조건
		}else {
			System.out.println(year + " : 평년입니다");
		}
	}
}
