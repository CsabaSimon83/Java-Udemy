public class Tut20 {
    public static void main(String[] args) {

        // inefficient
        String info = "";
        info += "My name is Bob.";
        info += " ";
        info += "I am a builder";

        System.out.println(info);

        StringBuilder sb = new StringBuilder("");

        // More efficient
        sb.append("My name is Sue.");
        sb.append(" ");
        sb.append("I am a lion tamer.");

        System.out.println(sb.toString());

        StringBuilder s = new StringBuilder();

        s.append("My name is Roger")
                .append(" ")
                .append("I am a skydiver");

        System.out.println(s.toString());

        System.out.print("Here is some text.\nThat was a tab.\nThat was a newline.");
        System.out.println(" More test.");

        //Formating integer
        System.out.printf("Total cost %-10d; quantity is %d\n", 5, 120);

        for(int i=0; i<20; i++) {
            System.out.printf("%2d: some text here\n", i);
        }

        //Formatting floating point value
        System.out.printf("Total value: %.2f\n", 5.6874);
        System.out.printf("Total value: %6.1f\n", 343.687416);


    }
}
