import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        //두수의 입력을 받고 더함
        int a,b;
        System.out.println("숫자 두개를 입력하십시오 :");
        Scanner scanner = new Scanner(System.in);
        String s1,s2;
        s1 = scanner.next();
        s2 = scanner.next();

        a = Integer.parseInt(s1);
        b = Integer.parseInt(s2);
        System.out.printf("%d와 %d의 합은 %d 입니다",a,b,a+b);
        scanner.close();
    }
}
