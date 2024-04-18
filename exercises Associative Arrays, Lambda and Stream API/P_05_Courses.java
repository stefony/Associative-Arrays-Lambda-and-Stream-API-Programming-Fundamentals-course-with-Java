package AssociativeArrays_2_OK;

import java.util.*;

public class P_05_Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> course = new LinkedHashMap<>();
        String command = scanner.nextLine();
        while (!command.equals("end")){
            String [] data = command.split(" : ");
            String courseName = data[0];
            String registeredStudents = data[1];

            if (!course.containsKey(courseName)){
                course.put(courseName, new ArrayList<>());
            }
            course.get(courseName).add(registeredStudents);

            command= scanner.nextLine();
        }
        course.entrySet().forEach(entry -> {System.out.println(entry.getKey() + ": " + entry.getValue().size());
            entry.getValue().forEach(registeredStudents -> System.out.println("-- " + registeredStudents));});

    }
}
