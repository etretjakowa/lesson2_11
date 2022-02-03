package course2.lesson2_11.servise;

import java.util.Collection;
import java.util.Set;

public interface ShoppingCartService {
    void putItems(Collection<Integer> itemsIds);

    Set<Integer> getItemsIds();
}
