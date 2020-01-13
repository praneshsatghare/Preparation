// https://www.geeksforgeeks.org/ola-interview-experience-for-experienced-sde-2/

import java.util.LinkedList;
import java.util.Queue;

//Q1) Given a binary String which represents the target state.
//    Minimum number of flips needed to convert a same size Binary String (with all 0’s)  to target state.
//    A flip also causes all the right bits to be flipped.
public class WaysOfSum {
    public static void main(String[] args) {
//        int r = 4;
//        int sum = 4;
//        int count = 0;
//        double maxLimit = Math.pow(10, r) - 1;
//        for (int i = 1; i <= maxLimit; i++) {
//            int num = i;
//            int sumOfNum = num % 10;
//            num = num / 10;
//            while (num != 0) {
//                sumOfNum = sumOfNum + num % 10;
//                num = num / 10;
//            }
//            if (sum == sumOfNum) {
//                System.out.println(i + "\t ");
//                count++;
//            }
//        }
//        System.out.print("\nCount " + count);

        String s = "ticpcit";
        char[] c =  s.toCharArray();
        int count =0;
        for(int i =0;i < c.length; i++){
//            String[] window = new String[c.length - i];
            String str = "";
            for(int j =0;j <=c.length; j++){
                str+=c[j];
//                window[j]=str;
               isPalindrom(str);
            }

        }

    }

    public static boolean isPalindrom(String s){
        int i = 0, j = s.length() - 1;

        // While there are characters toc compare
        while (i <= j/2) {
            // If there is a mismatch
            if (s.charAt(i) != s.charAt(j))
                return false;
            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }
        return true;
    }
}
