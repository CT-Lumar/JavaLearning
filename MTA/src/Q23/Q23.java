package Q23;

public class Q23 {
    public static void main(String[] args) {
        System.out.println(isNullOrEmpty(""));
    }

    public static boolean isNullOrEmpty(String text) {
        // if (text.trim().isEmpty()) {
        //     return true;
        // } else {
        //     return false;
        // }

        // if (text == null) {
        //     return true;
        // } else {
        //     return false;
        // }

        if (text == "") {
            return true;
        } else {
            return false;
        }


    }
}
