//ASSIGN COOKIES
import java.util.Arrays;

public class GAone {
    public int findContentChildren(int[] g, int[] s) {
        int n = g.length;
        int m = s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int l = 0;
        int r = 0;
        while (l < m && r < n) {
            if (g[r] <= s[l])
                r = r + 1;
            l = l + 1;
        }
        return r;
    }
}