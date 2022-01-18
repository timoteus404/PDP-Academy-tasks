package IkkinchiDars;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class User {
    /**
     * Model package ini ichida quyidagicha atributlari bor bo’lgan
     * User klassini yarating: id,  username(public), email(public), password(private),  name, address.
     * Parolni o’zgartiradigan changePassword methodini yarating.
     * Bunda eski parol kiritiladi agar u to’g’ri bo’lsa yangi parol kiritish mumkin bo’lsin.
     * Main metodi  ham bo'lsin
     */

    private int id;
    public String username;
    public String email;
    private String password;
    private String name;
    private String address;

    //Parol o'zgartirish metodi.
    public void changePassword(String oldPassword, String newPassword){
        if (this.password.equals(oldPassword)) {
            setPassword(newPassword);
        }else{
            System.out.println("Parol Noto'g'ri Berildi.");
        }
    }

    //print qilish metodi. Faqat id, username, email, va password uchun
    public String print(){
        return "ID: " + id + "; Username: " + username + "; Email: " + email +"; Password: " + password + ";";
    }

    //print methodi o'rniga, toString metodigan foydalanib Override qilib print qilsa ham bo'ldi.
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public User() {
    }

    public User(int id, String username, String email, String password) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public User(int id, String username, String email, String password, String name, String address) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
