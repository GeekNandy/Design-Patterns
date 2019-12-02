public class SingleTon {
    private int id;
    private String name;
    private SingleTon() {
        id = 10;
        name = "Steve";
    }
    private static SingleTon instance = new SingleTon();
    public static SingleTon getInstance() {
        return instance;
    }

    public void printObject() {
        System.out.println(this.id +" <> "+this.name);
    }

}