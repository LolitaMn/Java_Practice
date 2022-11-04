import project_utils.Helpers;

public class ManipulationsWithArrays {

    public int [] multiplуArrayByNumber(int[] array, int number) {

        if(number == 0) {

            return array;
        }

        if(Helpers.checkForNullArray(array) && Helpers.checkForEmptyArray(array)){
            int[] newArray = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                //int result = array[i] * number;
                newArray[i] = array[i] * number;

            }

            return newArray;
        }

        return new int[0];
    }




   public double [] toDoubleArray(int[] array) {

        if(Helpers.checkForNullArray(array) && Helpers.checkForEmptyArray(array)){
            double[] newArray = new double[array.length];
            for (int i = 0; i < array.length; i++) {

                newArray[i] = array[i];
            }

            return newArray;
        }

        return new double[0];
    }

    public int [] toIntArray(double[] array) {

        if(Helpers.checkForNullArray(array) && Helpers.checkForEmptyArray(array)){
            int[] newArray = new int[array.length];
            for (int i = 0; i < array.length; i++) {

                newArray[i] = (int)array[i];
            }

            return newArray;
        }

        return new int[0];
    }


    public String[] toStringArray(int[] array) {

        if(Helpers.checkForNullArray(array) && Helpers.checkForEmptyArray(array)){
            String[] newArray = new String[array.length];
            for (int i = 0; i < array.length; i++) {

                newArray[i] = "" + array[i];
            }

            return newArray;
        }

        return new String[0];
    }

    public String[] toStringArrayFromDouble(double[] array) {

        if(Helpers.checkForNullArray(array) && Helpers.checkForEmptyArray(array)){
            String[] newArray = new String[array.length];
            for (int i = 0; i < array.length; i++) {

                newArray[i] = "" + array[i];
            }

            return newArray;
        }

        return new String[0];
    }


    public boolean areValuesGreaterThanNumber(int[] array, int number) {

        if(Helpers.checkForNullArray(array) && Helpers.checkForEmptyArray(array) ) {

            int counter = 0;

            for(int i = 0; i < array.length; i++) {
                if (array[i] > number) {

                    counter++;
                }
            }

            return counter == array.length;
        }

        return false;
    }











}
