package leetcode_categories.math_geometry;

public class L_292_Nim_Game {
    public static boolean canWinNim(int n) {
        boolean myTurn = false;
        if(n<4) return true;
        else{
            myTurn = !myTurn;
            myTurn = (canWinNim(n-1) || canWinNim(n-2) || canWinNim(n-3)) && myTurn;
        }
        return myTurn;
    }

    public static void main(String[] args) {
        System.out.println(canWinNim(4));
    }

}