package Stack;
import java.util.Stack;

public class lc901 {
    public class lc901 {
        private Stack<int[]> st;

        public lc901() {
            st = new Stack<>();
        }

        public int next(int price) {
            int span = 1;
            while (!st.isEmpty() && st.peek()[0] <= price) {
                span += st.pop()[1];
            }
            st.push(new int[]{price, span});
            return span;
        }

        public static void main(String[] args) {
            lc901 stockSpanner = new lc901();
            System.out.println(stockSpanner.next(100));
            System.out.println(stockSpanner.next(80));
            System.out.println(stockSpanner.next(60));
            System.out.println(stockSpanner.next(70));
            System.out.println(stockSpanner.next(60));
            System.out.println(stockSpanner.next(75));
            System.out.println(stockSpanner.next(85));
        }
}
