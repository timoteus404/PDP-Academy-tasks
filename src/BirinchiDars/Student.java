package BirinchiDars;

public class Student {
    /**
     * Quyidagi atributlari bor bo’lgan Student nomli klass yarating:
     * familiya,  ismi,  guruh nomeri, o’qiydigan fanlari (5 ta fandan iborat massiv).
     * O’qidigan fanlari ro’yxatini ekranga chiqazuvchi printSubjects nomli method yarating
     */
    String lastname;
    String name;
    int groupNumber;
    String[] subjects = new String[5];

    public Student() {
    }

    public Student(String lastname, String name, int groupNumber, String[] subjects) {
        this.lastname = lastname;
        this.name = name;
        this.groupNumber = groupNumber;
        this.subjects = subjects;
    }

    public void printSubjects(){
        int count = 1;
        System.out.println(this.name + "ning O'qiydigon Fanlari>");
        for(String subjects:subjects){
            System.out.println(count + ": " + subjects);
            count++;
        }
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
