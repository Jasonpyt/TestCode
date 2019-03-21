package Demo02;

public class Test05 {
    public static void main(String[] args) {
        int[] src = new int[]{1,2,3,4,5};
        int[] dest = new int[]{6,7,8,9,10};
        System.arraycopy( src, 2, dest, 1, 3);
        for (int i : src) {
            System.out.print(i);
        }
        System.out.println();
        for (int i : dest) {
            System.out.print(i);
        }
    }
}
