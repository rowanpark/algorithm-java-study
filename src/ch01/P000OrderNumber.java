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

        System.out.println("title: P000_수 정렬하기");
        System.out.println("N개의 수가 주어졌을 때 이를 오름차순 정렬하는 프로그램을 작성하시오.\n");

        Scanner sc = new Scanner(System.in);
        int n;

        //정수 n 입력
        while (true) {
            System.out.println("정수 N을 입력하세요. (1 <= N <= 1,000,000)");
            System.out.print("=> ");
            n = sc.nextInt();

            //n의 범위를 제한
            if (n >= 1 && n <= 1000000) {
                break;
            } else {
                System.out.println("1 이상 1,000,000 이하의 정수를 입력해주세요.");
            }
        }

        //n개의 인덱스를 가진 배열 arr 생성
        int[] arr = new int[n];

        //배열 arr 값 스캐너로 입력받아 초기화_1
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }

        //배열 arr 값 스캐너로 입력받아 초기화_2
        for (int i = 0; i < n; i++) {
            System.out.printf("%d번째 숫자: ", i + 1);
            int num = sc.nextInt();

            //num의 범위를 제한
            if (num <= -1000000 || num >= 1000000) {
                System.out.println("-1,000,000 이상 1,000,000 이하의 정수이어야 합니다.");
                i--;
                continue;
            }

            //중복된 수를 입력하지 못하게 하는 코드 추가
            if (hasDuplicate(arr, i, num)) {
                System.out.println("중복된 수를 입력하셨습니다. 다시 입력해주세요.");
                i--;
                continue;
            }

            arr[i] = num;
        }

        //오름차순 정렬_1: Arrays.sort() 메소드를 이용
//        Arrays.sort(arr);

        //오름차순 정렬_2: 선택 정렬 알고리즘을 이용
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        //정렬된 배열 출력
        System.out.println("\n결과:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        //Scanner 객체 닫기
        sc.close();
        //Scanner 객체를 닫아주는 이유:
        //1. Scanner 클래스가 사용하는 시스템 리소스를 해제하고, 프로그램이 종료되어도 사용중인 리소스를 계속 점유하지 않도록 하기 위해서
        //2. 프로그램이 메모리를 더 효율적으로 사용하게 하고, 프로그램이 종료되었을 때 자원 누수를 방지할 수 있음
        //3. 그러므로, 가능하면 Scanner 사용 후에는 close() 메도드를 호출해주는 것이 좋음        

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
