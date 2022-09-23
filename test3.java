public class test3 {

    public static void main(String[] args) {
        int num1 = 0;  // 정수 값을 지정
        int num2 = 0;

        while (num1 + num2 != 5) {  // 눈1과 눈2 를 더했을때 원하는값 5를 지정
            num1 = (int)(Math.random() * 6) +1; //Math.random()함수는 0.ㅁㅁ ~ 0.9ㅁㅁ까지 반환한다
            num2 = (int)(Math.random() * 6) +1; //정수는 Math.random()을 0으로 나타내므로 +1 을 더하고 원하는 랜덤 값만큼 곱을 해준다
            System.out.println("("+num1+","+num2+")");
        }
    }
}