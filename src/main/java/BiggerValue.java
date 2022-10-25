public class BiggerValue {

//    public long biggerValue(int a, int b) {
//        long biggerFromAB;
//        if (a != b) {
//            biggerFromAB = Math.max(a, b);
//        } else {
//            biggerFromAB = a;
//        }
//        return biggerFromAB;
//
//    }

//    public long biggerValue(int a, int b) {
//        long biggerFromAB;
//        if (a < b) {
//            biggerFromAB = Math.max(a, b);
//        } else {
//            biggerFromAB = a;
//        }
//        return biggerFromAB;
//
//    }


    public long biggerValue(int a, int b) {

        return (a < b)
                ? b
                : a;

    }

}
