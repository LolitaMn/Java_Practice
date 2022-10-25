public class ConditionalActions {

    public String conditionalActions(int m) {
        if (m != 0) {
            if (m % 7 == 0 && m % 9 == 0) {

                return "Good Morning";
            }
            if (m % 9 == 0) {

                return "Bad Number";
            }
            if (m % 11 == 0) {

                return "Poor Number";
            }

            return "-1";
        }

        return "Enter number greater than 0";

    }


}
