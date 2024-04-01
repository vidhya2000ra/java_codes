package collectionInJava.map;

import java.io.File;
import java.util.*;

public class Example5 {

    public static String alphabetize(String word)
    {
        char[] alpha = word.toCharArray();
        Arrays.sort(alpha);
        return  new String(alpha);
    }
    public static void main(String[] args) throws Exception{
        File file = new File("C:/Users/VIDYA/IdeaProjects/javademo/src/collectionInJava/map/data/data.ser");
        Scanner input = new Scanner(file);
        Integer minimumGroupSize = 5;

        Map<String, List<String>> m = new HashMap<>();
                while(input.hasNext())
                {
                    String value = input.next();
                    String key = alphabetize(value);
                    List<String> l = m.get(key);
                    if (l == null)
                    {
                         l = new LinkedList<>();
                                 m.put(key,l);
                    }
                    l.add(value);
                }
                for (List<String> x : m.values())
                {
                    if (x.size() >= minimumGroupSize)
                    {
                        System.out.println(x.size() + ":" + x);
                    }
                }
    }
}
