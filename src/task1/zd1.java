package task1;

public class zd1 {
    public static void main(String[] args) {

        String start = "Привет! Меня зовут ";

        StringBuilder hello = new StringBuilder(); // создайте StringBuilder с началом start
        hello.append("Максим"); // добавьте подстроку "<ваше имя>"
        hello.append(". Я из города"); // добавьте подстроку "<ваше имя>"
        hello.append(". Казань"); // добавьте подстроку "<ваше имя>"




        String asString = start + hello.toString();
        System.out.println(asString);
    }
}