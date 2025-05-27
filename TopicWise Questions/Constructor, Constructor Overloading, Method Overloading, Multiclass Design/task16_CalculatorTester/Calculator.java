package task16_CalculatorTester;

public class Calculator {
    public int n1;
    public int n2;

    public void add(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
        System.out.println(n1 + n2);
    }

    public void add(int n1, int n2, int n3) {
        System.out.println(n1 + n2 + n3);
    }

    public void multiply(int n1, int n2) {
        System.out.println(n1 * n2);
    }

    public void multiply(int n1, int n2, int n3) {
        System.out.println(n1 * n2 * n3);
    }

    public void multiply(String n1, int n2) {
        for (int i = 0; i < n2; i++) {
            if (i == n2 - 1) {
                System.out.print(n1);
            } else {
                System.out.print(n1 + "-");
            }

        }
        System.out.println();
    }
}



