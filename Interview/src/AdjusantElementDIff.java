

   import java.util.*;

    public class AdjusantElementDIff {
        public static void bfs(int m, int n, int num) {
            Queue<Integer> q = new LinkedList<Integer>();
            q.add(num);
            while (!q.isEmpty()) {
                int stepNum = q.poll();
                if (stepNum <= n && stepNum >= m) {
                    System.out.print(stepNum + " | ");
                }
                if (stepNum == 0 || stepNum > n)
                    continue;
                int lastDigit = stepNum % 10;
                int stepNumA = stepNum * 10 + (lastDigit - 1);
                int stepNumB = stepNum * 10 + (lastDigit + 1);
                if (lastDigit == 0)
                    q.add(stepNumB);
                else if (lastDigit == 9)
                    q.add(stepNumA);
                else {
                    q.add(stepNumA);
                    q.add(stepNumB);
                }
            }
        }

        public static void main(String args[]) {
            int n = 0, m = 124;
            for (int i = 0; i <= 9; i++)
                bfs(n, m, i);
        }
    }

