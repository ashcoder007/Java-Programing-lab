import java.util.Arrays;
import java.util.Scanner;

public class TwoDArr1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int r = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Enter the number of columns:");
        int c = sc.nextInt();
        sc.nextLine();

        String s[][] = new String[r][c];

        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                System.out.println("Enter Sting:");
                s[i][j] = sc.nextLine();
            }
        }

        System.out.println(Arrays.deepToString(s));
      
        
    }
}
