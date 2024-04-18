package AssociativeArrays_2_OK;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P_07_Legendary_Farming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,Integer> items = new LinkedHashMap<>();
        items.put("shards",0);
        items.put("fragments",0);
        items.put("motes",0 );

        Map<String,Integer> junkItems = new LinkedHashMap<>();
        boolean isWin = false;
        while (!isWin){
            String input = scanner.nextLine();
            String[] data = input.split("\\s+");
            for (int index = 0; index <=data.length-1; index+=2) {
                int quantity = Integer.parseInt(data[index]);
                String material = data[index+1].toLowerCase();

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")){
                    int currentQuantity = items.get(material);
                    items.put(material,currentQuantity+quantity);
                }else {
                    if (!junkItems.containsKey(material)){
                        junkItems.put(material,quantity);
                    }else {
                        int current1 = junkItems.get(material);
                        junkItems.put(material,current1 + quantity);
                    }

                }
                if (items.get("shards")>=250){
                    System.out.println("Shadowmourne obtained!");
                    items .put("shards",items.get("shards")-250);
                    isWin=true;
                    break;
                }else if (items.get("fragments")>=250){
                    System.out.println("Valanyr obtained!");
                    items.put("fragments",items.get("fragments")-250);
                    isWin=true;
                    break;
                }else if (items.get("motes")>=250){
                    System.out.println("Dragonwrath obtained!" );
                    items.put("motes",items.get("motes")-250);
                    isWin=true;
                    break;
                }

            }
            if (isWin){
                break;
            }

        }
        items.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
        junkItems.entrySet().forEach(entry-> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
