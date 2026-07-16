package miscellaneous.generics.example4_wildcards.bounded_wildcard.lowerbounded;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> marks = new ArrayList<>();
        MarksService service = new MarksService();

        service.addMarks(marks);
    }
}
