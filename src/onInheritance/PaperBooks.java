package onInheritance;

public class PaperBooks extends Books{
    /**
     * Rasmdagi struktura bo’yicha klasslarni yarating. Bunda:
     * Book fieldlari:  — Avtori, narxi, chegirmasi, sarlovhasi va sahifalar soni
     * Book methodlari — sotuv narxini hisoblash, bojxona to’lovini hisoblash(sotuv narxini 30 %)
     * EBook fieldlari — yuklab olinadigan sayt va hajmi (MB)
     * EBook methodlari —sarlovhani chop etish
     * PayperBook fieldlari – vazni, yetkazib berish vaqti(kun)
     */

    private double weight;
    private int deliveryTime;

    //constructors
    public PaperBooks() {
    }

    public PaperBooks(double weight, int deliveryTime) {
        this.weight = weight;
        this.deliveryTime = deliveryTime;
    }

    public PaperBooks(String author, double price, String title, double weight, int deliveryTime) {
        super(author, price, title);
        this.weight = weight;
        this.deliveryTime = deliveryTime;
    }

    public PaperBooks(String author, int price, int discount, String title, int totalPage, double weight, int deliveryTime) {
        super(author, price, discount, title, totalPage);
        this.weight = weight;
        this.deliveryTime = deliveryTime;
    }

    //getters and setters
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight>0){
            this.weight = weight;
        }else {
            System.out.println("Weight Cannot Be Negative Value.");
        }
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(int deliveryTime) {
        if(deliveryTime>0){
            this.deliveryTime = deliveryTime;
        }else{
            System.out.println("Invalid Delivery Time Value Given.");
        }
    }
}
