import java.io.IOException;

public class StringPrograms {

    public static void main(String[] args) throws IOException {
        int[] myIntArray = {1,2,5,3,7,8,6,4};
       minimumBribes(myIntArray);
//        for(int i = 0 ; i < array.length;i++){
//            System.out.print(array[i]);
//        }

    }
    static void minimumBribes(int[] q) {
        int maxRotation = 0;
        boolean flag = true;
        for(int i = 0 ; i < q.length;i++){
            int diff = q[i]-(i+1);
            System.out.println("diff " + diff);
            if(diff>2){
                System.out.println("Too chaotic");
                flag = false;
                break;
            } else {
                if(/*maxRotation > q[i]-(i+1) && */diff > 0){
                    maxRotation = maxRotation + diff;
                } else if(diff < -2){
                    maxRotation = maxRotation + 1;
                }

            }
        }
        if(flag)
        System.out.println(maxRotation);
    }
}
