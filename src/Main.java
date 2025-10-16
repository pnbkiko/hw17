import task3.FindRepeats;
import task4.Palindrome;
import task5.Grades;
import task6.GradesReversed;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GradesReversed g = new GradesReversed();
        String[] s = new String[]{"Вероника Чехова физика — Безупречно", "Анна Строкова математика — Потрясающе","Иван Петров геометрия — Безупречно"};
        System.out.println(g.serializeGrades(s));
    }
}