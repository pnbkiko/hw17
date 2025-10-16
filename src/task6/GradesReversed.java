package task6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class GradesReversed {

    private String gradeStringToInt(String grade) {
        switch (grade) {
            case "Безупречно": {
                return "5";
            }
            case "Потрясающе": {
                return "4";
            }
            case "Восхитительно": {
                return "3";
            }
            case "Прекрасно": {
                return "2";
            }
            default:
                return "1";
        }
    }

    public String serializeGrades(String[] grades) {
        StringBuilder str = new StringBuilder();
        String so = "";
       for (String l : grades){
           String[] s = l.split(" ");

           String name = s[0].toLowerCase();
           String surname = s[1].toLowerCase();
           String subject = s[2].toLowerCase();
           String grade = gradeStringToInt(s[4]);
          so = String.join(", ", name, surname, subject, grade);

          str.append(so);
          str.append("; ");
       }
       return str.toString();

    }

}