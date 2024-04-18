package AssociativeArrays_2_OK;

import java.util.*;

public class P_06_Student_Academy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> studentsGrades = new LinkedHashMap<>();
        int n =Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            if (!studentsGrades.containsKey(name)){
                studentsGrades.put(name,new ArrayList<>());
            }
            studentsGrades.get(name).add(grade);
        }
        Map<String,Double> studentAverageGrade= new LinkedHashMap<>();
        for (Map.Entry<String,List<Double>>entry:studentsGrades.entrySet()) {
            String name = entry.getKey();
            List<Double> listGrade = entry.getValue();
            double averageGrade  = getListGrade(listGrade);
            if (averageGrade>=4.50){
                studentAverageGrade.put(name,averageGrade);
            }
        }
        studentAverageGrade.entrySet().forEach(entry-> System.out.printf("%s -> %.2f%n",entry.getKey(),entry.getValue()));

    }
    private static double getListGrade(List<Double>listGrade ){
        double sum=0;
        for (double grade: listGrade) {
            sum+=grade;
        }
        return sum / listGrade.size();
    }
}
