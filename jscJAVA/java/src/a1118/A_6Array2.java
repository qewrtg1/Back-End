package a1118;
//171p~172p
public class A_6Array2 {
    public static void main(String[] args) {

        //먼저 배열 변수를 선언하고
        int [] scores;
        //배열 변수에 배열을 대입할 수 있음
        scores = new int[]{ 93, 90, 89};

        int sum = 0;

        for(int i = 0; i < scores.length; i++){
            sum = sum + scores[i];
            // sum +=scores[i]; 이렇게 축약 가능
        }
        // System.out.println("총합: " + sum);
        // double avg = (double) sum / scores.length;
        // System.out.printf("평균: %.2f\n" , avg); 
        // System.out.println("평균: " + avg);


        //이렇게 변수 선언 후 대입해도 결과는 같음




        //배열을 매개값으로 주고, printItem 메소드를 호출해 보겠음
        // printItem();//일단 이렇게 쓰고 클릭하면 좌측에 전구 모양 나오는데 
        //             //전구 클릭하면 아래처럼 만들어짐
        //     }
        
        //     private static void printItem() {
        //         // TODO Auto-generated method stub
        //         throw new UnsupportedOperationException("Unimplemented method 'printItem'");
        //     }
//다시해봄

        //배열을 매개값을 주고 printItem 메소드를 호출함(*????? 먼소리)
        printItem(new int[] {93, 90, 87});
                
                
            }
            //이게 printItem 메소드 선언, 이라는 건가 봄
            public static void printItem(int[] scores) { //만들때 'public'이 아니라 'private'이 나오는데 일단 임의로 바꿈
            //매개 변수가 참조하는 배열의 항목을 출력?
                for(int i = 0; i <3; i++){
                    System.out.println("scores["+i+"]: " + scores[i]);
                }
            }


}
