package onInheritance;

public class Main {

    public static void main(String[] args) {
        /**
         * Rasmdagi struktura bo’yicha klasslarni yarating. Bunda:
         * Book fieldlari:  — Avtori, narxi, chegirmasi, sarlovhasi va sahifalar soni
         * Book methodlari — sotuv narxini hisoblash, bojxona to’lovini hisoblash(sotuv narxini 30 %)
         * EBook fieldlari — yuklab olinadigan sayt va hajmi (MB)
         * EBook methodlari —sarlovhani chop etish
         * PayperBook fieldlari – vazni, yetkazib berish vaqti(kun)
         */
        Books book = new Books("John Kerry", 100, 30.0, "On Inheritance", 200);
        System.out.println("Net price: " + book.countNetPrice());
        System.out.println("Taxed Net price: " + book.countTaxedPrice());

        EBooks ebook = new EBooks("Somthing title", "Putin", 13, "somewhere.com");
        ebook.printTitle();

        PaperBooks paperBooks = new PaperBooks("Mr Paper", 15.0, "Mr. Nobody", 54.6, 7);
        System.out.println(paperBooks.getTitle() + " will be delivered in " + paperBooks.getDeliveryTime() + " day(s).");



    }
}
