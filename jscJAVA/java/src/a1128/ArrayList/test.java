package a1128.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    ArrayList<String> list = new ArrayList<>(); 
    
    boolean run = true;

    while (run) {
        System.out.println("===========================");
        System.out.println("1. 이름추가  2.작성 목록 확인  3. 요소 확인  4. exit");
        System.out.print(">> ");

        String input = sc.next();

        sc.nextLine();


        if (input.equalsIgnoreCase("exit")) break;
        if (input.equals("4")) break;


        switch (input) {
            case "1":    
                    System.out.print("이름을 입력하세요: ");
                    String name = sc.nextLine();
                    list.add(name);
                break;

            case "2":
                String fruit = list.get(0);
                System.out.println(fruit);
                break;

            case "3":
                System.out.print("확인하고 싶은 이름은? ");
                String userName1 = sc.nextLine();

                    if (list.contains(userName1)) {
                        System.out.println("목록에 '" + userName1 + "가 있습니다.");
                    } else {
                        System.out.println("목록에 '" + userName1 + "은 없습니다.");
                    }
                break;
            default:
                System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                break;
        }

    }





    
    // System.out.print("이름을 입력하세요: ");
    // String name = sc.nextLine();

    // list.add(name);

    // System.out.println("확인용임 : " + name);
    }
    
}
