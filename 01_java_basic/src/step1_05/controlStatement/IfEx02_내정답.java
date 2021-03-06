package step1_05.controlStatement;
//2021/03/19 22:39 ~ 22:44
//2021/04/21 14:29 ~ 14:32

import java.util.Scanner;

/*
 * # Up & Down 게임[1단계]
 * 
 * 1. com은 8이다.
 * 2. me는 com의 숫자를 맞추는 게임이다.
 * 3. 다음과 같은 메세지를 출력한다.
 * 1) me < com	: Up!
 * 2) me == com : Bingo!
 * 3) me > com  : Down!
 */

public class IfEx02_내정답 {

	public static void main(String[] args) {

		int com = 8;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 입력: " );
		int me = scan.nextInt();
		
		if(me < com) {
			System.out.println("UP!");
		}
		if(me == com) {
			System.out.println("BINGO!");
		}
		
		if(me > com) {
			System.out.println("DOWN");
		}
		
		scan.close();
		
	}

}
