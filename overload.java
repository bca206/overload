public class overload {
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        overload obj = new overload();
        System.out.println("Sum (2 numbers): " + obj.sum(5, 10));
        System.out.println("Sum (3 numbers): " + obj.sum(3, 7, 2));
    }
}
