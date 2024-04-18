package AssociativeArrays_2_OK;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P_02_Miner_Task {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String resource = scanner.nextLine();

        Map<String,Integer> result = new LinkedHashMap<>();
        while (!resource.equals("stop")){
            int quantity = Integer.parseInt(scanner.nextLine());

            if (!result.containsKey(resource)){
                result.put(resource,quantity);
            }else {
                int current  = result.get(resource);
                result.put(resource,current+quantity);
            }

            resource= scanner.nextLine();

        }
        result.entrySet().forEach(entry-> System.out.println(entry.getKey() + " -> " + entry.getValue()));

    }
}

