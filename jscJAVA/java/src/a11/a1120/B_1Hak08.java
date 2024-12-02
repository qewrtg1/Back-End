package a11.a1120;
//200p 8번 문제
public class B_1Hak08 {
    public static void main(String[] args) {
        int [][]array = {
            {95, 86},
            {83, 92, 96},
            {78, 93, 83, 87, 88}
        };
        int sum = 0;
        double avg = 0.0;
        int count = 0;
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                // 알아서 들어갔는지 확인용System.out.println("array["+i+"]["+j+"]"+array[i][j]);
                sum=sum+array[i][j];
                count++;
            }

        }
        avg = sum /count;
        System.out.println("sum: " +sum);
        System.out.println("avg: " +avg);

    }
    
}
