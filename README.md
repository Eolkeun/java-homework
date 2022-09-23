# java-homework
<br><br>
<h1>JAVA 과제🔥🔥</h1>
<br><br>

<h3>1. 다음 코드를 실행하면 출력 결과로 5를 기대했는데 4가 출력되었습니다. 어디에서 잘못 작성된 것일까요?</h3>
<pre>
<code>
public class test1 {
    public static void main(String[] args) {

        int var1=5;   // 정수끼리의 연산은 정수 값만 나타낼 수 있다.
        int var2=2;   // 둘중 하나는 실수여야지만 소수점 값을 나타낼 수 있다.
        double var3=var1/ (double) var2; // <---- 정수를 실수로 변환
        int var4=(int)(var3*var2);
        System.out.println(var4);
    }
}
</code>
</pre>
정수끼리의 연산은 정수 값만 나타내기 때문에 두 정수중 하나는 실수로 바꿔주어야 소수점 값을 나타낼 수 있습니다.
<pre>
<code>
double var3=var1/var2; ---> double var3=var1/ (double) var2;
</code>
</pre>
<br><br>
---

<h3>2. 다음 코드를 실행했을 때 출력 결과는 무엇입니까? (증감연산자에 대해 알아보세요!)</h3>
<pre>
<code>
public class test2 {
    public static void main(String[] args) {
        int x=10;
        int y=20;
        int z = (++x) + (y--);   // <---- z = (11) + (20)
        System.out.println(z);   //  --는 y의 뒤쪽에 있기 때문에 연산 이후에 y에만 적용된다
        // 이후 결과값 x=11, y=19, z=31
    }
}
</code>
</pre>
++이나 --이가 뒤쪽으로 들어가면 연산이 끝난 이후 개인적으로 연산하게 됩니다.
<br><br>
---

<h3>3. while문과 Math.random() 메소드를 이용해서 2개의 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2) 형태로 출력하고, 눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈추는 코드를 작성해보세요. 눈의 합이 5가 되는 조합은 (1,4), (4,1), (2,3), (3,2)입니다.</h3>
<pre>
<code>
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
</code>
</pre>
