package DSA;

public class gasStation {

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int pos = 0;
        int curr = 0;
        int total = 0;

        for (int i = 0; i < gas.length; i++) {
            int diff = gas[i] - cost[i];
            curr += diff;
            total += diff;

            if (curr < 0) {
                curr = 0;
                pos = i + 1; // next station as potential start
            }
        }

        if (total >= 0) {
            return pos;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        System.out.println(canCompleteCircuit(gas, cost));
    }
}
