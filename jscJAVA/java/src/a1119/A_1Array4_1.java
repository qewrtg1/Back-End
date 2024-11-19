package a1119;

public class A_1Array4_1 {
    public static void main(String[] args) {
        
        int[] arr = {4,1,8,-3,6};

        int max = arr [0]; // 배열에 첫번재를 최대값에 대입
        int min = arr [0]; // 배열에 첫번재를 최소값에 대입 ... 하려고 만듬?
        
//4-0 내용을 foreach문으로 바꿔봄


            for (int num : arr) {
                if (max < num) {
                    max = num;  // 새로운 최대값이 있으면 갱신
                }
                if (min > num) {
                    min = num;  // 새로운 최소값이 있으면 갱신
                }
            }

            
        
    }
}
