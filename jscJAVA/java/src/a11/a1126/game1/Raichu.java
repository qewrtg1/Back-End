package a11.a1126.game1;

//상속 복습인듯?
// - 키워드 : public class 자식 클래스(Raichu), extend.부모클래스(Pikachu)

public class Raichu extends Pikachu {


    //생성자 직접 손으로 만듬. 전구 눌러도 안나와서.

    public Raichu(){
        super(200, "슈퍼 전기");
    }
    public Raichu(int energy, String type){
        super(energy, type, 20);
    }
    public Raichu(int energy, String type, int level){
        super(energy, type, level);
    }


    //오버로드와 오버라이징? 은 다르다.

    //피카츄에서 가져옴. 값은 그대로 쓰고 싶은데 결과물만 (십만볼트, 백만볼트)만 바꾸고 싶음
    //가능함
    //클래스 라이츄에서 전구 눌러서 불러옴
    @Override
    public String aAttack() {
        return "천만볼트";
    }

    @Override
    public String bAttack() {
        return "볼트 체인지";
    }

    
    //추가 생성(수동으로 만듬)
    public String cAttack(){
        if(level >=40){
            return"아이언테일";
        }else{
            return"사용불가";
        }
    }


}
