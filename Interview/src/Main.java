import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


class Result {

    /*
     * Complete the 'listMax' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY operations
     */

    public static long listMax(int n, List<List<Integer>> operations) {
        int row = operations.size();
        // Write your code here
        int[][] arr = new int[row][n];
//        for(int i = 0;i<row;i++){
//            for(int j = 0;j<n;j++){
//                    arr[i][j]=0;
//            }
//        }
        int max = 0;
        int first = 0;
        int second = 0;
        for (int i = 1; i <= operations.size() + 1; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1) {
                    arr[i - 1][j - 1] = 0;
                } else {
                    first = operations.get(i - 2).get(0);
                    second = operations.get(i - 2).get(1);
                    if (i - 1 < operations.size() && j >= first && j <= second) {
                        arr[i - 1][j - 1] = arr[i - 2][j - 1] + operations.get(i - 1).get(2);
                    } else {
                        arr[i - 1][j - 1] = 0;
                    }
                }
                System.out.print("[ " + arr[i - 1][j - 1] + " ]" +"F1:" + first + " S1:" + second + "i:" + i + " j:" + j + "\t\t\t\t\t");
                if (arr[i - 1][j - 1] > max) {
                    max = arr[i - 1][j - 1];
                }
            }
            System.out.print("\n");
        }
        for (int i = 0; i < operations.size() + 1; i++) {
            for (int j = 0; j < n; j++) {

            }
        }
        return max;

    }

}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = 5;

        int operationsRows = 3;
        int operationsColumns = 3;
        List<List<Integer>> operations = new ArrayList<>();
        String[] s = new String[3];
        s[0] = "1 2 100";
        s[1] = "2 5 100";
        s[2] = "3 4 100";

        for (int i = 0; i < operationsRows; i++) {
            String[] operationsRowTempItems = s[i].replaceAll("\\s+$", "").split(" ");
            List<Integer> operationsRowItems = new ArrayList<>();
            for (int j = 0; j < operationsColumns; j++) {
                int operationsItem = Integer.parseInt(operationsRowTempItems[j]);
                operationsRowItems.add(operationsItem);
            }
            operations.add(operationsRowItems);
        }
        long result = Result.listMax(n, operations);
        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
