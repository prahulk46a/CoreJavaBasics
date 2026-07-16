package miscellaneous.generics.example4_wildcards.bounded_wildcard.lowerbounded;

import java.util.List;

class MarksService {

    public void addMarks(List<? super Integer> marks) {

        marks.add(90);
        marks.add(80);
        marks.add(70);

        System.out.println(marks);
    }
}
