package OOP.StringBufferAndStringBuilder;

import java.math.BigDecimal;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        StringBuffer sbf = new StringBuffer("test");
        StringBuilder sb = new StringBuilder("test");

        BigDecimal bd_1 = new BigDecimal(1);
        BigDecimal bd_2 = new BigDecimal(1);
//        System.out.println(bd_1.hashCode());
//        System.out.println(bd_2.hashCode());

        String s = "test";
        System.out.println(s.substring(4));
        System.out.println(s.substring(1, 1));


        Date dateStart = new Date();
//        StringBuffer sbf_1 = new StringBuffer(10000000);
        StringBuffer sbf_1 = new StringBuffer();
        for (int i = 0; i < 10000000; i++) {
            sbf_1.append("test");
        }
        Date dateEnd = new Date();
//        System.out.println(dateEnd.getTime() - dateStart.getTime());



        Date dateStart1 = new Date();
//        StringBuilder sb_1 = new StringBuilder(10000000);
        StringBuffer sb_1 = new StringBuffer();
        for (int i = 0; i < 10000000; i++) {
            sb_1.append("test");
        }
        Date dateEnd1 = new Date();
//        System.out.println(dateEnd1.getTime() - dateStart1.getTime());


    }
}
