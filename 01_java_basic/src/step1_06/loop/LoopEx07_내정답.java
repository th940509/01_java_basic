package step1_06.loop;
//2021/03/23 23:10 ~ 21:23

/*
 * # Up & Down 게임[2단계]
 * 
 * 1. 1 ~ 100까지의 난수를 생성한다.
 * 2. 스캐너를 이용해 정답을 맞추기를 시도하고 정답을 맞출경우 게임은 종료된다.
 * 3. 점수는 100점부터 시작해서 오답을 입력할 때마다 5점씩 차감된다.
 * 4. 게임 종료 후, 점수를 출력한다.
 * 
 */

import java.util.Random;
import java.util.Scanner;

public class LoopEx07_내정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int num = ran.nextInt(99)+1;
		int score = 100;
		int minusCount = 0;
		boolean isRunning = true;
		
		
		while(isRunning) {
			
			if(minusCount == 20) {
				System.out.println("실패!");
				isRunning = false;
			}
			
			System.out.print("숫자를 입력하세요: ");
			int myAnswer = scan.nextInt();
			
			if (myAnswer > num) {
				System.out.println("DOWN!");
				minusCount ++;
			}
			
			else if (myAnswer < num) {
				System.out.println("UP!");
				minusCount ++;
			}			
			else if (myAnswer == num) {
				System.out.println("빙고");
				isRunning = false;
			}
		}
		
		System.out.print("점수 = " + (score - (5 * minusCount)));
		
		scan.close();
		

		
	}

}
