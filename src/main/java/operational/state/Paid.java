package operational.state;

public class Paid implements ParkingTicketVendingMachineState {

    private final ParkingTicketVendingMachine parkingTicketVendingMachine;

    public Paid(ParkingTicketVendingMachine parkingTicketVendingMachine) {
        this.parkingTicketVendingMachine = parkingTicketVendingMachine;
    }

    @Override
    public void collectCash() {
        throw new UnsupportedOperationException("already paid");
    }

    @Override
    public void buyTicket() {
        System.out.println("printing ticket");
        this.parkingTicketVendingMachine.setState(new Ready(parkingTicketVendingMachine));
    }

    @Override
    public void cancelTransaction() {
        this.parkingTicketVendingMachine.returnCash();
        this.parkingTicketVendingMachine.setState(new Ready(parkingTicketVendingMachine));
    }
}
