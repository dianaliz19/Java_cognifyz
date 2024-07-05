//Tic Tac Toe game
import java.util.*;
public class t1_tictactoe {
    private String[][] board = new String[3][3];
    private String current = "x";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        task1 t = new task1();
        t.initial();
        boolean out;
        String choice = "y";
        do {
            System.out.println("\n");
            t.printboard();
            do {
                System.out.println("\nEnter the row and column to be marked: ");
                int n = sc.nextInt();
                int m = sc.nextInt();
                out = t.game(n,m);
            }while(out);
            out = t.check();
            if(out) {
                t.printboard();
                System.out.println("\nPlayer "+t.current+" wins!!");
                System.out.println("\nDo you want to continue:(y/n)");
                    choice = sc.next();
                t.initial();
            }
            else {
                out=t.draw();
                if(out) {
                    System.out.println("\nDo you want to continue:(y/n)");
                    choice = sc.next();
                    t.initial();
                }
            }
        }while(choice.equals("y"));
        sc.close();
    }
    public void initial() {
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                board[i][j] = " ";
    }
    public void printboard() {
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                System.out.print(board[i][j]);
                if(j<2)
                    System.out.print(" |");
            }
            if(i<2)
                System.out.println("\n--+--+--");
        }
    }
    public boolean game(int n,int m) {
        if(n<=3 && m<=3 && board[n-1][m-1] == " ") {
            board[n-1][m-1] = current;
            return false;
        }
        else {
            System.out.println("Invalid input");
            return true;
        }
    }
    public boolean check() {
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                if(board[i][0] == current && board[i][1] == current && board[i][2] == current)
                    return true;
                if(board[0][i] == current && board[1][i] == current && board[2][i] == current)
                    return true;
            }
        }
        if(board[0][0] == current && board[1][1] == current && board[2][2] == current)
            return true;
        if(board[0][2] == current && board[1][1] == current && board[2][0] == current)
            return true;
        return false;
    }
    public boolean draw() {
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                if(board[i][j]==" ") {
                    current = (current == "x")?"o":"x";
                    return false;
                }
        System.out.println("\nThis is a draw");
        printboard();
        return true;
    }
}
