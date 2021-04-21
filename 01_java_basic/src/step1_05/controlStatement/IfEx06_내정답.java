package step1_05.controlStatement;
//2021/03/19 16:00 ~ 16:08
//2021/03/22 23:15 ~ 23:23
//2021/04/21 18:10 ~ 18:14

import java.util.Scanner;

/*
 * # 구구단 게임[1단계]
 * 
 * 1. 구구단 문제를 출제하기 위해, 숫자 2개를 입력받는다.
 * 2. 입력받은 숫자를 토대로 구구단 문제를 출력한다.
 * 예)	3 x 7 = ?
 * 3. 문제에 해당하는 정답을 입력받는다.
 * 4. 정답을 비교 "정답" 또는 "땡"을 출력한다.
 */


public class IfEx06_내정답 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자1 입력: ");
		int num1 = scan.nextInt();
		
		System.out.print("숫자2 입력:");
		int num2 = scan.nextInt();
		
		System.out.println("정답: ");
		int result = scan.nextInt();
		
		if(result == num1*num2) {
			System.out.println(" 정답!");
		}
		if(result != num1*num2) {
			System.out.println("땡!");
		}
		scan.close();
		
		

	}

}
