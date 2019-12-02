public class Test {
    public static void main(String... s) {
        SingleTon o1 = SingleTon.getInstance();
        o1.printObject();
        SingleTon o2 = SingleTon.getInstance();
        o2.printObject();

        // cloning the object
        SingleTon o = SingleTon.getInstance();
        // SingleTon clone1 = (SingleTon) o.clone(); // CT error
        // SingleTon clone2 = (SingleTon) (SingleTon.getInstance()).clone(); // CT error
    }
}