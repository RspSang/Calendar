import java.util.Scanner;

public class Prompt {
    private static final String PROMPT = ">cal ";

    public int parseDay(String week){
        if (week.equals("SU")) return 0;
        else if (week.equals("MO")) return 1;
        else if (week.equals("TU")) return 2;
        else if (week.equals("WE")) return 3;
        else if (week.equals("TH")) return 4;
        else if (week.equals("FR")) return 5;
        else if (week.equals("SA")) return 6;
        else return 0;
    }

    public void runPrompt(){
        //숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
        Scanner scanner = new Scanner(System.in);
        Calendar cal = new Calendar();

        while(true){
            System.out.println("년도을 입력해주세요:");
            System.out.print(PROMPT);
            int year = scanner.nextInt();

            System.out.println("달을 입력해주세요:");
            System.out.print(PROMPT);
            int month = scanner.nextInt();

            System.out.println("첫번째 요일을 입력해주세요(SU, MO, TU, WE, TH, FR, SA):");
            System.out.print(PROMPT);
            String week = scanner.next();
            int weekday = parseDay(week);

            if(year == -1){
                System.out.println("Bye~~");
                break;
            }
            if(month == -1){
                System.out.println("Bye~~");
                break;
            }
            if(month<12){
                cal.printCalendar(year,month,weekday);
                continue;
            }
        }
        scanner.close();
    }


    public static void main(String[] args) {
        //셀실행
        Prompt p = new Prompt();
        p.runPrompt();
    }
}
