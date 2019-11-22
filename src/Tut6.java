public class Tut6 {
    public static void main(String[] args) {

        int myInt = 20;
        if(myInt < 10){
            System.out.println("Yes, It's true!");
        }
        else if (myInt < 20){
            System.out.println("No, It's not true!");
        }
        else {
            System.out.println("None of the above.");
        }

        int loop = 0;
        while (loop < 5) {
            System.out.println("Looping: " + loop);

            if (loop == 5) {
                break;
            }
            loop++;
            System.out.println("Running");
        }
    }
}
