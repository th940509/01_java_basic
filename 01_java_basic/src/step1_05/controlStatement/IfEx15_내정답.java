package step1_05.controlStatement;
//2021/03/22 15:58 ~ 16:07
//2021/03/23 00:18 ~ 00:20

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
		
		int num2 = ran.nextInt(100);
		
		if(num2 <= 30) System.out.print("당첨");
		
		if(num2 > 30) System.out.print("꽝");
		
		
		
		
		
		
	}

}
