public class App {
    public static void main(String[] args) {
        System.out.println("Передані аргументи командного рядка:");
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент " + i + ": " + args[i]);
        }
    }
}
