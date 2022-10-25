public class OddIndices {

//    public int[] oddIndices(int[] array) {
//        if (array.length > 0) {
//            int[] result = new int[array.length / 2];
//            for (int i = 0; i < result.length; i++) {
//                result[i] = array[2 * i + 1];
//            }
//
//            return result;
//        }
//
//        return new int[0];
//    }


    public int[] oddIndices(int[] array) {

        if (array != null && array.length > 0) {

                int[] result = new int[array.length / 2];  //  new  Array  is created smaller in 2 times
                int i2 = 0;
                for (int i = 1; i < array.length; i += 2) {
                    result[i2] = array[i];
                    i2++;
                }

                return result;
        }

        return new int[0];
    }


}
