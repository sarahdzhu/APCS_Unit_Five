public class Fractiontest {

    public static void main(String[] args) {

        Fraction f1 = new Fraction(8, 11);
        Fraction f2 = new Fraction(7,43);
        Fraction f3 = (Fraction.divide(f1, f2));


        System.out.println(f3);
    }

}
