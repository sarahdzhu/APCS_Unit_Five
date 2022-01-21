public class Fractiontest {

    public static void main(String[] args) {

        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(3, 2);
        Fraction f3 = (Fraction.add(f1, f2));


        System.out.println(f3);
    }

}
