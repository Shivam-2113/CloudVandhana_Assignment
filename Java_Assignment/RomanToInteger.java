package Java_Assignment;

import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String roman = scan.next();
        int result = RomantoInt(roman);
        System.out.println(result);
    }

    public static int getVal(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static int RomantoInt(String s) {
        int len = s.length();
        int sum = 0;
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if ((i + 1) < len && getVal(ch) < getVal(s.charAt(i + 1))) {
                sum = sum - getVal(ch);
            } else {
                sum = sum + getVal(ch);
            }
        }
        return sum;
    }
}

