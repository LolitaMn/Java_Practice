public class BiggerValue {

    public long biggerValue(int a, int b) {
        if(a != b) {
            long biggerFromAB = Math.max(a, b);
            return biggerFromAB;
        } else {
            long biggerFromAB = a;
            return biggerFromAB;
        }

    }

}
