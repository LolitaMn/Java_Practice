import project_utils.Helpers;

public class OddEvenValuesInArray {


    public int countEvenValuesInArray(int[] array) {
        if(Helpers.checkForNullArray(array) && Helpers.checkForEmptyArray(array)) {
            int counter = 0;
            for(int i = 0; i < array.length; i++){
                if(array[i] % 2 == 0) {
                    counter++;
                } else {
                    counter = counter + 0;
                }
            }

            return counter;
        }

        return -1;
    }

    public int countOddValuesInArray(int[] array) {                                // Method 1
        if(Helpers.checkForNullArray(array) && Helpers.checkForEmptyArray(array)) {
            int counter = 0;
            for(int i = 0; i < array.length; i++){
                if(array[i] % 2 != 0) {
                    counter++;
                } else {
                     counter = counter + 0;
                }
            }

            return counter;
        }

        return -1;
    }




}
