class Line {
   private int a;
   private int b;
   private int c;



   public Line(int a, int b, int c){
       this.a=a;
       this.b=b;
       this.c=c;

   }

    public double getSlope(){
       double slope= (double) -a/b;
       return slope;
    }

    public boolean isOnLine(int x, int y) {
        if (a * x + b * y + c == 0) {
            return true;
        } else {
            return false;
        }

    }

    public boolean isParallel(Line other){
      if((double)  -a/b==other.getSlope()){
          return true;

        }else{
          return false;
      }
    }

    public String toString(){

        return a+"x + " + b + "y + "+ c + " = 0";
    }
}
