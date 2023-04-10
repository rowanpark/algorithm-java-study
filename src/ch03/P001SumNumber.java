/*
문제001.
(P11720_백준 온라인 저지 11720)
N개의 숫자가 공백 없이 써 있다. 이 숫자를 모두 합해 출력하는 프로그램을 작성하시오.

입력:
1번째 줄에 숫자의 개수 N(1 ≤ N ≤ 100), 2번째 줄에 숫자 N개가 공백 없이 주어진다.

출력:
입력으로 주어진 숫자 N개의 합을 출력한다.
*/
package ch03;

import java.util.Scanner;

public class P001SumNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        //문자열 입력받기
        int n = sc.nextInt();
        String sNum = sc.next();
        
        //문자열을 문자 배열로 변환
        char[] cNum = sNum.toCharArray();
        
        //각 문자를 하나씩 더하기
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += cNum[i] - '0';
//            sum += sNum.charAt(i) - '0';
//            sum += Character.getNumericValue(cNum[i]);
//            sum += Character.getNumericValue(sNum.charAt(i));
        }
        
        //결과 출력
        System.out.println(sum);
        
        sc.close();
        
    }
}
