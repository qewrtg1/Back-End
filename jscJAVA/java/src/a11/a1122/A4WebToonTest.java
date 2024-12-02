package a11.a1122;

public class A4WebToonTest {
    public static void main(String[] args) {
        Webtoon w1 = new Webtoon("나 혼자만 레벨 업", "판타지", "추공님");
        Webtoon w2 = new Webtoon("123업", "판", "123님");
        Webtoon w3 = new Webtoon("나 혼자", "타", "추공");

        Webtoon[] webtoons = {w1,w2,w3};
        //Webtoon[] : 웹툰이 들어있는 배열[]
        // 배열에 여러개의 객체를 한 번에 저장.
        // 배열타입 Webtoon을 지정되면, 이 배열은 Webtoon 객체만 저장이 가능하다? (w1,w2,w3 이거 말하는듯.
    
        for(int i = 0; i < webtoons.length; i++){
            System.out.println(webtoons[i]); // 이러면 i의 주소만 나옴. 내용물은 안 보임.
            System.out.println("제목: " + webtoons[i].getTitle()+ "장르: " + webtoons[i].getGenre()+ "작가: " + webtoons[i].getAuthor());
            // System.out.println("장르: " + webtoons[i].getGenre());
            // System.out.println("작가: " + webtoons[i].getAuthor());
        }
        //이런 식으로 내용을 출력할 수도 있고 4-1로

    }
}





class Webtoon{
    private String title; //제목
    private String genre; // 장르
    private String author; // 저자 // (1)까지 전구로 

    private static int count = 0; //생성된 웹툰 객체수
//공용변수다? 클래스 변수? 정적 변수? 
//아무튼 이걸로 객체 생성될 때마다 기록(저장)하게 



    public Webtoon(String title, String genre, String author) {
        this.title = title;
        this.genre = genre;
        this.author = author; // (1)이렇게 만들 수 있음.

        Webtoon.count++;
    }

    public String getTitle() { //전구로 getter 만든거임 
        return title;
    }
    public String getGenre() {
        return genre;
    }
    public String getAuthor() {
        return author;
    }
    public static int getCount() {
        return count;
    }


    

}