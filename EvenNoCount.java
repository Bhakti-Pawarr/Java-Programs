class Array {
    void EvenCount() {
        int[] numbers = {10, 21, 4, 45, 66, 93};
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count++;
            }
        }

        System.out.println("Count of even numbers in the array is: " + count);
    }

    public static void main(String[] args) {
        Array No = new Array();
        No.EvenCount();
    }
}
