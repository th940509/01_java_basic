package step1_05.controlStatement;
//2021/03/19 16:12 ~ 16:20
//2021/03/22 23:30 ~ 23:33(if사용)
//2021/03/22 23:24 ~ 23:30(else, else if사용)

import java.util.Scanner;

/*
 * # 성적 유효성 검사
 * 
 * 1. 성적을 입력받는다.
 * 2. 성적이 60점 이상이면 합격, 60점 미만이면 불합격이다.
 * 3. 단, 입력받은 성적이
 *    음수이거나 100점을 초과하면, 예외 메세지를 출력한다.
 *    예) 성적을 잘못 입력했습니다.
 */

public class IfEx07_내정답 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("성적을 입력하세요: ");
		int grade = scan.nextInt();
		
		if(60 <= grade && grade <=100)System.out.println("합격");
		if(0 <= grade && grade < 60)System.out.println("불합격");
		if(grade < 0 || 100 < grade)System.out.println("성적을 잘못 입력하셨습니다.");
		
		scan.close();
		
	}

}
