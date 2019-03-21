package Demo02;

public class Test17 {
    public static void main(String[] args) {
        int i = 0;
        try {
            testMethod(i);
            System.out.println("testMethod");
        } catch (Exception e) {
            System.out.println("by zero");
        }
    }

    public static void testMethod(int i) throws Exception {
        int s = 1 / i;
        System.out.println("Test_1");
    }
    }

