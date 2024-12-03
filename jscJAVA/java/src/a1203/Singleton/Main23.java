package a1203.Singleton;

public class Main23 {
    
    public static void main(String[] args) {
        //객체 생성
        SingletonLogger logger = SingletonLogger.getInstance();//getInstance 

        logger.log("This is a log  message"); //log: 라는 메서드 만들었지? 그렇다던데 
    
        SingletonLogger anotherLogger =SingletonLogger.getInstance();
        anotherLogger.log("This is a log  message"); 

        if(logger == anotherLogger){
            System.out.println("both logerr instances are the same");
        }
// logger == anotherLogger 같은 메서드에서 만들어 졌어도 객체는 각자 별도의 주소를 지니게 됨
// if(logger == anotherLogger) 는 같은 주소를 가지고 있다면~ 하고 물어보는 거임

// 같은 주소를 가지고 있음을 알 수 있음.(여기 부분 말이 빨라서 위에 적다가 왜 그런건지 못들었음)


    }
}
