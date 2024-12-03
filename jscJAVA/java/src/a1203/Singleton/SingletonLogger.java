package a1203.Singleton;

public class SingletonLogger {

    private static SingletonLogger instance;//인스턴스 변수를 만듬

//생성자를 private로 설정. 외부에서 새로운 인스턴스를 생성 금지하게 하기 위해서
//class 내부에 유일한 인스턴스(객체)를 만들기 위해서? 'private static'를 씀
    
    //기본 생성자 선언
    private SingletonLogger(){

    }

//완전 정형적인 기초? 내용?
    public static SingletonLogger getInstance() {
        if(instance == null){// 해석: 아직 객체가 생성되지 않았으면
            synchronized(SingletonLogger.class){
                if(instance==null){
                    instance = new SingletonLogger();
                }// 객체가 없으면 하나를 생성하게 한다.
            }
        }
        return instance; //있으면 instance를(변수_객체?) 되돌려준다?
    };

    public void log(String message){
        System.out.println("Log: " + message);
    }




}
