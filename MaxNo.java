class Max {
    void maximum() {
        int[] numbers = {22, 14, 8, 35, 19};
        // assuming first number is max
        int max = numbers[0];  

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("The Maximum number in the array is: " + max);
    }

    public static void main(String[] args) {
        Max obj = new Max();
        obj.maximum();
    }
}
