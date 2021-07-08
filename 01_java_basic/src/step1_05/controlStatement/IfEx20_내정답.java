package step1_05.controlStatement;
//2021/03/23 00:50 ~ 00:58

import java.util.Random;
import java.util.Scanner;

/*
 * # 가운데 숫자 맞추기 게임
 * 
 * 1. 150~250 사이의 랜덤 숫자 저장
 * 2. 랜덤 숫자의 가운데 숫자를 맞추는 게임이다.
 * 예)
 * 		249	: 4
 * 	    123 : 2
 * 		771 : 7
 */

public class IfEx20_내정답 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		
		int num = ran.nextInt(101)+150;
		
		System.out.println("숫자를 입력하세요: ");
		int answer = scan.nextInt();
		
		if((num % 100) / 10 == answer) {
			System.out.println("정답입니다.");
		}
		else {
			System.out.println("땡!");
		}
		
		scan.close();	
	}
}
