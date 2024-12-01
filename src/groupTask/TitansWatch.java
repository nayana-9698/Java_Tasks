package groupTask;

//public class groupTask.TitansWatch extends groupTask.Hours implements groupTask.Minutes{
public class TitansWatch extends Watch implements Hours, Minutes, Seconds, Price, Colour {

    public static void main(String[] args) {
        TitansWatch Twatch = new TitansWatch();
        Twatch.brand(); //java class

        Twatch.hour(); //interface class 1
        Twatch.tenHours();
        Twatch.twentyHours();

        Twatch.min(); //interface class 2
        Twatch.tenMin();
        Twatch.twentyMin();

        Twatch.sec(); //interface class 3
        Twatch.tenSec();
        Twatch.twentySec();

        Twatch.lowPrice(); //interface class 4
        Twatch.mediumPrice();
        Twatch.highPrice();

        Twatch.black(); //interface class 5
        Twatch.roseGold();
        Twatch.silver();

   }
   //@Override (groupTask.Hours is an java class, we aren't able to override bcz we have extended groupTask.Hours class which is inheritance)
//    public void groupTask.Hours(){
//
//    }

    @Override
    public void hour() {
        System.out.println("Implementing hour method here for 1st Interface class");
    }

    @Override
    public void tenHours() {
        System.out.println("Implementing tenHours method here for 1st Interface class");
    }

    @Override
    public void twentyHours() {
        System.out.println("Implementing twentyHours method here for 1st Interface class");
        System.out.println();
    }

    public void min() {
        System.out.println("Implementing min parent here for 2nd Interface class");
    }

    @Override
    public void tenMin() {
        System.out.println("Implementing tenMin method here for 2nd Interface class");
    }

    @Override
    public void twentyMin() {
        System.out.println("Implementing twentyMin method here for 2nd Interface class");
        System.out.println();

    }

    @Override
    public void sec() {
        System.out.println("Implementing sec parent method here for 3rd Interface class");
    }

    @Override
    public void tenSec() {
        System.out.println("Implementing tenSec method here for 3rd Interface class");
    }

    @Override
    public void twentySec() {
        System.out.println("Implementing twentySec method here for 3rd Interface class");
        System.out.println();

    }


    @Override
    public void lowPrice() {
        System.out.println("Implementing lowPrice method here for 4th Interface class");
    }

    @Override
    public void mediumPrice() {
        System.out.println("Implementing mediumPrice method here for 4th Interface class");
    }

    @Override
    public void highPrice() {
        System.out.println("Implementing highPrice method here for 4th Interface class");
        System.out.println();
    }

    @Override
    public void black() {
        System.out.println("Implementing black method here for 5th Interface class");
    }

    @Override
    public void roseGold() {
        System.out.println("Implementing roseGold method here for 5th Interface class");
    }

    @Override
    public void silver() {
        System.out.println("Implementing silver method here for 5th Interface class");

    }
}
