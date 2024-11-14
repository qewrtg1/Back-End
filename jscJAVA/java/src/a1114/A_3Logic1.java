package a1114;
//93p~94P
public class A_3Logic1 {
    public static void main(String[] args) {
        int charCode = 'A';	 //아스키코드 65? 라고함
		//int charCode = 'a';	
		//int charCode = '5';	
		
		if( (65<=charCode) & (charCode<=90) ) {  //A~Z
			System.out.println("대문자 이군요");
		}
		
		if( (97<=charCode) && (charCode<=122) ) { //&(and)하나와 &&는 연산속도가 다름 
			System.out.println("소문자 이군요");
		}
		
		if( (48<=charCode) && (charCode<=57) ) {//93p~94P에 상세하게 내용이 있음
			System.out.println("0~9 숫자 이군요");
		}
		
		//----------------------------------------------------------
		
		int value = 6;
		//int value = 7;
		
		if( (value%2==0) | (value%3==0) ) {
			System.out.println("2 또는 3의 배수 이군요");
		}
		
		boolean result = (value%2==0) || (value%3==0);
		if( !result ) {
			System.out.println("2 또는 3의 배수가 아니군요.");
		}		
    }
}
