import java.util.Scanner;
public class binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number - ");
        String num = sc.next();
        double ind = 0;
        double number = 0;
        for (int i = 0;i<num.length();i++){
            if ('0'==num.charAt(i)){
                ind++;
            }
            else if ('1'==num.charAt(i)){
                double bs = Math.pow(2,ind);
                number = number + bs;
                ind++;
            }
        }
        System.out.print("the number is ");
        System.out.print(number);
    }
}
