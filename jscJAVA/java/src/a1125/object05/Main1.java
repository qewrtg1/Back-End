package a1125.object05;
// 278p인가 에서 15번 매우 중요한 문제. 책과 함께 복습할 것.




public class Main1 {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();


        boolean result = memberService.login("hong","12345");
        
        
                if(result){
                    System.out.println("로그인되있습니다.");
                    memberService.logout("hong");
                }else{
                    System.out.println("id 또는 passward가 올바르지 않아요");
                }
            }
        
        }
        
        
        
        class MemberService{
            private String id;
            private String password;



            public boolean login(String id, String pass) {
                if(id.equals("hong")&& pass.equals("12345")){
                    return true;
                }else{
                    return false;
                }

            }


}
