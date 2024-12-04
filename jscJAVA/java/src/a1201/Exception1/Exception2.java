package a1201.Exception1;

public class Exception2 {
    public static void main(String[] args) {
        String str = null;
        //NULL 참조
        //객체가 null인 상태에서 해당객체를 호출하거나 멤버에 접근할 때 발생
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
           System.out.println("널 참조가 발생: " + e.getMessage());
        }
    }
}



/// ArrayIndexOutOfBoundsException e
/// NullPointerException e



// 요리 재료 (매개 변수): 요리 재료는 요리를 만들기 위한 "실제 재료"입니다. 예를 들어, 요리할 때 사용할 "양파", "감자" 같은 것이 재료입니다.
// 매개 변수는 요리법에서 사용되는 재료라고 할 수 있습니다. 즉, 어떤 "구체적인 값"을 나타냅니다.
// 요리법 (참조 변수): 요리법은 재료를 어떻게 사용할지 알려주는 "설명서"라고 할 수 있습니다. 요리법에서 실제 재료를 사용할 수 있도록, 재료들이 어떤 "그릇"에 담겨있는지 가리킵니다.
// 참조 변수는 "그릇"처럼 객체가 어디에 저장되어 있는지 알려주는 역할을 합니다. 참조 변수는 "주소"를 가지고 있어, 해당 객체를 찾아서 그 객체에 접근할 수 있게 해줍니다.