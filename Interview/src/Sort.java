import java.util.ArrayList;

import java.util.List;
import java.util.TreeMap;

public class Sort
{

    public static void main(String[] args){

        // what do you think about the code snippet below.

        try {
            int n =5;
            List<Integer> numberList = new ArrayList();
            numberList.add(232);
            numberList.add(115);
            numberList.add(5002);
            numberList.add(86);
            numberList.add(3234);
            numberList.add(30);
            numberList.add(434);
            numberList.add(1);
            numberList.add(50);

            TreeMap<Integer, Integer> numberMap = new TreeMap<Integer, Integer>();
            for (int i = 0 ; i < numberList.size() ; i++){
                numberMap.put(numberList.get(i), i);
            }

            System.out.println(numberMap.descendingMap());

            // print top 5 numbers with their indexes in in number_LIST


        }catch (Exception e){
            e.printStackTrace();
        }

        // Can you write a test for the greaterFunction?


    }
}