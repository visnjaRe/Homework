package hm12;

public class discordHomeWork {
    public static void main(String[] args) {
        task1();
        task2();
        
    }


    }









    public static void task2() {
        //Create a String and print it in reverse order (Sunday → yadnuS).

        String day="Sunday";

        for(int i=day.length()-1; i>=0; i--) {
            System.out.print(day.charAt(i));
        }

        System.out.println();
        System.out.println("Drugi nacin");

        // drugi nacin
        for(int i=0; i<day.length(); i++) {
            System.out.print(day.charAt(day.length()-1-i));
        }






    }

    public static void task1() {
        //        Create a String and if the String is not empty perform the following:
//        if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.
//        For Example String str=hello =>l

        // Create a String
//        String str="Sunshine";
        String str= "Stacy";
        // and if the String is not empty
        if(str.length()>0) {
            // if the String has an odd number of chars and has 3 or more chars
            if(str.length()%2!=0 && str.length()>=3) {
                // print the character in the middle of the String
                System.out.println(str.charAt(str.length()/2));
            }
        }
    }
}
