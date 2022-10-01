import java.util.ArrayList;
import java.util.Arrays;

public class BackTracking {

    public static void printBoard(char[][] board , ArrayList<ArrayList<String>> allBoards){
        String row ="";

        ArrayList<String> newBoard = new ArrayList<>();
        for(int i=0;i<board.length;i++){
            row = "";
            for(int j=0;j<board.length;j++){
                if (board[i][j]=='Q') {
                    row+='Q';
                }else{
                    row+='.';
                }
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
        for(int k=0;k<allBoards.size();k++){
            System.out.print(allBoards.get(k)+ "   ");
        }
        allBoards.remove(allBoards.size()-1);
    }

    public static boolean isSafe(char[][] board , int row , int col){
        //horizontal checking
        for(int i=0;i<board.length;i++){
            if (board[row][i]=='Q') {
                return false;
            }
        }

        //vertical checking
        for(int i=0;i<board.length;i++){
            if (board[i][col]=='Q') {
                return false;
            }
        }

        //upper left checking
        int r=row;
        for(int c=col;r>=0 && c>=0;r--,c--){
            if (board[r][c]=='Q') {
                return false;
            }
        }

        //upper right checking
        r=row;
        for(int c=col;r>=0 && c<board.length;r--,c++){
            if (board[r][c]=='Q') {
                return false;
            }
        }

        //lower left checking
        r=row;
        for(int c=col;r<board.length && c>=0;r++,c--){
            if (board[r][c]=='Q') {
                return false;
            }
        }

        //lower right checking
        r=row;
        for(int c=col;r<board.length && c<board.length;r++,c++){
            if (board[r][c]=='Q') {
                return false;
            }
        }

        return true;
    }

    public static void helper(char[][] board , ArrayList<ArrayList<String>> allBoards , int col){

        if (col==board.length) {
            printBoard(board , allBoards);
            return;
        }

        for(int row=0;row<board.length;row++){
            if (isSafe(board , row , col)) {
                board[row][col] = 'Q';
                helper(board, allBoards, col+1);
                board[row][col]= '.';
            }
        }
    }

    public static void nQueenSolution(int n){

        ArrayList<ArrayList<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];

        helper(board , allBoards , 0);
    }


    //practice problem
    public static void findCombination(int n , int element, int[] arr){

        if (element > n) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        for(int pos=0;pos< 2*n;pos++){
            if (arr[pos]==-1 && (pos+element+1)<2*n && arr[pos+element+1]==-1) {
                arr[pos] = element;
                arr[pos+element+1] = element;
                findCombination(n,element+1, arr);
                arr[pos] = -1;
                arr[pos+element+1] = -1;
            }
        }  
    }


    public static void main(String[] args) {
           int n =7;
        //    nQueenSolution(n);
           int[] arr = new int[2*n];
           Arrays.fill(arr, -1);
           findCombination(n,1,arr);

    }
}
