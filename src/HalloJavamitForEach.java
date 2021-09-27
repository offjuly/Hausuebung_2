import java.util.ArrayList;
import java.util.List;

public class HalloJavamitForEach {
    private List<String> myList = new ArrayList<>();

    public HalloJavamitForEach() {
        myList.add("a");
        myList.add("b");
        myList.add("c");
        myList.add("d");
    }

    public void showList() {
        for (String s : myList
        ) {
            System.out.println(s);
        }

        myList.forEach((String s) -> System.out.println(s));

        myList.forEach(System.out::print);

    }

}
