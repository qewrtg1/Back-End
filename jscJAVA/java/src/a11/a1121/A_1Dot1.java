package a11.a1121;

public class A_1Dot1 {


    private static void printNumbers(int... numbers) {
//본래 int는 numbers 1,2,3에 맞춰 int 변수 3개가 생성됨
//근데 ...으로 고정이 아닌 가변성을 줌
        for(int number : numbers){
            System.out.println(number);
//...으로 추가된 printNumbers(10,20)까지 포함해서 so에 출력되는 것을 볼 수 있다.

//많이 이용하는 문법이라고 함 ''...'' <<이거
        }

    }


//이렇게 별도로 js 파일을 나누지 않고도 전구 사용해서 만들 수 있다??? 뭘 보여주고싶은건지 모르겠음 ㅇㅇ


    public static void main(String[] args) {
        printNumbers(1,2,3);
        printNumbers(10,20);
    }
        

}


//이거 다음에 com04로 
