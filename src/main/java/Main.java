public class Main {
    public static void main(String[] args){
        System.out.println("Hi World");

        SomeFunctions functions = new SomeFunctions();
        String text = functions.getWelcomeText("valera");
        System.out.println(text);
    }

}
