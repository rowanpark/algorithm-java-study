/*
문제000.
(P2750_백준 온라인 저지 2750)
N개의 수가 주어졌을 때 이를 오름차순 정렬하는 프로그램을 작성하시오.

입력:
1번째 줄에 개수 N(1 ≤ N ≤ 1,000,000), 2번째 줄부터는 N개의 줄에 숫자가 주어진다.
이 수는 절댓값이 1,000,000보다 작거나 같은 정수다. 수는 중복되지 않는다.

출력:
1번째 줄부터 N개의 줄에 오름차순 정렬한 결과를 1줄에 1개씩 출력한다.
*/
package ch01;

import java.util.Arrays;
import java.util.Scanner;


public class P000OrderNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        //배열 arr 값 스캐너로 입력받아 초기화
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //오름차순 정렬_1: Arrays.sort() 메소드를 이용
        Arrays.sort(arr);

        //오름차순 정렬_2: 선택 정렬 알고리즘을 이용
//        for (int i = 0; i < n - 1; i++) {
//            int minIndex = i;
//
//            for (int j = i + 1; j < n; j++) {
//                if (arr[j] < arr[minIndex]) {
//                    minIndex = j;
//                }
//            }
//
//            int temp = arr[i];
//            arr[i] = arr[minIndex];
//            arr[minIndex] = temp;
//        }

        //정렬된 배열 출력
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        //Scanner 객체 닫기
        sc.close();

    }

    //중복 체크
    public static boolean hasDuplicate(int[] arr, int len, int num) {

        for (int i = 0; i < len; i++) {
            if (arr[i] == num) {

                return true;
            }
        }

        return false;
    }

}
