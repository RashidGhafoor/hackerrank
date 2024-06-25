package src;

public class Main {
    public static void main(String[] args) {
        int[] A = {1, 1, 2, 3, 1, 2, 3};
        int[] B = {2, 3, 4, 4, 7, 9, 6};

        int count = countMaximumMeetings(A, B);
        System.out.println("Number of Maximum Meetings: " + count);
    }

    public static int countMaximumMeetings(int[] A, int[] B) {
        int validCount = 0;
        int n = A.length;

        for (int i = 0; i < n; i++) {

            boolean validPairFound = false;

            for (int j = 0; j < n; j++) {
                if (i != j) {
                    if (A[i] != A[j] && B[i] <= B[j] && B[i] <= A[j]) {
                        validPairFound = true;
                        break;
                    }
                }
            }


            if (validPairFound) {
                validCount++;
            }
        }

        return validCount;
    }
}
