package a1120;

// import javax.management.relation.Role; 이거 그냥 잘못 가져온듯?

public class A_3Ex {
    public static void main(String[] args) {
        C_3Role role = C_3Role.ADMIN;

        //역할 출력
        System.out.println("현재 역할 : " + role);
        System.out.println("일반 사용자 역할 : "+ C_3Role.USER);

        //역할 확인

        if (role == C_3Role.ADMIN) {
            System.out.println("관리자 권한이 있습니다.");
        }else if (role == C_3Role.USER){
            System.out.println("일반 사용자입니다.");
        }
        //enum 타입을 쓰는 이유 (C로 걸어둔 애들)
        // 1. 가독성: ADMIN, USER 같이 의미를 쉽게 알 수 있음.
        // 2. 안정성
        // = String role = "ADMIN" //String으로 할 시 오타 가능성이 크다? 라고 함.
        // 3. 유지보수성
        // = 값이 변경되거나 추가될 경우 enum을 사용하면 해당값의 정의만 수정이 용이함.

    
    }
    
}
