package task2;

public class PoemFixer {

    public String[] readPoem() {
        return new String[]{
                "   Это кто там ложку «ложит»?",
                "",
                "   ",
                "Знай, такого быть не может!",
                "  Ложку мы на стол кладём,  ",
                "",
                "А тебя – к обеду ждём."
        };
    }

    public String fixPoem(String[] poem) {
        StringBuilder p = new StringBuilder();
        for (String line : poem){
            if (!line.isBlank() && !line.isEmpty()){
                p.append(line.trim());
                p.append("\n");
            }
        }
        return p.toString();
    }

    public static void main(String[] args) {
        PoemFixer poemFixer = new PoemFixer();
        String[] poem = poemFixer.readPoem();
        String poemAsString = poemFixer.fixPoem(poem);
        System.out.println(poemAsString);
    }
}