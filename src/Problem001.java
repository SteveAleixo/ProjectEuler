public class Problem001 {
    public static int solution() {
        int sumOfTargetNaturals = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sumOfTargetNaturals += i;
            }
        }
        return sumOfTargetNaturals;
    }
}
