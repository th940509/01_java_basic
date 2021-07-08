package step1_05.controlStatement;
//2021/03/22 15:58 ~ 16:07
//2021/03/23 00:18 ~ 00:20
//2021/04/22 14:32 ~ 14:35

import java.util.Random;

/*
 * # 당첨복권[1단계] 
 * 
 * 30%의 확률로 화면에 '당첨'이라는 글자가 화면에 출력된다.
 * 당첨되지 않은 경우는 '꽝'이라는 글자가 화면에 출력된다.
 */


public class IfEx15_내정답 {

	public static void main(String[] args) {
		
	Random ran = new Random();
	int num = ran. nextInt(100) + 1;
	
	if(num < 30) {
		System.out.println("당첨");
	} else {
		System.out.println("꽝");
	}
	
	}
}
