package Interface.array;

public class MyArrayTest {
    public static void main(String[] args) {
        MyArray ar = new MyArray();

        int[] a = {1,3,5};
        int[] b = {3,5,8};

        System.out.println(ar.getTwoArrayAvg(a,b));

        int[] c = {2,4,8};

        System.out.println(ar.isEvenArray(c));
    }
}
