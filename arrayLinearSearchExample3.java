//wap to demonstrate passing of single dimension array to a function to perfrom linear search using for each loop

public class arrayLinearSearchExample3 {
    public static int Search(int key, int[] a) {
       
        for (int i : a) {
            if (i == key) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a1 = {10, 20, 30, 50, 70, 90};

        int key = 50;
        int i = Search(key, a1);
        if (i == -1)
            System.out.println("element not found");
        else
            System.out.println("element found " );
    }
}






