public class TraditionalSwitchChallenge {

    public static void main(String[] args) {
        char nato = 'B';
        System.out.println(NATOalphabet(nato));
        printDayOfWeek(4);
        printWeekDay(4);
    }

    public static String NATOalphabet(char nato){
        return switch (nato){
            case 'A' -> "A is Able";
            case 'B' -> "B is Baker";
            case 'C' -> "C is Charlie";
            case 'D' -> "D is Dog";
            case 'E' -> "E is Easy";
            default -> ("Message not found");
        };
    }

    public static void printDayOfWeek(int day){
        String dayOfTheWeek = switch(day){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };
        System.out.println(day + " stands for " + dayOfTheWeek);
    }

    public static void printWeekDay(int day){
        if(day == 0){
            System.out.println(day + " stands for Sunday");
        }else if(day == 1){
            System.out.println(day + " stands for Monday");
        }else if(day == 2){
            System.out.println(day + " stands for Tuesday");
        }else if(day == 3){
            System.out.println(day + " stands for Wednesday");
        }else if(day == 4){
            System.out.println(day + " stands for Thursday");
        }else if(day == 5){
            System.out.println(day + " stands for Friday");
        }else if(day == 6){
            System.out.println(day + " stands for Saturday");
        }else{
            System.out.println("Invalid Day");
        }
    }

}
