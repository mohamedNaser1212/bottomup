public class Calculator {
    private Addition addition;
    private Subtraction subtraction;

    public Calculator() {
        this.addition = new Addition();
        this.subtraction = new Subtraction();
    }

    public int add(int a, int b) {
        return addition.add(a, b);
    }

    public int subtract(int a, int b) {
        return subtraction.subtract(a, b);
    }
}

