import java.util.Arrays;

class Isomorphic {
    static int size = 256;

    public static void main(String[] args) {
        boolean result = IsomorphicTest("egg", "add");
        System.out.println("Is Isomorphic?? "+result);

    }

    static boolean IsomorphicTest(String a, String b) {
        int i = a.length();
        int j = b.length();

        if (i != j) {
            return false;
        }
        Boolean[] test = new Boolean[size];
        Arrays.fill(test, Boolean.FALSE);

        int[] map = new int[size];
        Arrays.fill(map, -1);

        for (int k = 0; k < j; k++) {
            if (map[a.charAt(k)] == -1) {
                if (test[b.charAt(k)] == true)
                    return false;

                test[b.charAt(k)] = true;
                map[a.charAt(k)] = b.charAt(k);

            } else if (map[a.charAt(k)] != b.charAt(k))
                return false;
        }
        return true;
    }
}