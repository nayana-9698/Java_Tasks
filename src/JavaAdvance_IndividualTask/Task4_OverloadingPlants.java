package JavaAdvance_IndividualTask;

public class Task4_OverloadingPlants {


    public void plantPrice(int plant1,int plant2){
    int result = plant1+plant2;
        System.out.println("Total price of the two plants is : " + result);
    }

    public void plantPrice(int plant1,int plant2, int plant3){ //overloading plantPrice method by adding one more plant variable
    int result = plant1+plant2+plant3;
        System.out.println("Total price of the plants after adding 3rd plant is : " +result);
    }

    public void plantPrice(String plant1,String plant2, String plant3){//overloading plantPrice method by adding String variable type
    String result = plant1+plant2+plant3;
        System.out.println("Plants names are: " + result);
    }

    public static void main(String[] args) {
        Task4_OverloadingPlants plants = new Task4_OverloadingPlants();
        plants.plantPrice(100,200);
        plants.plantPrice(100,200,300);
        plants.plantPrice("Money plant - "," Lucky Jade - "," Bonsai ");

    }

}
