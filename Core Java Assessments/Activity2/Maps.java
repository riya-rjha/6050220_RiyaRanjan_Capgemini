package Activity2;

import java.util.*;
import java.util.stream.*;

public class Maps {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>(Arrays.asList(1, 5, 8, 11, 52, 79, 12, 63));
        List<Integer> ans = lst.stream()
                .map(e -> e * 2)
                .collect(Collectors.toList());

        List<Integer> filtered = lst.stream()
                .filter(e -> e % 2 != 0)
                .collect(Collectors.toList());

        

        System.out.println(lst);
        System.out.println(ans);
        System.out.println(filtered);
    }
}
