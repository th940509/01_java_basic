package step1_05.controlStatement;
//2021/03/23 22:50 ~ 22:59 
//2021/04/22 14:18 ~ 14:24
// * scan.close (); 미리 입력하고 시작하기.

import java.util.Scanner;

/*
 * # 최대값 구하기[1단계]
 * 
 * 1. 숫자 3개를 입력받는다.
 * 2. 입력받은 3개의 수를 비교하여,
 * 3. 가장 큰 수(MAX)를 출력한다.
 */


public class IfEx12_내정답 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자1입력: ");
		int num1 = scan.nextInt();
		
		System.out.println("숫자2입력: ");
		int num2 = scan.nextInt();
		
		System.out.println("숫자3입력: ");
		int num3 = scan.nextInt();
		
		int maxNum = num1;
		
		if(maxNum < num2) {
			maxNum = num2;
		}
		if(maxNum < num3) {
			maxNum = num3;
		}
		
		System.out.println("가장 큰수: " + maxNum);
		
		scan.close();
	}
}
