package playground2.other.clean_code;

public class PaymentRepository {

    private OracleConnector oracleConnector;

    public void save(Payment payment) {

        //polaczenie do bazy
        //mapowanie obiektu Payment na strukture bazadoanową

    }

    public OracleConnector getOracleConnector() {
        return oracleConnector;
    }
}
