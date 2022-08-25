package WrappersBoxingArrays;

public class Boxing {
    public static void main(String[] args) {
        Integer i = new Integer(10);

        int x = i.intValue();


        Integer i1 = 127;
        Integer i2 = 127;

        Integer i3 = 128;
        Integer i4 = 128;

        System.out.println(i1.equals(i2));
        System.out.println(i3.equals(i4));

    }

}
