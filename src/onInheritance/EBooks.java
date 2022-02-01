package onInheritance;

public class EBooks extends Books{
    /**
     * Rasmdagi struktura bo’yicha klasslarni yarating. Bunda:
     * Book fieldlari:  — Avtori, narxi, chegirmasi, sarlovhasi va sahifalar soni
     * Book methodlari — sotuv narxini hisoblash, bojxona to’lovini hisoblash(sotuv narxini 30 %)
     * EBook fieldlari — yuklab olinadigan sayt va hajmi (MB)
     * EBook methodlari —sarlovhani chop etish
     * PayperBook fieldlari – vazni, yetkazib berish vaqti(kun)
     */

    private String downloadWebPage;
    private double downloadSize;

    //additional method
    public void printTitle(){
        System.out.println(getTitle());
    }

    //constructors
    public EBooks() {
    }

    public EBooks(String downloadWebPage, double downloadSize) {
        this.downloadWebPage = downloadWebPage;
        this.downloadSize = downloadSize;
    }

    public EBooks(String title, String author, int price, String downloadWebPage){
        super(author, price, title);
        this.downloadWebPage = downloadWebPage;
    }

    public EBooks(String author, int price, int discount,
                  String title, int totalPage, String downloadWebPage, double downloadSize) {
        super(author, price, discount, title, totalPage);
        this.downloadWebPage = downloadWebPage;
        this.downloadSize = downloadSize;
    }

    //getter and setters
    public String getDownloadWebPage() {
        return downloadWebPage;
    }

    public void setDownloadWebPage(String downloadWebPage) {
        this.downloadWebPage = downloadWebPage;
    }

    public double getDownloadSize() {
        return downloadSize;
    }

    public void setDownloadSize(double downloadSize) {
        if(downloadSize>0){
            this.downloadSize = downloadSize;
        }else{
            System.out.println("File Hajmi Manfiy Bo'la Olmaydi.");;
        }
    }
}
