import java.util.Scanner;

public class Ui {
    Scanner sc;
    public Ui() {
        sc = new Scanner(System.in);
    }
    public String inputString(String msg){
        System.out.print(msg);
        return sc.nextLine();
    }

    public int inputInt(String msg){
        System.out.print(msg);
        int n = sc.nextInt();
        sc.nextLine();
        return n;
    }

}
