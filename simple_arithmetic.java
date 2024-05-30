public class simple_arithmetic {
    public static class SimpleEquation {
        private int a;
        private int b;
        public SimpleEquation() {
            a = 1;
            b = 0;
        }
        public SimpleEquation(int aa, int bb) {
            if (aa == 0) {
                aa = 1;
            }
            a = aa;
            b = bb;
        }
        public int getA() {
            return a;
        }
        public int getB() {
            return b;
        }
        public void setA(int aaa) {
            if (aaa == 0) {
                aaa = 1;
            }
            a = aaa;
        }
        public void setB(int bbb) {
            b = bbb;
        }
        public String toString() {
            return a + "x + " + b;
        }
        public int getY(int x) {
            return a * x + b;
        }
    }
    public static void main(String[] args) {
        SimpleEquation e1 = new SimpleEquation(6, 5);


        System.out.println(e1);
        System.out.println(e1.getY(4)); 


        e1.setA(0);


        System.out.println(e1);
        System.out.println(e1.getY(4)); 
    }
    /*
    int a is the coefficient, multiplied by x (variable).
    Adding b leads to ax + b = y.
    */
}

