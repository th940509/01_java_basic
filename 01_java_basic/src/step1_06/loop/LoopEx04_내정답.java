package step1_06.loop;
//2021/03/23 16:04 ~ 16:29
/*
 * # 구구단 게임[3단계]
 * 
 * 1. 구구단 게임을 5회 반복한다.
 * 2. 정답을 맞추면 20점이다.
 * 3. 게임 종료 후, 성적을 출력한다.
 * 
 */

import java.util.Random;
import java.util.Scanner;

public class LoopEx04_내정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		
		int score = 0;
		int i = 1;
		
		while(i < 6) {
			int num1 = ran.nextInt(9)+1;
			int num2 = ran.nextInt(9)+1;
			int total = num1 * num2;
			
			System.out.print(num1+"X"+num2+"=");
			int me = scan.nextInt();
			if(total == me) {
				System.out.println("정답!");
				score += 20;
			}
			if(total != me) {
				System.out.println("땡");
			}
		i++;
		}
		
		System.out.print("총 점수는 = " + score);
		
		scan.close();
	}
}
