package step1_05.controlStatement;
//2021/03/22 16:07 ~ 16:20
//2021/03/23 00:21 ~ 00:27
//2021/04/22 14:36 ~ 14:40

import java.util.Random;
import java.util.Scanner;

/*
 * # 홀짝 게임
 * 
 * 1. 1~100사이의 랜덤 숫자를 저장한다.
 * 2. 저장된 랜덤 숫자를 보여주고,
 * 3. 해당 숫자가 홀수인지 짝수인지 맞추는 게임이다.
 * 
 */

public class IfEx16_내정답 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int num = ran.nextInt(100)+1;
		System.out.print("1. 홀수, 2. 짝수: ");
		int choice = scan.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num);
			if(choice == 2) {
				System.out.println("짝수정답!");
			} else {
				System.out.println("땡");
			}
		}
		if(num % 2 == 1) {
			System.out.println(num);
			if(choice == 1) {
				System.out.println("홀수정답!");
			} else {
				System.out.println("땡");
			}
		}
		
		
		
		scan.close();

	}

}
