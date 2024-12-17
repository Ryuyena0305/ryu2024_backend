package day07;

import java.util.Arrays;

public class Example4 {
	public static void main(String[] args) {
		// [1]배열 사용, 학번 10개 저장하는 코드
		int[] studentIds = new int[10];

		// [2] 배열 초기화,
		// 1.
		int[] studentIds2 = new int[] { 100, 101, 102 };
		// 2.
		// int[] studentIds3 = new int[3] {100,101,102};
		// 3.
		int[] studentIds4 = { 101, 102, 103 };
		// 4.
		int[] studentIds5;
		studentIds5 = new int[] { 100, 101, 102 };
		
		//[3] 배열 사용하기 , 인덱스 사용하기
		int []num = new int[] {1,2,3,4,5,6,7,8,9,10};
		System.out.println(num);
		System.out.println(Arrays.toString(num));
		System.out.println(num[0]);
		//[4] 전체 배열 길이와 유효한 요소 값;
		double[] data = new double[5]; //실수5개를 저장할 수 있는 배열 선언
		data[0] = 10.0;
		data[1] =20.0;
		data[2]=30.0;
		for(int i =0; i<data.length;i++) {
			System.out.println(data[i]);
		}
		
		int []num1= new int[]{1,2,3,4,5};
		int sum=0;
		for(int index=0;index<=num1.length-1;index++) {
			sum+=num1[index];
			
		}

		System.out.println(sum/num1.length);

	}
}
