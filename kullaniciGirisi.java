package patikadev;
import java.util.Scanner;
public class kullaniciGirisi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String nickName,password;
        System.out.print("enter your nickname:");
        nickName = inp.nextLine();
        System.out.print("enter your password:");
        password = inp.nextLine();
        if(nickName.equals("java") && password.equals("123")){
            System.out.println("successful login!");
        }else{
            System.out.println("wrong nickname or password!");
        }

    }
}
