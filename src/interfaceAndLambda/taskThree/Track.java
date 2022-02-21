package interfaceAndLambda.taskThree;

public class Track implements CargoAuto{

        static{
            CargoAuto.transportCargo();
        }

        public void transportCargo(){
            System.out.println("transportCargo method from Track class");
        }
}
