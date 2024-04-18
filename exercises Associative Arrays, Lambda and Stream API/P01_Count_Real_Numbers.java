package associativeArreyExercise_OK;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P01_Count_Real_Numbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        TreeMap<Double,Integer> countMap = new TreeMap<>();
        for (double num: numbers) {

            if (!countMap.containsKey(num)){
                countMap.put(num,1);
            }else {
                int value = countMap.get(num);
                countMap.put(num,value+1);
            }

            }
        for (Map.Entry<Double, Integer> entry : countMap.entrySet()) {
            System.out.printf("%.0f -> %d%n",entry.getKey(),entry.getValue());

        }

    }
}
