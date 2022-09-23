public class test2 {

    public static void main(String[] args) {

        int x=10;
        int y=20;
        int z = (++x) + (y--);   // <---- z = (11) + (20)
        System.out.println(z);   //  --는 y의 뒤쪽에 있기 때문에 연산 이후에 y에만 적용된다
        System.out.println(x);
        System.out.println(y);

        // 이후 결과값 x=11, y=19, z=31

    }
}
