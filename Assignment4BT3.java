
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hoang
 */
public class Assignment4BT3 {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap day so phan biet boi dau cham phay;");
        str = sc.nextLine();
        StringTokenizer stk = new StringTokenizer(str,";");
        int tongchan = 0, tongle = 0;
        while(stk.hasMoreElements()){
            String s = stk.nextToken();
            int n = Interger.parseInt(s);
            if(n%2==1)
                tongle += n;
            else
                tongchan += n;
        }
        System.out.println("Tong chan" + tongchan);
        System.out.println("Tong Le" + tongle);
        System.out.println("Tong" + (tongchan + tongle));
    }
}
