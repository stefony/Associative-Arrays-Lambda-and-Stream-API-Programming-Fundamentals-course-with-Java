package AssociativeArrays_2_OK;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P_04_SoftUni_Parking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        Map<String,String> parkingValidation = new LinkedHashMap<>();

        for (int i = 0; i < n ; i++) {
            String [] data  = scanner.nextLine().split("\\s+");
            String command = data[0];
            String userName = data[1];


            switch (command){
                case "register":
                    String licensePlate = data[2];


                    if (!parkingValidation.containsKey(userName)){
                        parkingValidation.put(userName,licensePlate);
                        System.out.println(userName +  " registered " + licensePlate +  " successfully");
                    }else {
                        System.out.println(" ERROR: already registered with plate number " + licensePlate);

                    }
                    break;

                case "unregister":
                    if (!parkingValidation.containsKey(userName)){
                        System.out.println("ERROR: user " +  userName +  " not found");
                    }else {
                        parkingValidation.remove(userName);
                        System.out.println(userName + " unregistered successfully");
                    }
                    break;

            }

        }
        parkingValidation.forEach((userName,licensePlate) -> System.out.println(userName + " => " + licensePlate));

    }
}
