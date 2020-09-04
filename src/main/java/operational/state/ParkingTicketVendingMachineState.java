package operational.state;

public interface ParkingTicketVendingMachineState {

    void collectCash();
    void buyTicket();
    void cancelTransaction();
}
