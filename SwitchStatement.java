public class SwitchStatement {
    public static void main(String[] args) {
        int value = 1;
        if (value == 1){
            System.out.println("Value was 1");
        }else if(value == 2){
            System.out.println("Value was 2");
        }else {
            System.out.println("Was not 1 or 2");
        }

        //You don't need to use break statements in Java 9. You can get rid of the break and colon and
        //instead just use the -> token.
        int switchValue = 4;
        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3, 4, or 5");
                System.out.println("Actually it was a " + switchValue );
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4, 5");
                break;
        }

        String month = "XYZ";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
    }
    public static String getQuarter(String month){
        return switch(month){
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            //use of the yield word. return for switch statements.
            //don't need it for return values like this, but it is useful for equations.
            default -> {
                yield month + " is bad";
            }
        };
    }
}
