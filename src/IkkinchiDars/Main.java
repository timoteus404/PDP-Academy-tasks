package IkkinchiDars;

public class Main {

    /**
     * write methodini  ruchka kotta harfni yozganda kichik
     * harfga qaraganda 2 marta ko'p siyoh sarflaydigan, probel (bo'sh joy)
     * ni yozganda siyoh sarflanmaydigan va siyoh tugagan payt yozishdan
     * to'xtaydigan qilib o'zgartirish
     */

    public static void main(String[] args) {

        System.out.println("======= pen1 objecti=========");
        Pen pen1 = new Pen(100, "blue", 10);
        pen1.clickButton();
        System.out.println(pen1.getInk());
        pen1.write("Ho l      fdasfasdfadsfads");
        System.out.println();
        System.out.println(pen1.getInk());

        System.out.println("======= Ruchka objecti=========");

        Pen ruchka = new Pen(100,"Ko'k",10);
        ruchka.clickButton();
        System.out.println(ruchka.getInk());
        ruchka.write("Hello OOP!");
        System.out.println();
        System.out.println(ruchka.getInk());
        ruchka.write("Hi");

        System.out.println("======= pen objecti=========");
        Pen pen=new Pen();
        pen.setInk(-100);//pen.inq=-100;
        pen.setInkConsumption(10); //pen.inqConsumption=-10

        System.out.println(pen.getInk());
        pen.clickButton();
        pen.write("Hi");
        System.out.println(pen.getInk());
//        Encopsulation 2: 1) private, 2) getter va setter

    }
}
