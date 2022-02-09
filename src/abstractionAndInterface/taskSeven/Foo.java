package abstractionAndInterface.taskSeven;

public class Foo extends Bar implements Fizz {

    //implementation of Fizz interface
    @Override
    public int method(int type) {
        return 123;
    }

    //from Bar class
    @Override
    public int getField1() {
        return super.getField1();
    }

    @Override
    public int getField2() {
        return super.getField2();
    }

    @Override
    public int getField3() {
        return super.getField3();
    }
}
