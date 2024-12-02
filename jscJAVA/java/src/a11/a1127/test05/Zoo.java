package a11.a1127.test05;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 동물 객체를 담을 배열 선언
        Animal[] animals = new Animal[3]; // 최대 3마리 동물 관리
        int index = 0;

        while (true) {
            if (index == animals.length) break; // 배열이 꽉 차면 종료

            System.out.println("1. 개  2. 새  3. 물고기  (그만: 종료)");
            System.out.print(">> ");
            String input = sc.next();

            if (input.equals("그만")) break;

            System.out.print("이름 입력: ");
            String name = sc.next();
            System.out.print("나이 입력: ");
            int age = sc.nextInt();

            // 동물 객체 생성
            switch (input) {
                case "1":
                    animals[index++] = new Dog(name, age); // 배열에 Dog 객체 저장
                    break;
            //정보값을 animals 배열에 그냥 넣은거임
            //별도의 뭔가를 만든 게 아니고
                case "2":
                    animals[index++] = new Bird(name, age); // 배열에 Bird 객체 저장
                    break;
                case "3":
                    animals[index++] = new Fish(name, age); // 배열에 Fish 객체 저장
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                    break;
            }
        }

        // 동물 정보 출력
        System.out.println("\n===== 동물 정보 =====");
        for (Animal animal : animals) {//배열의 단점 :총 갯수를 정해야 함.
            if (animal == null) continue; // 비어 있으면 건너 뛰게만듬.

            animal.info();
            animal.sound();
            animal.move();
            System.out.println();
        }

        sc.close();
    }
}


// 배열의 문제.

// 1. 배열이 몇 개일지 지정을 해야 한다는 점.
// 2. 추가, 삭제, 삽입이 용이하지 않다. 


// 그래서 제한이 없으면서 삽입, 삭제가 용이한 것을 다음에 배울 거임.

// array 어쩌고가 유의미한 듯?