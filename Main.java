public class Main {
    public static void main(String[] args) {
        double balance = 578345.90;
        double transfer = 5000.45;
        int bonus = (int) (transfer / 100);
        int totalBonus;
        if (transfer >= 1000) {
            totalBonus = bonus;
        } else {
            totalBonus = 0;
        }
        System.out.println(totalBonus);
    }

}
