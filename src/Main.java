import java.util.HashMap;
import java.util.Map;
//Определить, сколько раз повторяется в тексте каждое слово, которое встре-
//чается в нем.
public class Main {

    public static void main(String[] args) {

        String text = "собщение тест тест сообщение привет Анатолий привет тест Анатолий Анатолий";


        String[] words = text.split(" ");


        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {

            if (map.containsKey(word)) { //есть ли слово в хешмапе и если есть прибавляем а если не новое то 1
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        for (Map.Entry<String, Integer> a : map.entrySet()) {

            System.out.println(
                    a.getKey() + " - " + a.getValue()
            );
        }
    }
}