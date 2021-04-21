package step1_05.controlStatement;
//2021/03/17 15:32 ~ 15:41
//2021/04/21 14:37 ~ 14:42

import java.util.Scanner;

/*
 * # 로그인[1단계]
 * 
 * 1. Id와 Pw를 입력받는다.
 * 2. 입력받은 데이터와 db데이터를 비교해 로그인 처리를 진행한다.
 * 예) 로그인 성공 or 로그인 실패
 */


public class IfEx04_내정답 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dbId = 1234;
		int dbPw = 1111;

		System.out.print("ID: ");
		int id = scan.nextInt();
		
		System.out.print("PW: ");
		int pw = scan.nextInt();
		
		if(dbId == id && dbPw == pw) {System.out.println("로그인 성공!");}
		if(dbId != id && dbPw == pw) {System.out.println("로그인 실패");}
		if(dbId == id && dbPw != pw) {System.out.println("로그인 실패");}
		if(dbId != id && dbPw != pw) {System.out.println("로그인 실패");}
		
		
		scan.close();
		

	}

}
