 class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 2, 8, 4, 5};
        int n = 8; 

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        int missingNumber = expectedSum - actualSum;
        System.out.println("Missing Number: " + missingNumber);
    }
}

    


