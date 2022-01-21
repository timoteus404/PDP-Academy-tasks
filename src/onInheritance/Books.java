package onInheritance;

public class Books {
    /**
     * Rasmdagi struktura bo’yicha klasslarni yarating. Bunda:
     * Book fieldlari:  — Avtori, narxi, chegirmasi, sarlovhasi va sahifalar soni
     * Book methodlari — sotuv narxini hisoblash, bojxona to’lovini hisoblash(sotuv narxini 30 %)
     * EBook fieldlari — yuklab olinadigan sayt va hajmi (MB)
     * EBook methodlari —sarlovhani chop etish
     * PayperBook fieldlari – vazni, yetkazib berish vaqti(kun)
     */

    private String author;
    private double price;
    private double discount;
    private String title;
    private int totalPage;

    //additional methods
    public double countNetPrice(){
        return (countTaxedPrice() - (countTaxedPrice()*getDiscount()));
    }

    //Need to be checked on method call
    public double countTaxedPrice(){
        return getPrice() + (getPrice()*0.3); // calling countNetPrice method to get the price.
    }

    //constructors
    public Books() {
    }

    public Books(String author, int price, double discount, String title, int totalPage) {
        this.setAuthor(author);
        this.setPrice(price);
        this.setDiscount(discount);
        this.setTitle(title);
        this.setTotalPage(totalPage);
    }

    //getters and setters
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price>0){
            this.price = price;
        }else{
            System.out.println("Kitob narxi noto'g'ri berilgan.");
        }
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        if(discount>0){
            this.discount = discount/100;
        }else {
            System.out.println("Chergima noto'g'ri berilgan.");
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        if(totalPage>0){
            this.totalPage = totalPage;
        }else{
            System.out.println("Kitob sahifalari soni manfiy berilgan.");
        }
    }
}
