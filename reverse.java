import java.util.*;
public class revers {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.print("Enter a number:");
        int count=0;
        int n=num.nextInt();
        while(n>0){
            int digit=n%10;
            int rev= 10*digit+digit;
            n=n/10;
        }
        System.out.println(rev);
}
}
