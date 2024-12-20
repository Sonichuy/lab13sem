package laboratornayaworks;

public class Lemonade extends Food {
    public Lemonade() {
        super("Лимонад");
    }

    @Override public void consume() {
        System.out.println(this + " выпит.");
    }
}