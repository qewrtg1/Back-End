package a11.a1113;
//81p
public class A3_Increase {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;
        
        x++; //x = x+1
        ++x;
        System.out.println("x=" + x); //증감연산
        System.out.println("------------------------------");

        y--;
        --y;
        System.out.println("y=" + y);
        System.out.println("------------------------------");

        z = x++; // 연산자 우선 순위 확인
        //x가 가지고 있던 12를 z에 대입 후 x는 1 증가
        System.out.println("z=" + z); // 13이어야 하지만 12값이 출력. 이후 +1이 되는 방식
        System.out.println("x=" + x); // 위에서 12였던 값에 +1 하고 바로 출력


// 현재 x값은 13임
        z = ++x; //14로 증가된 내용을 z에 저장함.
        System.out.println("z=" + z);
        System.out.println("x=" + x);

// 현재까지 x,14 z,14 y,8

        z = ++x + y++;
        System.out.println("z=" + z);
        System.out.println("x=" + x);
        System.out.println("y=" + y);

    }
}
