public class MainArgumentsTask {
    public static void useMainArguments(String[] args) {
        System.out.println("Main method arguments:");
        for (String arg : args) {
            System.out.println(arg);
        }
    }

    public static void main(String[] args) {
        useMainArguments(new String[]{"Java", "Programming", "Tasks"});
    }
}