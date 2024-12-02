package a11.a1119;

public class A_1Array4_0 {
    public static void main(String[] args) {
        
        int[] arr = {4,1,8,-3,6};

        int max = arr [0]; // 배열에 첫번재를 최대값에 대입
        int min = arr [0]; // 배열에 첫번재를 최소값에 대입 ... 하려고 만듬?
        
        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }

        }
        System.out.println("최대값:"+max);
        System.out.println("최소값:"+min);
    }
}
