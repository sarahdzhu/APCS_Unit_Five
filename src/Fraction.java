public class Fraction {
      private int numerator;
      private int denominator;

      public Fraction(){
          numerator=1;
          denominator=1;
      }

      public Fraction(int numerator, int denominator){
          this.numerator=numerator;
          this.denominator=denominator;
          if(this.denominator<0) {
              this.numerator -= 2 * (this.numerator);
              this.denominator += 2 * this.denominator;
          }

          int num= gCd(this.numerator,this.denominator);
          this.numerator=this.numerator/num;
          this.denominator= this.denominator/num;
      }

    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int gCd(int m, int n){


          while(m%n != 0) {
              int om = m;
              int on = n;
              m = on;
              n = (om%on);
          }

          return Math.abs(n);


      }

      public static Fraction add(Fraction one, Fraction two){
          int n1= one.getNumerator();
          int d1= one.getDenominator();
          int n2 = two.getNumerator();
          int d2 = two.getDenominator();

         int n3= (n1*d2 + n2*d1);
         int d3= d1*d2;

         return new Fraction (n3, d3);

      }

      public static Fraction subtract (Fraction one, Fraction two){
          int n1= one.getNumerator();
          int d1= one.getDenominator();
          int n2 = two.getNumerator();
          int d2 = two.getDenominator();

          int n3= (n1*d2 - n2*d1);
          int d3 = d1*d2;
          return new Fraction(n3, d3);
      }

      public static Fraction multiply(Fraction one, Fraction two){
          int n1= one.getNumerator();
          int d1= one.getDenominator();
          int n2 = two.getNumerator();
          int d2 = two.getDenominator();

          int n3 = n1*n2;
          int d3 = d1*d2;

          return new Fraction (n3, d3);

      }

      public static Fraction divide(Fraction one, Fraction two){
          int n1= one.getNumerator();
          int d1= one.getDenominator();
          int n2 = two.getNumerator();
          int d2 = two.getDenominator();

          int n3=  n1*d2;
          int d3= d1*n2;

          return new Fraction(n3, d3);


      }

      public String toString(){
          if (numerator> denominator){
              int first= numerator/denominator;
              int nn= numerator%denominator;


              return first +" " + nn + "/" + denominator;


          }

          return numerator +"/"+ denominator;


      }







}
