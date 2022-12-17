package BigDecLongCode;

import java.math.BigDecimal;

public class BigDecLongCode {
    public static void main(String[] args) {
        int a = 2147483647;
        int b = 10;
        BigDecimal y = new BigDecimal(a);
        BigDecimal x = new BigDecimal(b);
        long sum = (long) a + (long) b;
        System.out.println(y.add(x));
    }
}