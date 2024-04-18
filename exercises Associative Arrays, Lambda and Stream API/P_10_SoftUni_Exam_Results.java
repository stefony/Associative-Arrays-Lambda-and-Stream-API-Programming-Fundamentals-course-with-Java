package AssociativeArrays_2_OK;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P_10_SoftUni_Exam_Results {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,Integer> userPoint = new LinkedHashMap<>();
        Map<String,Integer> languageCount = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("exam finished")){
            String[] data = input.split("-");
            String userName = data[0];
            if (data.length==3){
                String language = data[1];
                int point = Integer.parseInt(data[2]);

                if (!userPoint.containsKey(userName)){
                    userPoint.put(userName,point);
                }else {
                    int current = userPoint.get(userName);
                    if (point>current){
                        userPoint.put(userName,point);
                    }
                }
                if (!languageCount.containsKey(language)){
                    languageCount.put(language,1);
                }else {
                    languageCount.put(language,languageCount.get(language)+1);
                }
            }else {
                userPoint.remove(userName);
            }
            input= scanner.nextLine();
        }
        System.out.println("Results:");userPoint.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " | " + e.getValue()));

        System.out.println("Submissions:");languageCount.entrySet().stream() .sorted(Map.Entry.<String, Integer>comparingByKey().reversed()
                .thenComparing(Map.Entry.comparingByValue())).forEach(e -> System.out.println(e.getKey() + " - " + e.getValue()));
    }
}
