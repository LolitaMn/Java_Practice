public class OddIndices {

    public int[] oddIndices(int[] array) {
        if (array.length > 0) {
            int[] res = new int[array.length / 2];
            for (int i = 0; i < res.length; i++) {
                res[i] = array[2 * i + 1];
            }

            return res;
        }

        return new int[0];
    }




}
