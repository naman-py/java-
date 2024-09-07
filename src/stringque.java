import java.util.Scanner;
public class stringque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence - ");
        String sen = sc.nextLine();
        int num = 1;
        String jj = sen.trim();
        for (int i = 0;i<jj.length();i++){
            if (' '==jj.charAt(i)){
                num++;
            }
        }
        System.out.println("number of words present in the sentence is "+num);
    }
}
