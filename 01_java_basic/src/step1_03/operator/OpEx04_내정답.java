package step1_03.operator;
//2021/03/18 15:26 ~ 15:41 (문제1-2) 15:50 ~ 15:59 (문제3)
//2021/04/21 14:15 ~ 14:20

public class OpEx04_내정답 {

	public static void main(String[] args) {
		
		//예) 점수가 60점 이상이면 true 출력
        int score = 30;
        System.out.println(score >= 60);
        
        
        //문제1) 15가 3의 배수이면 true 출력
        //힌트) 숫자를 3으로 나눈 나머지가 0이면 3의 배수
        int number = 15;
        System.out.println(number%3 == 0);
    
        
        //문제2) 100이 짝수이면 true 출력
        //힌트) 숫자를 2로 나눈 나머지가 0이면 짝수
        //      숫자를 2로 나눈 나머지가 1이면 홀수
        int number02 = 100;
        System.out.println(number02%2 == 0);


        //문제3)아래돈중 1000원짜리 이상화폐를 제외한 1000원짜리가 3장 이상이면 true 출력
        int money = 178600;
        int thousand = 1000;
        int fiveThousand = 5000;
        int tenThousand = 10000;
        int fiftyThousand = 50000;
        
        System.out.println((((money % fiftyThousand) % tenThousand) % fiveThousand) > 3*(thousand));

	}

}
