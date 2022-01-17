package IkkinchiDars;

public class Book {
    /**
     * Quyidagi attributlardan iborat Book klassini encapsulation prinsipi asosida yarating:
     * nomi, avtorlari (bir nechta bo’lishi mumkin),
     * ISBN(13 ta sondan iborat xalqaro kitob raqami, masalan 012345689112) va narxi.
     * Kitob nomi va avtorlarini chop etuvchi method yarating.
     */

    private String name;
    private String[] authors;
    private long ISBN;
    private double price;

    //noarg constructor
    public Book() {
    }

    //parametrized constructor
    public Book(String name, String[] authors, long ISBN, double price) {
        this.setName(name);
        this.setAuthors(authors);
        this.setISBN(ISBN);
        this.setPrice(price);
    }

    //print book name with author(s)
    public void printBook(){
        System.out.println("Book name: " + getName() + "\nAuthor(s):" + printAuthors(getAuthors()));
    }

    //loops through array and returns list of authors in String type
    //Alternative to Arrays.toString(getAuthors())
    public String printAuthors(String[] a) {
        String b = " ";
        for (int i = 0; i <= a.length-1; i++) {
            if(i!=a.length-1){
                b += a[i] + ",";
            }else{
                b+= a[i]+ ";";
            }
        }
        return b;
    }


    //getter and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        long res = String.valueOf(ISBN).length();
        if(res!=13){
            System.out.println("ISNB notog'ri belirgan.");
        }else{
            this.ISBN = ISBN;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
