package a1202.Book;

import java.util.Scanner;

public class MainClass2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        BookDAO bt = new BookDAO();
        boolean run = true;
        // System.out.println(bt);

        while (run) {
            System.out.println("1. 도서 추가");
			System.out.println("2. 도서 삭제");
			System.out.println("3. 도서 수정");
			System.out.println("4. 도서 조회");

            System.out.println("0. 종료");
            System.out.print(">>");

            int choice;
            try{
                choice = sc.nextInt();
            }catch(Exception e){
                choice = -1;
            }
            switch (choice) {
                case 1:
                    System.out.println("\n 도서를 추가합니다");
                    bt.addBook();
                    break;
                case 2:
                    System.out.println("\n 도서를 삭제합니다");
                    bt.deleteBook();
                    break;
                case 3:
                    System.out.println("\n 도서를 수정합니다");
                    bt.updateBook();
                    break;
                case 4:
                    System.out.println("\n 도서를 조회합니다");
                    bt.searchBook();
                    break;

                    
                case 5:
                    System.out.println("시스템 종료");
                    run = false;
                    sc.close();
                    System.exit(0);
                default:    
                    System.out.println("다시 입력하십시오.");
                    break;
            }
        }
    }
}
