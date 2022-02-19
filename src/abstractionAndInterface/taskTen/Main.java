package abstractionAndInterface.taskTen;

import abstractionAndInterface.taskTen.model.Plane;

public class Main {

    /**
     * Quyida berilgan ma'lumotlar asosida class va interfacelarni yarating:
     *
     * TV, Phone, Fruit => Mahsulot.                -> Product  (price, producer)
     * Tv, phone => Elektronika.                    -> Electronics (model, voltage)
     * Tv,phone, Avto, Plane(samolyot) =>Texnika.   -> TechProducts (turnOn(), TurnOff(), Repair())
     * Tv => Pultda boshqariladi.                   -> RemoteControlled (changeChannel(), changeVolume(), changeSetting())
     * Dasturchi, O’qituvchi, Doctor => Ishchi.     -> Employee (work, salary)
     * Student, Ishchi => Odam.                     -> Human (name, lastName, citizenship)
     * Cat, Dog, Bird   => Animal.                  -> Animal (eat(), sleep(), walk(), talk(), EYES(2))
     * Bird, Plane=> Parvoz qiladi.                 -> FlyingObjects (fly(), land())
     *
     *                                              -> Human/Animal implements Creature
     *                                              -> Students (university, scholarship)
     *
     * Har qanday mahsulotning narxi va ishlab chiqaruvchisi bor.
     * Har qanday elektronika bu mahsulot bo’lib, modeli va nechchi voltda ishlashi bor.
     * Har qanday texnika yoqish, o’chirish va remont qilish mumkin.
     * Pult yordamida kanalni almashtirish, ovozni o’zgartirish va nastroykani o’zgartirish mumkin.
     * Barcha ishchilar ishlashadi va ularga  maosh belgilangan.
     * Har qanday jonzot ovqatlanadi, uxlaydi va sayr qiladi.
     * Odamlarning ismi, familiyasi va fuqaroligi bor.
     * Har qanday hayvonning 2 ta ko’zi bor va ovoz chiqazadi.
     *
     * Odamlar va hayvonlar jonzotdir.
     *
     * Talabalarning o’qiydigan ta’lim muassasasi bor va ular stipendiya olishadi.
     * Parvoz qiladiganlar uchish va qo’nishni amalga oshiradi.
     */

    public static void main(String[] args) {
        Plane p1 = new Plane(20, "Airbus");

//        p1.setPrice(20);

        System.out.println("Plane for " + p1.getPrice() + " million USD ");
        p1.land();
    }
}
