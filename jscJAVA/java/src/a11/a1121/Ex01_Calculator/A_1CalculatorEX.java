package a11.a1121.Ex01_Calculator;

public class A_1CalculatorEX {
    /**
     * @param args
     */
    public static void main(String[] args) {
        //계산기 객체를 만들(생성)거임

        var calculator = new C_1Calculator();
        
        int a = 10;
        int b = 5;
        double x= 10.25 ;
        double y= 5.4;

        int arr[] = {1,2,3,4,5};


        //칼큘러리라는 함수를 만들 거다. 함수 = 메소드 = 동작

        int plus =calculator.plus(a,b);
        //여기서 plus를 누르면 전구가 나옴 1번째 누르면 c1에 plus의 함수? 뭔가가 만들어짐
        int minus = calculator.minus(a,b);
        double multiple = calculator.multiple(x,y);
        double divide = calculator.divide(x,y);

        int sum = calculator.sum(arr); //괄호 없이 배열명(arr)만 보내면됨

//나머지 값 만들기는 복습으로 남겨둠

        double avg = calculator.avg(arr);

        System.out.println("합산 : " +plus);
        System.out.println("빼기 : " +minus);





        //printf ("포맷(형식), 변수") :%x(숫자임).y(리터널_뭔가 잘못된듯?)
        //-형식 기호를 사용하여 값을 형식에 따라 표현하는 메서드입니다.
        System.out.printf("mult: %5.2f\n", multiple);
        System.out.printf("mult: %5.2f\n", divide);

        System.out.println("합"+sum);
        System.out.println("평균"+avg);
// mult: %5.2f\n
// mult: 변수명
// %x =  양수 x의 크기만큼 지정하고 오른쪽에 정렬한다. (음수의 경우 좌측에서부터 정렬)
//      ex) %5 = ㅁㅁㅁㅁㅁ 5칸까지 표시할 수 있다.????
// .yt = y(숫자) 지정한 크기만큼 소수점 아래 자리수를 표현함(반올림)

// 리터럴: 내가 입력한 값
// %x.xd :정수  이렇게 봐야하는 거 같음 x.x는 둘다 내가 정하는 임의의 숫자임
// %x.xf :실수  중요한건 . 뒤에 붙는 d,f,s.
// %x.xs :문자열
// ex) printf("%d | %d",a b")
//      = 출력 10 | 10
    }
}
