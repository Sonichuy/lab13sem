package laboratornayaworks;

import java.util.Objects;

public abstract class Food implements Consumable {
    private String name;

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Food food = (Food) obj;
        return Objects.equals(name, food.name);
    }

    @Override public String toString() {
        return name;
    }
}