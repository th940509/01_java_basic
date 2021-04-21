package step1_04.inputFunction;
//2021/03/18 22:10 ~ 22:26
//2021/04/21 14:23 ~ 14:28

import java.util.Scanner;

public class InputEx02_내정답 {

	public static void main(String[] args) {
	
		// 문제1) 숫자 2개를 입력받아서 합 출력
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자1 입력: ");
		int num1 = scan.nextInt();
		
		System.out.print("숫자2 입력: ");
		int num2 = scan.nextInt();
		
		int sum = num1 + num2;
		System.out.println("합 = "+ sum);
	
		
		// 문제2) 숫자 1개를 입력받아서 , 홀수이면 true 출력
		System.out.print("숫자 입력: "); 
		int number = scan.nextInt();
		 
		System.out.println(number%2==1);
		
		 
		
		// 문제3) 성적을 입력받아, 60점 이상이고 100점 이하이면 true 출력
		System.out.print("성적 입력: ");
		int score = scan.nextInt();
		
		System.out.println(60 <= score && score <= 100);
		
		scan.close();
		
	}
	
}
