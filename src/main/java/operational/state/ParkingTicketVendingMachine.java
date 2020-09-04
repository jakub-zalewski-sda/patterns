package operational.state;

public class ParkingTicketVendingMachine {
    private ParkingTicketVendingMachineState state;

    public ParkingTicketVendingMachineState getState() {
        return state;
    }

    public void setState(ParkingTicketVendingMachineState state) {
        this.state = state;
    }

    void buyTicket() {
        this.state.buyTicket();
    }

    void collectCash() {
        this.state.collectCash();
    }

    public void cancelTransaction() {
        this.state.cancelTransaction();
    }

    void printTicket() {
        System.out.println("printing ticket");
    }

    void addCollectedCash() {
        System.out.println("adding collected cash");
    }

    void returnCash() {
        System.out.println("returning cash");
    }


}
