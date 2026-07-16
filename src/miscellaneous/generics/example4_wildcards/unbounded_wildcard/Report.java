package miscellaneous.generics.example4_wildcards.unbounded_wildcard;

import java.util.List;

class Report {

    public void print(List<?> list) {

        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
