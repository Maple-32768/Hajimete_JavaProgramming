public class Rensyuu15_2 {
    abstract static class AirVehicle {
        private final int max_passengers;
        private int passengers;

        protected AirVehicle(int max_passengers) {
            this.max_passengers = max_passengers;
        }

        protected void getOn() {
            if (passengers < max_passengers) passengers++;
        }

        protected void getOff() {
            if (passengers > 0) passengers--;
        }

        abstract int maxHeight();

        abstract boolean haveEngine();
    }

    static class Plane extends AirVehicle {

        public Plane() {
            super(100);
        }

        @Override
        int maxHeight() {
            return 20000;
        }

        @Override
        boolean haveEngine() {
            return true;
        }
    }

    static class SmallPlane extends AirVehicle {
        public SmallPlane() {
            super(4);
        }

        @Override
        int maxHeight() {
            return 10000;
        }

        @Override
        boolean haveEngine() {
            return true;
        }
    }

    static class Helicopter extends AirVehicle {
        public Helicopter() {
            super(4);
        }

        @Override
        int maxHeight() {
            return 5000;
        }

        @Override
        boolean haveEngine() {
            return true;
        }
    }

    static class Glider extends AirVehicle {
        public Glider() {
            super(1);
        }

        @Override
        int maxHeight() {
            return 300;
        }

        @Override
        boolean haveEngine() {
            return false;
        }
    }

    static class UFO extends AirVehicle {
        public UFO() {
            super(Integer.MAX_VALUE);
        }

        @Override
        int maxHeight() {
            return Integer.MAX_VALUE;
        }

        @Override
        boolean haveEngine() {
            return false;
        }
    }

    public static void main(String[] args) {
        AirVehicle[] vehicles = {
                new Plane(),
                new SmallPlane(),
                new Helicopter(),
                new Glider()
        };
        for (AirVehicle vehicle : vehicles) {
            for (int i = 0; i < vehicle.max_passengers; i++) {
                vehicle.getOn();
            }
            System.out.println(vehicle.maxHeight());
            System.out.println(vehicle.haveEngine());
            vehicle.getOff();
        }
    }
}


