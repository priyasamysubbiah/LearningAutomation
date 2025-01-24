package JavaPrograms;

public class DayExample {
    public static void main(){
        String[] input = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"} ;
        //output- {"Mon", "Tues", "Wednes", "Thurs", "Fri"}
        String [] output =new String[input.length];
        for (int i = 0; i < input.length; i++) {
            //output[i] = input[i].replace("day","");
            output[i] = input[i].substring(0,3);
        }
        for (String x:output) {
            System.out.print(x+", ");
        }

    }
}
