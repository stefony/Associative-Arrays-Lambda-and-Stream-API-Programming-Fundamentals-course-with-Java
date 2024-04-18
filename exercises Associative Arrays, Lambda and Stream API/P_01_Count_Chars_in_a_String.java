package AssociativeArrays_2_OK;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P_01_Count_Chars_in_a_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Map<Character,Integer> symbolCount = new LinkedHashMap<>();

        for (char symbol :text.toCharArray() ) {
            if (symbol==' '){
                continue;
            }
            if (!symbolCount.containsKey(symbol)){
                symbolCount.put(symbol,1);
            }else {
                int current = symbolCount.get(symbol);
                symbolCount.put(symbol,current+1);
            }
        }
        symbolCount.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> "+ entry.getValue()));


    }
}

