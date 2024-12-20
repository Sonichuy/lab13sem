package laboratornayaworks;

import java.util.Comparator;

public class IceCreamComparator implements Comparator<IceCream> {
    @Override
    public int compare(IceCream o1, IceCream o2) {
        return o1.CalculateCalories() - o2.CalculateCalories();
    }
}