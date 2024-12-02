package JavaAdvance_IndividualTask;

public class Task2_CreditCardDetails {

    private String cardHolder;
    private long cardNum;
    private int cvv;
    private String cardName;
    private String bank;


    public String getCardHolder(){
        return cardHolder;
    }
    public String setCardHolder(String cardHolder){
        this.cardHolder=cardHolder;
        return cardHolder;
    }

    public long getCardNum(){
        return cardNum;
    }
    public double setCardNum(long cardNum){
        this.cardNum=cardNum;
        return cardNum;
    }

    public int getCardCvv(){
        return cvv;
    }
    public int setCvv(int cvv){
        this.cvv=cvv;
        return cvv;
    }

    public String getCardName(){
        return cardName;
    }
    public String setCardName(String cardName){
        this.cardName=cardName;
        return cardName;
    }

    public String getBank(){
        return bank;
    }
    public String setBankName(String bank){
        this.bank=bank;
        return bank;
    }

    public static void main(String[] args) {
        Task2_CreditCardDetails card = new Task2_CreditCardDetails();
        card.setBankName("ICICI");
        card.setCardNum(1234567812345678l);
        card.setCardName("Platinum");
        card.setCvv(567);
        card.setCardHolder("Nayana");

        System.out.println("Credit card holder is: " + card.cardHolder);
        System.out.println("Bank name is: " + card.bank);
        System.out.println("Card name is: " + card.cardName);
        System.out.println("Card number is: " + card.cardNum);
        System.out.println("Card's cvv is: " + card.cvv);
    }
}
