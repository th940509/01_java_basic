package step1_05.controlStatement;
//2021/03/19 16:56 ~ 17:12
//2021/03/22 23:41 ~ 23:51(else사용)
//2021/04/22 13:53 ~ 14:01
/*
 * # 로그인[3단계]
 * 
 * 1. Id를 입력받아 dbId와 일치할 경우에만 Pw를 입력할 수 있다.
 * 2. Id가 틀린 경우, "Id를 확인해주세요"라는 메세지를 출력한다.
 * 3. Pw가 틀린 경우, "Pw를 확인해주세요"라는 메세지를 출력한다.
 * 4. Id와 Pw와 모두 일치하는 경우, "로그인 성공"라는 메세지를 출력한다.
 */

import java.util.Scanner;

public class IfEx10_내정답 {

	public static void main(String[] args) {
		
		int dbId = 1234;
		int dbPw = 1111;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ID를 입력하세요: ");
		int id = scan.nextInt();
		
		if(dbId == id) {
			System.out.println("PW를 입력하세요: ");
			int pw = scan.nextInt();
			if(dbPw == pw) {
				System.out.println("로그인 성공!");
			}
			if(dbPw != pw) {
				System.out.println("pw를 확인해주세요");
			}
		}
		if(dbId != id) {
			System.out.println("ID를 확인해주세요");
		}
		
		
		
		
		scan.close();
		}
			
	}

