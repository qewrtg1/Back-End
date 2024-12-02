package a11.a1118;

import java.util.Arrays;

public class B1_test {
    public static void main(String[] args) {
        
//45개의 숫자를 넣어보시오
        int[] ball = new int [45];

        for(int i = 0; i<ball.length; i++ ){
            ball[i] = i+1;
        }
        // System.out.println(Arrays.toString(ball)); 45까지 알아서 들어갔는지 확인하는 용도임.
        
int n = 0;
int tmp = 0;
        
        for(int i = 0; i < 1000; i++){
            n = (int)(Math.random() * 45); //
            tmp = ball[0];
            ball[0] = ball[n];
            ball[n] = tmp;
        }
        // System.out.println(Arrays.toString(ball)); // 여기까지하면 잘 섞여있음을 알 수 있음
        //이걸 앞에서 6개만 뽑아내려면?

        for(int i = 0; i<6; i++){
            System.out.printf("ball[%d]=%d\n", i, ball[i]);
            System.out.printf("ball["+i+"]="+ball[i]+"\n");


//System.out.printf에서 사용되는 것입니다. 
//이 지정자는 출력할 값이 **정수(int 타입)**일 때 사용됩니다. 
//즉, printf를 사용하여 출력할 때, 
//%d는 "이 자리에 정수를 출력하라"는 의미를 가지고 있습니다.
        }
    }
}
