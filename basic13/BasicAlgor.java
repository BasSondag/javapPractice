import java.util.ArrayList;


public class BasicAlgor {
    public Integer isOddNum(int int1) {
        if(int1 % 2 != 0) {
            return int1;
        } else {
            return  -1;
        }
    }
    public Integer findMax(int[] array) {
        int max = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public Integer getAverage(int[] array) {
        int av = 0;
        for (int i = 0; i < array.length; i++) {
            av += array[i];
        }
        return av / array.length;
    }

    public void arrayOfOdds() {
        ArrayList<Integer> myArray = new ArrayList<Integer>();

        for (int i = 1; i < 256; i = i + 2) {
            myArray.add(i);
        }

        System.out.println(myArray);
    }

    public void greaterThanY(int[] givenArray, int y) {
        int length = givenArray.length;
        int count = 0;

        for (int i = 0; i < length; i++){
            if (givenArray[i] > y){
                count++;
            }
        }

        System.out.println(count);
    }

    public void squareValues(int[] givenArray){
        int length = givenArray.length;

        for (int i = 0; i < length; i++){
            givenArray[i] *= givenArray[i];
        }

        System.out.println(java.util.Arrays.toString(givenArray));
    }

    public void eliminateNegatives(int[] array) {
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        int length = array.length;

        for(int i = 0; i < length; i++) {
            if(array[i] < 0) {
                myArray.add(0);
            } else {
                myArray.add(array[i]);
            }
        }

        System.out.println(myArray);
    }

    public void maxMinAvg(int[] givenArray) {
        int length = givenArray.length;
        int min = givenArray[0];
        int max = givenArray[0];
        double sum = 0;

        for(int i = 0; i < length; i++){
            if(givenArray[i] > max){
                max = givenArray[i];
            }
            if (givenArray[i] < min){
                min = givenArray[i];
            }
            sum += givenArray[i];
        }

        double avg = sum / length;
        System.out.println("Max is: " + max);
        System.out.println("Min is: " + min);
        System.out.println("Average is: " + avg);
    }

    public void arrayShift(int[] givenArray){
        int length = givenArray.length - 1;

        for(int i = 0; i < length; i++){
            givenArray[i] = givenArray[i + 1];
        }

        givenArray[length] = 0;

        System.out.println(java.util.Arrays.toString(givenArray));
    }
}
