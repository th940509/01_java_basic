package step1_05.controlStatement;
//2021/03/22 15:45 ~ 15:57
//2021/03/23 00:07 ~ 00:18

import java.util.Random;
import java.util.Scanner;

/*
 * # 코인 게임
 * 
 * 1. 0 또는 1의 랜덤 숫자를 저장한다.
 * 2. 0은 동전의 앞면, 1은 동전의 뒷면이다.
 * 3. 동전의 앞뒷면을 맞추는 게임이다.
 */

public class IfEx14_내정답 {

	public static void main(String[] args) {
	
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int coin = ran.nextInt(2);
		
		System.out.println("동전 앞면(0), 뒷면(1)을 입력하세요: ");
		int z = scan.nextInt();
		
		System.out.println(coin);
		
		if(z == 0) {
			if(coin == 0) {System.out.println("앞면 정답!");
			} else {System.out.println("땡");
			}
		}
		
		if(z == 1) {
			if(coin == 1) {System.out.println("뒷면 정답!");
			} else {System.out.println("땡");
			}
		}
		
		scan.close();
		
	}

}
