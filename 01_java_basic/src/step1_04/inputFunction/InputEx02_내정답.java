package step1_04.inputFunction;
//2021/03/18 22:10 ~ 22:26
import java.util.Scanner;

public class InputEx02_내정답 {

	public static void main(String[] args) {
	
		// 문제1) 숫자 2개를 입력받아서 합 출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수1 입력:");
		int getNum01 = scan.nextInt();
		
		System.out.print("정수2 입력: ");
		int getNum02 = scan. nextInt();
		
		int totalNum = (getNum01 + getNum02);
		System.out.println("두 정수의 합은 : " + totalNum + "입니다.");
		
		
		// 문제2) 숫자 1개를 입력받아서 , 홀수이면 true 출력

		 Scanner scan2 = new Scanner(System.in);
		 
		 System.out.print("숫자를 입력하세요 = ");
		 int getNum3 = scan2.nextInt();
		 
		 System.out.println(getNum3 % 2 == 1);
		 
		
		// 문제3) 성적을 입력받아, 60점 이상이고 100점 이하이면 true 출력
		 Scanner scan3 = new Scanner(System.in);
			
		System.out.print("성적을 입력하세요 = ");
		int grade = scan3.nextInt();
			
		System.out.println(grade >= 60 && grade <= 100);
			
		scan.close();
		
	}
	
}
