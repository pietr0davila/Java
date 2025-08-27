package utils;
public class Print {
    public static void printMsg(String msg, boolean breakLine) {
        if (breakLine) {
            System.out.println(msg);
        } else {
            System.out.print(msg);
        }
	}
    public static void printMsg(String msg) {
        printMsg(msg, true);
    }
}