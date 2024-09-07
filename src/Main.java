import java.util.Scanner;
class jam {
    public static void tex(String text){
        char v = text.charAt(0);
        String y = Character.toString(v);
        System.out.print(y.toUpperCase());
       for (int i =1;i<text.length();i++){
           char ch = text.charAt(i);
           String j = Character.toString(ch);
           if (j.equals(" ")) {
               System.out.print(j);
               char d = text.charAt(i + 1);
               String f = Character.toString(d);
               System.out.print(f.toUpperCase());
               i++;
           }
           else {
               System.out.print(j);
           }
       }
    }
}
class das{
    public static void main(String[] args) {
        System.out.print("Enter Text - ");
        Scanner sc  = new Scanner(System.in);
        String str = sc.nextLine();
        jam we = new jam();
        we.tex(str);
    }
}