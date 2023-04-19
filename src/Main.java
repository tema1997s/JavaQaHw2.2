public class Main {
    public static void main(String[] args) {
        int balance = 138;
        int refill = 1555;
        int bonus;
        boolean terms = refill > 1000;
        if (terms) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        int finalBalance = balance + refill + bonus;
        System.out.println(finalBalance + " рублей");
    }
}