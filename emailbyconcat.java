import java.util.Scanner;
 public class emailbyconcat{
     public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         Scanner sc1 = new Scanner(System.in);
         System.out.println("enter name");
         String s1 =sc.nextLine();
          System.out.println("enter yeart of addmission");
          int s2 = sc.nextInt();
          String year=String.valueOf(s2);
           System.out.println("enter enroll no");
           String enroll=sc1.nextLine();
           String newenroll=enroll.substring(0,4);
           String s3=(s1.concat(year)).concat(enroll);
           
        String collegeEmail = s1.toLowerCase() + s2 + "@" + newenroll + "acropolis.in";
        
        
        System.out.println("College email: " + collegeEmail);
     }
 }
     
    