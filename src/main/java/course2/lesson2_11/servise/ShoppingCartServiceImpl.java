package course2.lesson2_11.servise;

import course2.lesson2_11.ShoppingCart;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.logging.Logger;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

    private static final Logger log = LoggerFactory.getILogger(ShoppingCartServiceImpl.class);

    private final ShoppingCart shoppingCart;

    public ShoppingCartServiceImpl(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public void putItems(Collection<Integer> itemsIds) {
        log.info("putItems has been colled");
        for (Integer itemsId : itemsIds) {
            shoppingCart.addItem(itemsId);
        }
    }log.info("The following items have been added to the shopping cart:{}",itemsIds);

}
}
