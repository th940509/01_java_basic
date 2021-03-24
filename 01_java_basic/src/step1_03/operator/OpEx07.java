package step1_03.operator;

public class OpEx07 {

	public static void main(String[] args) {
		
		int tempData1 = 100;
		tempData1 -= 3; //tempData1 = tempData1 - 3;
		System.out.println(tempData1);
		
		int tempData2 = 10;
		tempData2 += 100; //tempData2 = tempData2 + 100;
		System.out.println(tempData2);
		
		int tempData3 = 100;
		tempData3 *=7; //tempData3 = tempData3 * 7;
		System.out.println(tempData3);
		
		/*
		 * 
		 *  x = x + 1
		 *  x += 1
		 *  x++
		 *  ++x
		 * 
		 *  x = x - 1
		 *  x -= 1
		 *  x--
		 *  --x
		 * 
		 * 
		 * */
		 // ++변수와 --변수의 차이점
		
		System.out.println();
		
		int x = 0;
		System.out.println(x++); // ++변수 왼쪽 명령어를 먼저 수행하고 ++명령어가 수행된다.
		System.out.println(x);
		System.out.println();
		
		int y = 0;
		System.out.println(++y); // ++명령어가 수행되고 ++변수 왼쪽 명령어가 수행된다.
		System.out.println(y);
		System.out.println();
	}

}
