package a1212.Lotto;

public class Loading {

    public void Loading() {
  //프로그램을 주어진 시간동안 대기하도록 하는 처리
  try{
        Thread.sleep(2000);
        //2000ms - 2초동안 대기
    }catch(InterruptedException e){
        e.printStackTrace();
        //스레드가 잠자는 도중에 인터럽트(중단)이 들어오면
        //InterruptedException 발생
    }   

    }

}
