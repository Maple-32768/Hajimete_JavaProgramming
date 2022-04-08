public class Rensyuu15_1 {
    abstract static class GroundVehicle{
        private final int max_passengers;
        private int passengers;

        protected GroundVehicle(int max_passengers) {
            this.max_passengers = max_passengers;
        }

        protected void getOn(){
            if (passengers < max_passengers) passengers++;
        }

        protected void getOff(){
            if (passengers > 0) passengers--;
        }

        abstract int numOfTire();
        abstract boolean haveEngine();
    }

     static class Car extends GroundVehicle{
        public Car() {
            super(5);
        }

         @Override
         int numOfTire() {
             return 4;
         }

         @Override
         boolean haveEngine() {
             return true;
         }
     }

    static class Truck extends GroundVehicle{
        public Truck() {
            super(3);
        }

        @Override
        int numOfTire() {
            return 4;
        }

        @Override
        boolean haveEngine() {
            return true;
        }
    }

    static class MotorBike extends GroundVehicle{
        public MotorBike() {
            super(2);
        }

        @Override
        int numOfTire() {
            return 2;
        }

        @Override
        boolean haveEngine() {
            return true;
        }
    }

    static class Bicycle extends GroundVehicle{
        public Bicycle() {
            super(1);
        }

        @Override
        int numOfTire() {
            return 2;
        }

        @Override
        boolean haveEngine() {
            return false;
        }
    }

    public static void main(String[] args) {
        GroundVehicle[] vehicles = {
                new Car(),
                new Truck(),
                new MotorBike(),
                new Bicycle()
        };
        for (GroundVehicle vehicle : vehicles) {
            for (int i = 0; i < vehicle.max_passengers; i++) {
                vehicle.getOn();
            }
            System.out.println(vehicle.numOfTire());
            System.out.println(vehicle.haveEngine());
            vehicle.getOff();
        }
    }
}


