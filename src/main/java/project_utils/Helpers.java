package project_utils;

public class Helpers {

    public static boolean checkForEmptyArray(String[] array) {

        if(array.length != 0) {

            return true;
        } else {

            return false;
        }
    }

    public static boolean checkForEmptyArray(int[] array) {

        if(array.length != 0) {

            return true;
        } else {

            return false;
        }
    }

    public static boolean checkForNullArray(String[] array) {

        if(array != null) {

            return true;
        } else {

            return false;
        }
    }
    public static boolean checkForNullArray(int[] array) {

        if(array != null) {

            return true;
        } else {

            return false;
        }
    }

    public static int lengthArray(int[] array) {

        int count = 0;
        for(int i = 0; i < array.length; i++) {
            count++;

        }

        return count;
    }



}
