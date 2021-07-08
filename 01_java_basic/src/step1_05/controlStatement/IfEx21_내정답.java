package step1_05.controlStatement;
//2021/3/23 22:29 ~ 22:47

import java.util.Random;

/*
 * # 369게임[1단계]
 * 
 * 1. 1~50 사이의 랜덤 숫자를 저장한다.
 * 2. 위 수에 369의 개수가
 * 	1) 2개이면, 짝짝을 출력
 *  2) 1개이면, 짝을 출력
 *  3) 0개이면, 해당 숫자를 출력
 * 예)
 * 		33	 : 짝짝
 * 		16	 : 짝
 * 		 7	 : 7
 */

public class IfEx21_내정답 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int number = ran.nextInt(49)+1;
		int location10 = number / 10;
		int location1 = number % 10;
		
		int count = 0;
		
		System.out.println("문제 = " + number);
		
		if(location10 == 3 || location10 == 6 || location10 ==9) {
			count ++;
			if(location1 == 3 || location1 ==6 || location1 ==9) {
				count ++;
			 }
		}
		
		else if(location1 == 3 || location1 ==6 || location1 ==9) {
			count ++;
		}
		
		else {System.out.println(number);}
		
		if(count == 1) {
			System.out.println("짝");
		}
		
		if(count == 2) {
			System.out.println("짝짝");
		}
	}
}
