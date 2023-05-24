public class Main {
    public static void main(String[] args) {
        CoffeList list = new CoffeList();
        list.addChild(new Espresso(false, false));
        list.addChild(new StrongRoast(true, false));

        System.out.println(list.getPrice());
    }
}
