public class Tut22 {
    public static void main(String[] args) {
        Machine1 mach1 = new Machine1();

        mach1.start();
        mach1.stop();

        Car car1 = new Car();
        car1.start();
        car1.wipeWindShield();
        car1.showInfo();
        car1.stop();

    }
}
