package operational.state;

public class Ready implements ParkingTicketVendingMachineState {

    private final ParkingTicketVendingMachine parkingTicketVendingMachine;

    public Ready(ParkingTicketVendingMachine parkingTicketVendingMachine) {
        this.parkingTicketVendingMachine = parkingTicketVendingMachine;
    }

    @Override
    public void collectCash() {
        this.parkingTicketVendingMachine.setState(new Paid(parkingTicketVendingMachine));
    }

    @Override
    public void buyTicket() {
        throw new UnsupportedOperationException("not paid state");
    }

    @Override
    public void cancelTransaction() {
        throw new UnsupportedOperationException("no transaction");
    }
}
