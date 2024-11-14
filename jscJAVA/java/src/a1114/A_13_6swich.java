package a1114;
//뭐 날려 먹은 건 아닌데 5는 없음 ㅇㅇ 125p
public class A_13_6swich {
    public static void main(String[] args) {

        String grade = "B";
        int score1 = 0;
//java 11 이전 문법은 이런식이고
        switch (grade) {
            case "A":
                score1 = 100;
                break;
            
            case "B":
                int result = 100-20;
                score1 = result;
                break;
            default :
                score1 = 60;
        }
        System.out.println("score1 " + score1);




//자바 13부턴 이런느낌임

        int score2 = switch(grade){
            case "A"->100;
            case "B"->{
                int result = 100-20;
                yield result;
            }
            default -> 60;
        };
        System.out.println("score2 " + score2);
//단일 라인 케이스는 -> 함께 직접 값을 반환한다?
//여러줄 블록에서는 yield를 사용하여 값을 반환한다.
//yield 키워드는 주로 여러줄에 복잡한 처리를 해야할 때 사용한다.

    }
}
