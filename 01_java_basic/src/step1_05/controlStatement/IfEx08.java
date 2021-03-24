package step1_05.controlStatement;

import java.util.Scanner;

public class IfEx08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("# 성적 입력: ");
		int getgrade = scan.nextInt();
		
		if (getgrade >= 60) {
			if (getgrade ==100) {
				System.out.println("만점");
			}
			System.out.println("합격");
		}
		
		if (getgrade < 60) { 
			System.out.println("불합격");
		} 
		
		scan.close();
		
		
		
		
		
		
		
	}

}
