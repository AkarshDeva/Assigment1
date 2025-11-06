
import java.util.*;
class ques10 {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1, 3, 5);
        List<Integer> l2 = Arrays.asList(2, 4, 6);

        List<Integer> merged = mergeLists(l1, l2, 0, 0, new ArrayList<>());
        System.out.println(merged);
    }

    static List<Integer> mergeLists(List<Integer> l1, List<Integer> l2, int i, int j, List<Integer> result) {
        if (i == l1.size()) {
            while (j < l2.size()) result.add(l2.get(j++));
            return result;
        }

        if (j == l2.size()) {
            while (i < l1.size()) result.add(l1.get(i++));
            return result;
        }

        if (l1.get(i) < l2.get(j)) {
            result.add(l1.get(i));
            return mergeLists(l1, l2, i + 1, j, result);
        } else {
            result.add(l2.get(j));
            return mergeLists(l1, l2, i, j + 1, result);
        }
    }
}

