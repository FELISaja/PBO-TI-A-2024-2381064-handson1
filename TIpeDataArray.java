public class TIpeDataArray {
    public static void main(String[] args) {

        //cara 1
        Object[] kumpulanNumber;
        kumpulanNumber = new Object[][3];

        //cara 2
        int[] kumpulanNumber2 = new int[3];

        //cara 3
        int[] kumpulanNumber3 = new int[] {1, 3, 4, 5};

        kumpulanNumber[0] = 100;
        kumpulanNumber[1] = "felis";
        kumpulanNumber[2] =20L;

        System.out.println(kumpulanNumber[1]);
    }
}
