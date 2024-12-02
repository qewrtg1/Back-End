package a11.a1119;
import java.util.Scanner;
import java.util.Arrays;

public class B_NumberString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("한글로 변환할 수를 입력하세요: ");
        int number = scan.nextInt();

        int[] nums = new int[5];
        //12345 일만 이천 삼백 사십 오
        System.out.println(Arrays.toString(nums));

        nums[0] = number/10000; //만의 자리 수가 추출됨.
        nums[1] = (number/1000)%10;
        nums[2] = (number/100)%10;
        nums[3] = (number/10)%10;
        nums[4] = (number/1)%10;

        String sum_str = "";

        for(int i = 0; i < 5;i++){
            if(nums[i] == 1){
                sum_str += "일";
            }else if(nums[i] == 2){
                sum_str += "이";
            }else if(nums[i] == 3) {
				sum_str += "삼";
			}else if(nums[i] == 4) {
				sum_str += "사";
			}else if(nums[i] == 5) {
				sum_str += "오";
			}else if(nums[i] == 6) {
				sum_str += "육";
			}else if(nums[i] == 7) {
				sum_str += "칠";
			}else if(nums[i] == 8) {
				sum_str += "팔";
			} else if(nums[i] == 9) {
				sum_str += "구";
			}
            //System.out.println(sum_str);
        }
        //일만 이천 삼백 사십
        System.out.println(sum_str);
    }
}
