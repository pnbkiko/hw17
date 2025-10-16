package task3;

public class FindRepeats {
    public int numberOfRepeats(String text, String substring) {
        int count = 0;
        // код метода
        StringBuilder builder = new StringBuilder(text);
        while (builder.indexOf(substring)!= -1){

            count+= 1;
            builder.delete(builder.indexOf(substring), builder.indexOf(substring)+ substring.length());
        }


        return count;
    }
}