package test.reflect;

public class JavaTest {

        public static void main(String[] args) {
            Object[][] b = {{ "aa", "bb" },{ "cc", "dd" } };//二维数组特例
            Object[] c = new Object[0];
            for (int i = 0; i < b.length; i++) {
//                b[i];//使用强制转化
//                System.out.println(c.toString());
            }
            for(Object a:c){
                System.out.println(a);
            }
        }

}
