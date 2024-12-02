package a1202.Book;

import java.util.ArrayList;
import java.util.Scanner;

// import a1202.Hak5.StudentDTO;

public class BookDAO {
    
    private ArrayList<BookDTO> blist;
    Scanner sc = new Scanner(System.in);

    public BookDAO(){
        blist = new ArrayList<BookDTO>();

        BookDTO b1 =new BookDTO(0, "Java", "Author A", 2020);
        BookDTO b2 =new BookDTO(1, "Python", "Author B", 2019);
        BookDTO b3 =new BookDTO(2, "Data", "Author C", 2018);
        
        blist.add(b1);
        blist.add(b2);
        blist.add(b3);
        // System.out.println(blist);
    
    }





    public void addBook() {

        System.out.println("<책을 추가합니다.>");

        System.out.print("도서ID : ");
        int id = sc.nextInt();

        System.out.print("도서명 : ");
        String title = sc.next();

        System.out.print("저자 : ");
        String author = sc.next();

        System.out.print("출판연도 :");
        int year = sc.nextInt();

        BookDTO addBook = new BookDTO(id, title, author, year);

        blist.add(addBook); // 배열 slist +  StudentDTO student = new S...
        System.out.println(blist); 
        
    }
















    public void deleteBook() {
        System.out.println("<도서 정보 삭제>");
        int index = searchIndex(); //찾는 메소드가 이거임. 
        if(index == -1){ // (2)가 여기에도 영향을 준다??
            System.out.println("찾는 도서가 없습니다.");
        }else{
            String name = blist.get(index).getTitle(); //찾은 값이 존재한다면,
            blist.remove(index); 
            System.out.println(name + "정보를 삭제했습니다.");
        }
    }



    
    private int searchIndex() {//만약 void가 있으면 지워야 함. 찾은 값을 반환해야하니까.
        int index = -1; //(2)찾는 값이 없을 때 결과적으로 -1이 되어 강제로 벗어나게 하는 장치.
        System.out.println("찾는 도서의 이름을 입력하세요");
        System.out.print(">>");
        String name = sc.next();

        for(int i =0; i < blist.size(); i++){ // slist는 arraylist 배열 이름과 입력한 이름을 비교하기 위해 만든 거
            if (blist.get(i).getTitle().equals(name)) { // slist.get(i) = lengh 였나? 아무튼 이거 기억해야함.
                index = i; // 같은 데이터가 있으면 i를 index에 대입하시오, 라는 의미.
                break;
            }
        }
        return index; //(2)
    }










    public void updateBook() {


    }

    public void searchBook() {


    }




}
