public class BasicAlgorTest {
    public static void main(String[] args) {
        BasicAlgor calculate = new BasicAlgor();
        System.out.println("odd");
        for (int i = 0; i < 256; i++) {
            if(i == calculate.isOddNum(i)) {
                System.out.println(i );
            }
        }
        int sum = 0;
        System.out.println("sum");
        for (int i = 0; i < 256; i++) {
            System.out.println(sum += i);
        }

        int[] myArr = {-1,-3,-5,-7,-9,-13};
        System.out.println("print array numbers");
        for(int i= 0; i < myArr.length; i++) {
            System.out.println(myArr[i]);
        }

        System.out.println("the max is");
        System.out.println(calculate.findMax(myArr));

        System.out.println("The average is");
        System.out.println(calculate.getAverage(myArr));

        calculate.arrayOfOdds();
        calculate.greaterThanY(myArr, 5);
        calculate.squareValues(myArr);
        int[] myArray2  = {1, 5, 10, -2};
        calculate.eliminateNegatives(myArray2);
        calculate.maxMinAvg(myArray2);
        int[] myArray3 = {1, 5, 10, 7, -2};
        calculate.arrayShift(myArray3);
    }
}
