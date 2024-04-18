package AssociativeArrays_2_OK;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class P_08_Company_Users {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashMap<String, List<String>> companies = new LinkedHashMap<>();
        while (!input.equals("End")){
            String []data = input.split("->");

            if (companies.containsKey(data[0])){
                List<String> employee = companies.get(data[0]);

                if (!employee.contains(data[1])){
                    employee.add(data[1]);
                }

            }else {
                List<String> employee = new ArrayList<>();
                employee.add(data[1]);
                companies.put(data[0],employee);
            }

            input= scanner.nextLine();
        }
        companies.entrySet().stream().forEach(company-> {System.out.println(company.getKey());
            company.getValue().forEach(employee-> System.out.println("--" + employee));});
    }
}
