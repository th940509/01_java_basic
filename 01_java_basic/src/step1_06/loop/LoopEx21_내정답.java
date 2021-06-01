package step1_06.loop;
//2021/03/26 16:05 ~ 16:10
/*
 * # 2차원 반복문 구구단 출력
 * 
 * === 2단 ===
 * 2 X 1 = 2
 * 2 X 2 = 4
 * 2 X 3 = 6
 * 2 X 4 = 8
 * 2 X 5 = 10
 * 2 X 6 = 12
 * 2 X 7 = 14
 * 2 X 8 = 16
 * 2 X 9 = 18
 * === 3단 ===
 * 3 X 1 = 3
 * 3 X 2 = 6
 * ...
 * ...
 */

public class LoopEx21_내정답 {

	public static void main(String[] args) {
		
		for (int i = 2; i <= 9; i++) {
			System.out.println("================" + i + "단" + "================");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "X" + j + "= " + (i*j));
			}
			
		}
		
		System.out.println( );
		
		int k = 2;
		while (k <= 9) {
			System.out.println("================" + k + "단" + "================");
				int l = 1;
				while (l <= 9) {
					System.out.println(k + "X" + l + "= " + (k*l));
					l++;
				}
		k++;
		}
		
	}
	
}
