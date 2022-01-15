package IkkinchiDars;

/**
 * Quyidagi attributelardan iborat Employee klassini encapsulation prinsipi asosida yarating:
 * identifikasiya raqami, ismi, familiyasi va oyligi.
 */
public class Employee {

    private String name;
    private String lastname;
    private int idNumber;
    private int salary;

    public Employee(String name, String lastname, int idNumber, int salary) {
        this.setName(name);
        this.setLastname(lastname);
        this.setIdNumber(idNumber);
        this.setSalary(salary);
    }

    //Getter and Setters
    //throws NumberFormatException if number is negative
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        if(idNumber>0){
            this.idNumber = idNumber;
        }else{
            throw new NumberFormatException("ID cannot be negative.");
        }
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if(idNumber>0){
            this.salary = salary;
        }else{
            throw new NumberFormatException("Salary cannot be negative.");
        }
    }
}
