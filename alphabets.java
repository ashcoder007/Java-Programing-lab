import java.util.Scanner;
public class alphabets
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter character: ");
       char n = sc.next().charAt(0);
       if (n=='a'||n=='A'||n=='e'||n=='E'||n=='i'||n=='I'||n=='o'||n=='O'||n=='u'||n=='U')
       System.out.println("The Character is " +n+ " is vowel");
       else
        System.out.println("The number is " +n+ " is consonant");
    }
}