package laboratornayaworks;

public class Tea extends Food {
    public Tea() {
        super("Чай");
    }

    @Override
    public void consume() {
        System.out.println(this + " выпит.");
    }
}
