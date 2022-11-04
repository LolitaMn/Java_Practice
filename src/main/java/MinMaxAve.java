import project_utils.Helpers;

public class MinMaxAve {

    public int[] MinMaxAve(int[] array, int index1, int index2) {

        if (index1 >= 0 && index1 < array.length && index2 >= 0 && index2 < array.length) {

            if (index1 > index2) {
                int n;
                n = index1;
                index1 = index2;
                index2 = n;
            }

            int sum = 0;
            int range = 0;
            int min = array[index1];
            int max = array[index1];

            for (int i = index1; i <= index2; i++, range++) {
                sum += array[i];

                if (array[i] < min) {
                    min = array[i];
                } else {
                    max = array[i];
                }
            }
            int average = sum / range;

            return new int[]{min, max, average};
        }

        return new int[0];
    }
}
