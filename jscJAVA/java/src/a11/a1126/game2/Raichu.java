package a11.a1126.game2;


public class Raichu extends Pikachu {

    public Raichu(){
        super(200, "슈퍼 전기");
    }
    public Raichu(int energy, String type){
        super(energy, type, 20);
    }
    public Raichu(int energy, String type, int level){
        super(energy, type, level);
    }


    @Override
    public String aAttack() {
        return "천만볼트";
    }

    @Override
    public String bAttack() {
        return "볼트 체인지";
    }

    @Override //조상에 있는 걸 투스트링 해라?
    public String toString() {
        return super.toString() + "cAttack()=" + cAttack();
    }



    
    ///// 제일 난해한 부분임. ////
    
    
    public String cAttack(){
        if(getLevel() >=40){
            //이건 피카츄에서 쓰고 있는 값임. 그래서 다이렉트로 접근이 안됨 get필요
            //lever이 아니라 getLevel()으로 접근
            return"아이언테일";
        }else{
            return"사용불가";
        }
    }



}
