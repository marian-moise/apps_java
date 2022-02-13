package OOP.enumTest;

public enum EnumTest {
    MONDAY(2, "testtttt"),
    TUESDAY(3, "otherTesttttt");

    public static final int a = 1;
    public static final String b = "asd";

    private int c = 1;
    private String d = "asd2";

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    EnumTest(int c) {
        this.c = c;
    }

    EnumTest(int c, String d) {
        this.c = c;
        this.d = d;
    }
}
