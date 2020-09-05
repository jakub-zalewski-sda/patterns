package playground.clean_code;

public class BasketRepository {

    private MongoRepository mongoRepository;

    public Basket getBasket(String basketId) {

        BasketEntity basketEntity = mongoRepository.getBasket(basketId);
        //pobiera z bazy mongo
        //mapuje na Bas

        return null;
    }
}
