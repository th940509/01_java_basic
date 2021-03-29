package step1_06.loop;
//2021/03/29 10:40 ~ 11:05

import java.util.Scanner;

/*
 * # 소수찾기[2단계]
 * 
 * 정수 한 개를 입력받아, 2부터 해당 숫자까지의 모든 소수 출력
 * 예)
 * 입력 : 20
 * 2, 3, 5, 7, 11, 13, 17, 19
 * 
 */

public class LoopEx23_내정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int num = scan.nextInt();
		int pnCnt = 0;
		
		for (int i = 2; i <= num; i++) {
			
			
			pnCnt = 0;
			for (int j = 1; j <= i; j++) {
				if(i%j == 0) {
					pnCnt ++;
				}
			}
				
			if(pnCnt ==2) {
				System.out.print(i + " ");
			}
		}
		
	scan.close();
	}
	
}
