import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi World");

        SomeFunctions functions = new SomeFunctions();
        String text = functions.getWelcomeText("valera");
        System.out.println(text);

        String newText = "Lorem ipsum dolor sit amet, imperdiet odio nostra, rhoncus urna et, posuere metus semper." +
                " Bibendum mi, neque nibh rhoncus leo. Sapien quis consequat sagittis tincidunt in duis, volutpat erat" +
                " quam scelerisque suspendisse in, sed erat pulvinar. Pharetra cras sem nunc diam enim, aliquam quam " +
                "sit risus nunc at, sollicitudin placerat ultricies ornare sed suspendisse, ante ullamcorper ipsum, " +
                "faucibus nulla sollicitudin eros. Nascetur mauris metus mauris a. Donec nulla nullam lacus faucibus " +
                "lacus, felis sit nibh nisl non velit libero, ut metus sit vitae cursus per, ut ipsum molestie feugiat," +
                " quam sed integer. Non eu accumsan felis gravida lacinia, cras quis mollis wisi, fermentum scelerisque" +
                " ligula, nisl adipiscing nonummy. Et ut etiam urna eget, quam sit eget, magna feugiat ante massa, " +
                "suscipit tempora, sed ac sed.";
        String[] words = newText.split(" ");
        System.out.println("Words counts is " + words.length);
        //System.out.println(words[4]);
        for (int i = 0; i < words.length; i++) {
            //   System.out.println(words[i]);
        }
        for (String word : words) {
            //System.out.println(word);
        }
        List<String> names = new ArrayList<>();
        names.add("Valera");
        names.add("Iljuwa");
        names.add("Ginger");
        names.add("Pes");

        System.out.println(names.get(1));
        for (String name : names) {
            System.out.println(name);
        }

        HashMap<String, Integer> bookUniqueWords = new HashMap<>();
        bookUniqueWords.put("the", 1);
        bookUniqueWords.put("student", 1);
        bookUniqueWords.put("is",1);
        bookUniqueWords.put("the", 2);

        for (Map.Entry<String, Integer> entry : bookUniqueWords.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }


}
