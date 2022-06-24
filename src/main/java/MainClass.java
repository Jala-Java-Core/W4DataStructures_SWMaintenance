import menu.example.MainMenu;

import java.io.IOException;
import java.util.List;

public class MainClass {

    public static int[] arrayMax(int[] array1, int[] array2) {
        //Code w4-2
        int sum1 = 0;
        for (int i = 0; i < array1.length; i++) {
            sum1 += array1[i];
        }
        // Duplicate code
        int sum2 = 0;
        for (int i = 0; i < array2.length; i++) {
            sum2 += array2[i];
        }
        if (sum1 > sum2) {
            return array1;
        } else {
            return array2;
        }
    }

    private static int calculateArraySum(int[] arr) {
        //Code W4-3
        int arraySum = 0;
        for (int i = 0; i < arr.length; i++) {
            arraySum += arr[i];
        }
        return arraySum;
    }

    //Code W4-9
    public boolean imSlow(String text) {
        // replace this with an if text.length() is 0
        try {
            if (text.charAt(0) == '\n') {
                return true;
            }
        } catch (NullPointerException e) {
            return false;
        } catch (StringIndexOutOfBoundsException e) {
            return false;
        }
        if (text.equals("") || text.length() == 0) {
            return false;
        } else if (text.charAt(0) >= '0' && text.charAt(0) <= '9') {
            return true;
        }
        return false;
    }

    public boolean imSlow2(String text) {
        // Dont check conditions unnecessarily
        if (text.length() == 0) {
            return false;
        }
        if (text.equals("") || text.length() == 0) {
            return false;
        } else if (text.charAt(0) >= '0' && text.charAt(0) <= '9') {
            return true;
        }
        return false;
    }

    public boolean imSlow3(String text) {
        if (text == null) {
            return false;
        }

        if (text.length() == 0) {
            return false;
        }

        char firstChar = text.charAt(0);
        if (text.equals("") || text.length() == 0) {
            return false;
        } else if (text.charAt(0) >= '0' && text.charAt(0) <= '9') {
            return true;
        }
        return false;
    }

    public boolean imSlow4(String text) {
        if (text == null) {
            return false;
        }

        if (text.length() == 0) {
            return false;
        }

        char firstChar = text.charAt(0);

        if  (firstChar == '\n') {
            return true;
        }
        // reuse result of expressions
        if (firstChar >= '0' && firstChar <= '9') {
            return true;
        }
        return false;
    }

    public boolean imSlow5(String text) {
        if (text == null) {
            return false;
        }

        if (text.length() == 0) {
            return false;
        }

        char firstChar = text.charAt(0);

        if  (firstChar == '\n') {
            return true;
        }
        // Use Java API for common expressions
        return firstChar >= '0' && firstChar <= '9';
    }

    public boolean imSlow6(String text) {
        if (text == null) {
            return false;
        }

        if (text.length() == 0) {
            return false;
        }

        char firstChar = text.charAt(0);

        if  (firstChar == '\n') {
            return true;
        }

        return Character.isDigit(firstChar);
    }

    public static int[] arrayMax2(int[] array1, int[] array2) {
        //Code w4-3
        int sum1 = calculateArraySum(array1);
        // Duplicate code
        int sum2 = calculateArraySum(array2);
        if (sum1 > sum2) {
            return array1;
        } else {
            return array2;
        }
    }

    //Code W4-8
    //Test with list1: 2500 distinct elements
    //list2: 170000 distinct elements
    // ArrayList: 5sec
    // LinkedList: over 18min
    public static int elementsInCommon(List list1, List list2) {
        int count = 0;
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list1.size(); j++) {
                //critical point access O(n) vs O(1)
                if (list1.get(i).equals(list2.get(j))) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean slow() {
        return true;
    }

    public static boolean fast() {
        return true;
    }

    public static boolean unlikely() {
        return true;
    }

    public static boolean likely() {
        return true;
    }

    //Code W4-11
    public static int myMethod(int x) {
        boolean slow = slow();
        boolean fast = fast();//unnecessary waste of resources

        if (slow || fast) { //Evaluated both
            x++;
        }
        if (unlikely() || likely()) { //Evaluate both if first is false
            x++;
        }
        return x;
    }

    public static int myMethod2(int x) {
        if (slow() || fast()) { //Evaluate both if first is false
            x++;
        }
        if (unlikely() || likely()) { //Evaluate both if first is false
            x++;
        }
        return x;
    }

    public static void main(String[] args) throws IOException {

        MainMenu menu =  new MainMenu();
        menu.showMainMenu();

        //int dda_D4eds31f=0;
        int[] dda_D4eds31f = {};
        for(int da_D4es31=0;da_D4es31<dda_D4eds31f.length;da_D4es31++)
        if(dda_D4eds31f[da_D4es31]<0)da_D4es31 = da_D4es31 + 1;

        int ant = 0;
        int[] cow = {};
        for (int bat = 0; bat < cow.length; bat += 1){
            if (cow[bat] < 0) {
                ant = ant + 1;
            }
        }

        ant = 0;
        for (int bat = 0; bat < cow.length; bat += 1)
        if (cow[bat] < 0) ant = ant + 1;

        int count = 0;
        int[] values = {};
        for (int i = 0; i < values.length; i += 1)
        if (values[i] < 0) count = count + 1;

        count = 0;
        for (int i = 0; i < values.length; i++)
            if (values[i] < 0)
                count++;

        // Sets counts to the number of negative elements in values array
        count = 0;
        for (int i = 0; i < values.length; i += 1) {
            if (values[i] < 0) {
                count = count + 1;
            }
        }

        int s = 0;
        int b = 10;
        int c = 0;
        int a = 1;
        int d = 5;
        int f = 5;
        int e = 5;
        while (s > b) {
            if (c % a == b + (d--)) {
                b = e + c;
                a *= -1;
            } else {
                while ((c == e) || (a > f)) {
                    b = f % a;
                    a++;
                    c = a* b;
                }
            }
        }

        long start = System.currentTimeMillis();
        myMetod();
        long end = System.currentTimeMillis();
        long myMethodExecutionTime = end -start;

    }

    private static void myMetod() {
    }
}
