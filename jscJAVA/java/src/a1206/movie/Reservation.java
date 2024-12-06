package a1206.movie;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;

public class Reservation {
    private long id; //발급번호
    private long movieId; // 영화 대푯값
    private String movieTitle; // 영화 제목
    private String seatName; // 좌석명
   
    
    public long getId() {
        return id;
    }
    public long getMovieId() {
        return movieId;
    }
    public String getMovieTitle() {
        return movieTitle;
    }
    public String getSeatName() {
        return seatName;
    }

    private static final File file = new File("C:\\Users\\YONSAI\\Desktop\\HTML\\jscJAVA\\java\\src\\a1206\\reservation.txt");
    public Reservation(long id, long movieId, String movieTitle, String seatName) {
        this.id = id;
        this.movieId = movieId;
        this.movieTitle = movieTitle;
        this.seatName = seatName;
    }    
 
    public Reservation(long movieId, String movieTitle, String seatName) {
        this.id = Instant.now().toEpochMilli();//시간스탬프 타임스탬프
        //예약 대표값(id) 현재 시간을 밀리세컨드로 바꾼값으로 입력중복방지
        this.movieId = movieId;
        this.movieTitle = movieTitle;
        this.seatName = seatName;
    }

    public String toString() {
        return String.format("영화: %s, 좌석: %s", movieTitle, seatName);
    }



    public static ArrayList<Reservation> findByMoviedID(String movieIdStr) throws IOException{
        ArrayList<Reservation> reservations = new ArrayList<Reservation>();
        
        BufferedReader br = new BufferedReader(new FileReader(file)); // 파일을 읽어와서 br에 저장0
        String line = null;

        while ((line = br.readLine())!=null) {
            String [] temp = line.split(","); // ,콤마를 기준으로 배열을 만들겠다.
            if(movieIdStr.equals(temp[1])){//대표값이 같은 예매된 영화만 조회
                long id = Long.parseLong(temp[0]); //예매 발급번호
                long movieId = Long.parseLong(temp[1]); //예매 영화 대표값
                String movieTitle = temp[2]; // 영화 제목
                String seatName = temp[3]; // 예매 영화의 좌석명

                Reservation r = new Reservation(id, movieId, movieTitle, seatName);
                reservations.add(r); //생성 객체를 arraylist에 추가

            }
        }
        br.close(); // 입력 흐름 헤제
        return reservations; //예매 객체를 담은 arraylist 반환
    }




    public void save() throws IOException{
        FileWriter fw = new FileWriter(file, true); // 이어쓰기(append) 모드 설정(true)
        fw.write(this.toFileString() + "\n");
        fw.close();
    }
    private String toFileString() {
        return String.format("%d,%d,%s,%s",id, movieId, movieTitle,seatName);
    }


    public static Reservation cancel(String reservationId) throws IOException{
        Reservation canceled  = null;
        BufferedReader br = new BufferedReader(new FileReader(file));
        String text = "";
        String line = null;

        while ((line = br.readLine())!=null) {
            String [] temp = line.split(","); // ,콤마를 기준으로 배열을 만들겠다.
            if (reservationId.equals(temp[0])) {
                canceled =new Reservation(
                    Long.parseLong(temp[0]), // 발급번호
                    Long.parseLong(temp[1]), // 영화 대푯값
                    temp[2],  // 영화 제목
                    temp[3]  // 좌석명
                );
                continue; // 다음 반복으로 넘어감(복사안되게)
            }
            text += line + "\n"; // 읽은 문자열을 누적하여 복사한다.
        }
        br.close(); //입력 흐름 해제

        FileWriter fw = new FileWriter(file); // FileWriter 객체 생성(덮어쓰기 모드)
        fw.write(text); // 파일 출력
        fw.close(); // 출력 흐름 해제
        return canceled; // 삭제된 예매를 객체로 반환
    }
    
    
    
    public static Reservation findById(String reservationId) throws IOException {
        Reservation r  = null;
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = null;

        while ((line = br.readLine()) != null){
            String[] temp = line.split(",");
            if(reservationId.equals(temp[0])){
                r = new Reservation(
                    Long.parseLong(temp[0]), //발급번호
                    Long.parseLong(temp[1]), // 영화 대푯값
                    temp[2], // 영화 제목
                    temp[3] // 좌석명
                );
                break; //반복탈출
            } 
        }
        br.close(); //입력 흐름 해제
        return r;
    }





}
