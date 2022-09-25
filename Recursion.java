import java.util.ArrayList;
import java.util.HashSet;

public class Recursion {

    public static int calcPower(int x, int n) { // TC O(n)

        if (x == 0) {
            return 0;
        }

        if (n == 0) {
            return 1;
        }

        int xPownm1 = calcPower(x, n - 1);
        int xPown = x * xPownm1;
        return xPown;
    }

    public static int calcPowerEfficient(int x, int n) { // TC O(logn)
        if (x == 0) {
            return 0;
        }

        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            return calcPowerEfficient(x, n / 2) * calcPowerEfficient(x, n / 2);
        } else {
            return calcPowerEfficient(x, n / 2) * calcPowerEfficient(x, n / 2) * x;
        }
    }

    public static void towerOfHanoi(int n, String src, String helper, String dest) {

        if (n == 1) {
            System.out.println("Transferring disk " + n + " source " + src + " to " + dest);
            return;
        }

        towerOfHanoi(n - 1, src, dest, helper);
        System.out.println("Transferring disk " + n + " from " + src + " to " + dest);
        towerOfHanoi(n - 1, helper, src, dest);
    }

    public static void reverseString(String str, int indx) {

        if (indx <= 0) {
            System.out.print(str.charAt(indx) + " ");
            return;
        }
        System.out.print(str.charAt(indx) + " ");
        reverseString(str, indx - 1);
    }

    public static int first = -1;
    public static int last = -1;

    public static void firstAndLastOccurence(String str, int indx, char letter) {

        if (indx == str.length()) {
            System.out.println("First occurance of character '" + letter + "' is in position  " + first);
            System.out.println("Last occurance of character '" + letter + "' is in position  " + last);
            return;
        }

        if (str.charAt(indx) == letter) {
            if (first == -1) {
                first = indx;
            } else {
                last = indx;
            }
        }
        firstAndLastOccurence(str, indx + 1, letter);
    }

    public static void transferLetterToEnd(String str, int indx, char letter, String subString, String newString) {

        if (indx == str.length()) {
            System.out.println(newString + subString);
            return;
        }
        if (str.charAt(indx) == letter) {
            subString += letter;
        } else {
            newString += str.charAt(indx);
        }
        transferLetterToEnd(str, indx + 1, letter, subString, newString);
    }

    public static void removeDuplicates(boolean[] map, String str, int indx, String newString) {

        if (indx == str.length()) {
            System.out.println("Unique string -- " + newString);
            return;
        }

        if (!map[str.charAt(indx) - 'a']) {
            map[str.charAt(indx) - 'a'] = true;
            newString += str.charAt(indx);
        }
        removeDuplicates(map, str, indx + 1, newString);
    }

    public static void uniqueSubsequencs(String str, int indx, String newString, HashSet<String> set) {

        if (indx == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

        char currentChar = str.charAt(indx);
        uniqueSubsequencs(str, indx + 1, newString + currentChar, set);
        uniqueSubsequencs(str, indx + 1, newString, set);
    }

    public static void findkeypadCombination(String key, int indx, String newComb, String keyDetails[]) {

        if (indx == key.length()) {
            System.out.println(newComb);
            return;
        }

        char keyIndex = key.charAt(indx);
        String mapping = keyDetails[keyIndex - '0'];
        for (int i = 0; i < mapping.length(); i++) {
            findkeypadCombination(key, indx + 1, newComb + mapping.charAt(i), keyDetails);
        }
    }

    public static void printPermutation(String str, String permutation) {

        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i + 1);
            printPermutation(newString, permutation + currentChar);
        }
    }

    public static void pathFindInMaze(int startR, int endR, int stratD, int endD, String path) {

        if (startR == endR && stratD == endD) {
            System.out.println(path + "END");
            return;
        }

        if (startR > endR || stratD > endD) {
            return;
        }

        if (startR < endR) {
            pathFindInMaze(startR + 1, endR, stratD, endD, path + "R->");
        }
        if (stratD < endD) {
            pathFindInMaze(startR, endR, stratD + 1, endD, path + "D->");
        }

    }

    public static int placeTielsInFloor(int n, int m) {

        if (n == m) {
            return 2;
        }

        if (n < m) {
            return 1;
        }

        int verPlacements = placeTielsInFloor(n - m, m);

        int horPlacements = placeTielsInFloor(n - 1, m);

        return verPlacements + horPlacements;
    }

    public static int callGuest(int n) {

        if (n <= 1) {
            return 1;
        }

        int singleWay = callGuest(n - 1);

        int pairWay = (n - 1) * callGuest(n - 2);

        return singleWay + pairWay;
    }

    public static void printSet(ArrayList<Integer> subSet){
        for (int i = 0; i < subSet.size(); i++) {
            System.out.print(subSet.get(i) + " ");
        }
    }

    public static void createSet(int n, ArrayList<Integer> subSet) {

        if (n == 0) {
            printSet(subSet);
            System.out.println();
            return;
        }

        subSet.add(n);
        createSet(n - 1, subSet);

        // if not to add remove and call fn again
        subSet.remove(subSet.size() - 1);
        createSet(n - 1, subSet);
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 6;
        int result = calcPower(x, n);
        System.out.println("Result of X power N in time complexith N is " + result);
        int resultEff = calcPowerEfficient(x, n);
        System.out.println("Result of X power N  in time complexith logN is " + resultEff);

        System.out.println("Tower of Hanoi start ......... ");
        towerOfHanoi(2, "S", "H", "D");
        System.out.println("Tower of Hanoi End ......... ");

        String str = "rakesh";
        reverseString(str, str.length() - 1);
        System.out.println();

        String str2 = "aasdfgfjajadjakjaakl";
        firstAndLastOccurence(str2, 0, 'a');

        transferLetterToEnd(str2, 0, 'a', "", "");

        boolean map[] = new boolean[26];
        removeDuplicates(map, str2, 0, "");

        HashSet<String> set = new HashSet<>();
        String str3 = "aaa";
        uniqueSubsequencs(str3, 0, "", set);

        String[] keyDetails = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };
        findkeypadCombination("13", 0, "", keyDetails);

        System.out.println("Permutation starting .......");

        String str4 = "abc";
        printPermutation(str4, "");
        System.out.println("Number of ways to find a path in Maze -------");
        pathFindInMaze(0, 2, 0, 3, "");

        System.out.print("No of ways to place a 1xm tiles in nxm floor is -----  ");
        System.out.println(placeTielsInFloor(4, 2));

        System.out.print("To call n guest their is way of --- ");
        System.out.println(callGuest(2));

        System.out.println("Set Creation --- ");
        ArrayList<Integer> subset = new ArrayList<>();
        createSet(3, subset);
    }
}
