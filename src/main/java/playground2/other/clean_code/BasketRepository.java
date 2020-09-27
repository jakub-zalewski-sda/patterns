package playground2.other.clean_code;

import java.util.Optional;

public class BasketRepository {
    public Optional<Basket> getBasket(String basketId) {
        return Optional.of(new Basket());
    }

}
