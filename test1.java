public class test1 {

    public static void main(String[] args) {

        int var1=5;   // 정수끼리의 연산은 정수 값만 나타낼 수 있다.
        int var2=2;   // 둘중 하나는 실수여야지만 소수점 값을 나타낼 수 있다.
        double var3=var1/ (double) var2; // <---- 정수를 실수로 변환
        int var4=(int)(var3*var2);
        System.out.println(var4);

    }
}