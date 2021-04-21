package step1_05.controlStatement;
//2021/03/22 23:08 ~ 23:14 
//2021/04/21 17:54 ~ 18:10

import java.util.Scanner;

/*
 * # 로그인[2단계]
 * 
 * 1. Id와 Pw를 입력받아 회원가입을 진행한다.
 * 2. 이후 로그인을 위해 다시 Id와 Pw를 입력받는다.
 * 3. 가입 후 저장된 데이터와 로그인 시 입력받은 데이터를 비교한다.
 * 예) 로그인 성공 or 로그인 실패
 */


public class IfEx05_내정답 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int dbId = 0;
	int dbPw = 0;
	
	System.out.println("회원가입을 진행합니다.");
	System.out.print("Id 입력: ");
	dbId = scan.nextInt();
	
	System.out.print("Pw 입력: ");
	dbPw = scan.nextInt();
			
	System.out.println("회원가입이 완료되었습니다.");
	
	System.out.print("[로그인] ID: ");
	int myId = scan.nextInt();
	
	System.out.print("[로그인 ] PW: ");
	int myPw = scan.nextInt();
	
	if(dbId == myId && dbPw == myPw) {
		System.out.println("로그인 성공");
	}
	if(dbId != myId || dbPw !=myPw) {
		System.out.println("로그인 실패");
	}
	scan.close();
	
		
	}

}
