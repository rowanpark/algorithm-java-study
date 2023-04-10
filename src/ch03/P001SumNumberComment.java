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

import java.util.Arrays;
import java.util.Scanner;

public class P001SumNumberComment {
    public static void main(String[] args) {

        System.out.println("title: P001_숫자의 합 구하기");
        System.out.println("N개의 숫자가 공백 없이 써 있다. 이 숫자를 모두 합해 출력하는 프로그램을 작성하시오.");

        Scanner sc = new Scanner(System.in);

        //정수 입력받기
        long n; //int -> long
        while (true) {
            System.out.println("\n정수 N을 입력하세요. (1 <= N <= 100)");
            System.out.print("=> ");

            try {
                n = Long.parseLong(sc.nextLine()); //Integer.parseInt() -> Long.parseLong()

                //n의 범위를 제한
                if (n >= 1 && n <= 100) {
                    break;
                } else {
                    System.out.println("WARNING: 1 이상 100 이하의 정수를 입력해주세요.");
                }

            } catch (NumberFormatException e) {
                System.out.println("WARNING: 숫자를 입력해주세요.");
            }

        }

        //문자열 입력받기_1: try_catch문, Integer.parseInt() 사용
        String sNum="";
        while (true) {
            System.out.println("\n" + n + "개의 숫자를 공백없이 입력하세요.");
            System.out.print("=> ");

            try {
                sNum = sc.nextLine();
                Long.parseLong(sNum);   //문자열을 정수로 변환하여 예외 처리, 문자열이 숫자로만 이루어져 있는지 확인
                                        //문자열이 숫자로만 이루어져 있지 않으면 NumberFormatException 발생
                                        //Integer.parseInt() -> Long.parseLong()

//                System.out.println("n: " + n);
//                System.out.println("sNum.length(): " + sNum.length());

                if (sNum.length() != n) {
                    System.out.println("WARNING: " + n + "개의 숫자를 입력해주세요.");

                    continue;
                }

                break;                  //문자열이 정수로 변환 가능하면 while문 탈출

            } catch (NumberFormatException e) {
                System.out.println("WARNING: 숫자를 입력해주세요.");
            }

        }

        //문자열 입력받기_2: if문, Character.isDigit() 사용
//        String sNum = "";
//        boolean isNumeric = true;
//        while (isNumeric) {
//            System.out.println("\n숫자를 공백없이 입력하세요.");
//            System.out.print("=> ");
//            sNum = sc.nextLine();
//
//            //숫자 여부 판단
//            for (int i = 0; i < sNum.length(); i++) {
//                if (!Character.isDigit(sNum.charAt(i))) { //주어진 문자가 10진수 숫자인지 여부 판단
//                    isNumeric = false;
//
//                    break;
//                }
//            }
//
//            if (isNumeric) {
//                break;
//            } else {
//                System.out.println("WARNING: 숫자를 입력해주세요.");
//            }
//
//        }

        //문자열 입력받기_3: if문, 정규 표현식 \\d+ 사용
//        String sNum = "";
//        while (true) {
//            System.out.println("\n숫자를 공백없이 입력하세요.");
//            System.out.print("=> ");
//            sNum = sc.nextLine();
//
//            if (sNum.matches("\\d+")) {
//                break;
//            } else {
//                System.out.println("WARNING: 숫자를 입력해주세요.");
//            }
//        }

        //문자열 입력받기_4: if문, 정규 표현식 [0-9]+ 사용
//        String sNum = "";
//        while (true) {
//            System.out.println("\n숫자를 공백없이 입력하세요.");
//            System.out.print("=> ");
//            sNum = sc.nextLine();
//
//            if (sNum.matches("[0-9]+")) {
//                break;
//            } else {
//                System.out.println("WARNING: 숫자를 입력해주세요.");
//            }
//        }

        //문자열을 문자 배열로 변환
        char[] cNum = sNum.toCharArray();
//        for (int i = 0; i < cNum.length; i++) {
//            System.out.println(cNum[i]);
//        }
//        System.out.println(Arrays.toString(cNum));

        //각 문자를 하나씩 더하기
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += cNum[i] - '0';
//            sum += sNum.charAt(i) - '0';
//            sum += Character.getNumericValue(cNum[i]);
//            sum += Character.getNumericValue(sNum.charAt(i));
        }

        //결과 출력
        System.out.println("\n결과:");
        System.out.println(sum);

        sc.close();

    }
}

