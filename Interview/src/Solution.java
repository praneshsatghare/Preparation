import java.io.*;


class Results {

    /*
     * Complete the 'countPalindromes' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int countPalindromes(String s) {
        char[] c = s.toCharArray();
        int count = 0;
        for (int i=0;i< c.length;i++){
            String str = "";
            for (int j=0;j< c.length;j++){
                str+=c[j];
                System.out.println(str);
                if(isPalindrom(str)){
                    count++;
                }
            }


        }

        return count;
    }

    public static boolean isPalindrom(String s){
        int i =0,j = s.length() - 1;
        while(i<j){
            if(s.charAt(i+1)!=s.charAt(j+1)){
                System.out.println(s + "  " + i+"  " +j);
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {


        String s = "ticocit";

        int result = Results.countPalindromes(s);

        System.out.println(result);
    }
}