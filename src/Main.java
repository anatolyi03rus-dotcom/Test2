import java.io.*;

public class Main {
    // Прочитать строки из файла и поменять местами первое и последнее слова
    //в каждой строке.
    public static void main(String[] args) {

        try {

            BufferedReader reader =
                    new BufferedReader(new FileReader("text.txt"));

            String line;

            while ((line = reader.readLine()) != null) {

                String[] words = line.split(" ");

                if (words.length > 1) {

                    String temp = words[0];
                    words[0] = words[words.length - 1];
                    words[words.length - 1] = temp;
                }

                System.out.println(String.join(" ", words));
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("404");
        }
    }
}