public class Main {
    public static void main(String[] args) {
        System.out.println("Running my pet examples");
        pet basepet = new pet(); 
        basepet = new dog();
        System.out.println(basepet.getClass().toString());
    }
}
