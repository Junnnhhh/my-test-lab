public class Calculator {

    public int add(int a, int b) {
        return doAdd(a, b);
    }
    // 추가(E)
    // 수정 (F)
    private int doAdd(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("negative not allowed");
        }
        return a + b;
    }
}