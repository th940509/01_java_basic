package step1_05.controlStatement;
//2021/03/22 17:05 ~ 17:14
//2021/03/23 00:28 ~ 00:37

import java.util.Random;
import java.util.Scanner;

/*
 * # 가위바위보 게임
 * 
 *   if - else if , else 등 구문을 활용하여 자율적으로 작성해보자.
 *   
 *   0 : 가위 , 1 : 바위 , 2 : 보
 */

public class IfEx18_내정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		System.out.println("가위바위보를 입력하세요 가위(0), 바위(1), 보(2):  ");
		int me = scan.nextInt();
		
		int com = ran.nextInt(3);
		System.out.println(com);
		
		if (me == com) {
			System.out.println("비겼습니다!");
		}
		else if ((me == 0) && (com ==1)) {
			System.out.println("졌습니다!");
		}
		else if ((me == 0) && (com ==2)) {
			System.out.println("이겼습니다!");
		}
		else if ((me == 1) && (com ==0)) {
			System.out.println("이겼습니다!");
		}
		else if ((me == 1) && (com ==2)) {
			System.out.println("졌습니다!");
		}
		else if ((me == 2) && (com ==0)) {
			System.out.println("졌습니다!");
		}
		else if ((me == 2) && (com ==1)) {
			System.out.println("이겼습니다!");
		}
		
		scan.close();
		

	}
}
