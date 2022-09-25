import java.util.*;

class Pattern {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int m = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // front gap pyramide
        for (int i = 1; i <= n; i++) {
            // for space inner for loop
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // for print star inner for loop
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // number pattern half-pyramid
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // number pattern inverted half-pyramid
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println(); // space between two pattern

        // floyds triangle
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }

        System.out.println(); // space between two pattern

        // 0 - 1 alternate half pyramid
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

        System.out.println(); // space between two pattern

        // solid rhombus
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n - i + 1; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println(); // space between two pattern

        // number pyramid
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
                System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println(); // space between two pattern

        // palindromic number pyramid
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n - i + 1; j++) {
                System.out.print("  ");
            }

            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }

            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        System.out.println(); // space between two pattern

        // butterfly pattern upper half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // butterfly pattern lower half
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }

        System.out.println(); // space between two pattern

        // Diamond shape pattern upper half
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Diamond shape pattern lower half
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println(); // space between two pattern

        // upper half hollow Butterfly pattern
        for (int i = 1; i <= n; i++) {

            // upper left half
            for (int j = 1; j <= 1; j++) {
                System.out.print("*");
            }

            for (int j = 1; j < i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 1 && i > 1; j++) {
                System.out.print("*");
            }

            // middle gap from left->right
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // upper right half
            for (int j = 1; j <= 1; j++) {
                System.out.print("*");
            }

            for (int j = 1; j < i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 1 && i > 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // lower half hollow Butterfly pattern
        for (int i = n; i >= 1; i--) {

            // lower left half
            for (int j = 1; j <= 1; j++) {
                System.out.print("*");
            }

            for (int j = 1; j < i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 1 && i > 1; j++) {
                System.out.print("*");
            }

            // middle gap from left->right
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // lower right half
            for (int j = 1; j <= 1; j++) {
                System.out.print("*");
            }

            for (int j = 1; j < i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 1 && i > 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println(); // space between two pattern

        // hollow Rhombus pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= n ; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }

        System.out.println(); // space between two pattern

        //half Pyramid pattern
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println(); // space between two pattern

        //Inverted Half Pyramid  pattern
        for (int i = n; i >= 1; i--){
            // for (int j = 1; j <= n-i; j++){
            //     System.out.print(" ");
            // }

            for (int j = 1; j <= i; j++){
                System.out.print(n-i+1);
            }
            System.out.println();
        }

        System.out.println(); // space between two pattern

//         Print Pascal’s Triangle need to practice.
//     1
//    1 1
//   1 2 1
//  1 3 3 1
// 1 4 6 4 1


    }
}
