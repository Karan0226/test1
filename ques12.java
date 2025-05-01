//Find the length of the longest consecutive elements sequence.
import java.util.*;
public class ques12 {
    static int Consecutive(int[] arr) {
        Set<Integer> st = new HashSet<>();
        int res = 0;
        for (int val : arr)
            st.add(val);
        for (int val : arr) {
            if (st.contains(val) && !st.contains(val - 1)) {
                int cur = val, cnt = 0;
                while (st.contains(cur)) {
                    st.remove(cur);
                    cur++;
                    cnt++;
                }
                res = Math.max(res, cnt);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 1, 9, 4, 5, 3};
        System.out.println(Consecutive(arr));
    }
}
