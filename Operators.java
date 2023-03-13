public class Operators {
    public static void main(String[] args) {
        // 1. ASSIGNMENT OPERATOR
        int m1,m2,m3,m4;
        m1=m2=m3=m4=10;
        System.out.println(m1+" "+m2+" "+m3+" "+m4);
        // COMPOUNT ASSIGNMENT
        int a=10;
        a=a+5;
        System.out.println();
        System.out.println(a);
        a+=5;
        System.out.println(a);

        int c=10;
        c /=5;
        System.out.println(c);

        // 2. RELATIONAL OPERATOR
        a=10;
        int b=10;
        c=20;
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(a<=b);
        System.out.println(b>=c); 
    }
}
