package interfaceAndLambda.taskFour;

public class FunctionalImpl implements FunctionalOne, FunctionalTwo, FunctionalThree{

    @Override
    public void print() {
        System.out.println("implemented from FunctionalOne interface");
    }

    FunctionalTwo two = new FunctionalTwo() {
        @Override
        public void print() {
            System.out.println("implemented with anonymous class");
        }
    };

    FunctionalThree three = () -> System.out.println("FunctionalThree implemented with lambda");
    FunctionalFour four = () -> System.out.println("FunctionalFour implemented with lambda");
    FunctionalFive five = () -> System.out.println("FunctionalFive implemented with lambda");


}
