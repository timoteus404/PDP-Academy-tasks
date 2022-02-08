package abstractionAndInterface.taskSeven;

public class Bar extends Foo{

    private int field1;
    private int field2;
    private int field3;

    @Override
    public int getField1() {
        return field1;
    }

    @Override
    public void setField1(int field1) {
        this.field1 = field1;
    }

    @Override
    public int getField2() {
        return field2;
    }

    @Override
    public void setField2(int field2) {
        this.field2 = field2;
    }

    @Override
    public int getField3() {
        return field3;
    }

    @Override
    public void setField3(int field3) {
        this.field3 = field3;
    }
}
