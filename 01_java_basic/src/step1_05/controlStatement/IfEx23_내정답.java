package step1_05.controlStatement;
//2021/03/23 1:07 ~ 1:30

import java.util.Random;
import java.util.Scanner;

/*
 * # 연산자 기호 맞추기 게임
 * 
 * 1) 1~10 사이의 랜덤 숫자 2개를 저장한다.
 * 2) 1~4 사이의 랜덤 숫자 1개를 저장한다.
 * 3) 위 숫자는 연산자 기호에 해당된다.
 * 	  1) 덧셈	  2)  뺼셈     3) 곱셈	 4) 나머지
 * 4) 사용자는 연산자 기호를 맞추는 게임이다.
 * 예) 3 ? 4  = 7
 *    1) + 2) - 3) * 4) %
 *    정답 : 2번
 */

public class IfEx23_내정답 {

	public static void main(String[] args) {

		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		
		int operators = ran.nextInt(3)+1;
		int num1 = ran.nextInt(10)+1;
		int num2 = ran.nextInt(10)+1;
		int z = 0;
		
		
		if(operators == 1) z = num1 + num2;
		if(operators == 2) z = num1 - num2;
		if(operators == 3) z = num1 * num2;
		if(operators == 4) z = num1 % num2;
		
		System.out.println(num1 + "?" + num2 + "=" + z );
		
		System.out.print("1) 덧셈	  2)  뺼셈     3) 곱셈	 4) 나머지 중 골라보세요: ");
		int answer = scan.nextInt();
		
		if(operators == answer) {
			System.out.println(answer + "번" + "정답입니다!");
		} 
		else {
			System.out.println("틀렸습니다");
		}
		scan.close();
	}
}
