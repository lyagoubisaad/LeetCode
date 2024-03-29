package leetcode_categories.stack;

import java.util.HashMap;
import java.util.Stack;

public class L_901_OnlineStockSpan {
    Stack<Integer> stk;
    HashMap<Integer,Integer> store = new HashMap<>();
    public L_901_OnlineStockSpan() {
        stk = new Stack<>();
    }

    public int next(int price) {
        int cpt = 1;
        while (!stk.isEmpty() && stk.peek() <= price) {
            cpt += store.get(stk.peek());
            stk.pop();
        }
        stk.add(price);
        store.put(price, cpt);
        return store.get(price);
    }

    public static void main(String[] args) {
        L_901_OnlineStockSpan l = new L_901_OnlineStockSpan();
        l.next(3);
        l.next(4);
        l.next(21);
        l.next(69);
        l.next(29);
        l.next(35);
        l.next(98);
        l.next(46);
        l.next(50);
        l.next(53);
        l.next(58);
        l.next(59);
        l.next(69);
        l.next(98);
        l.next(69);
        l.next(73);
        l.next(74);
        l.next(41);
        l.next(27);
        l.next(78);
    }
}
