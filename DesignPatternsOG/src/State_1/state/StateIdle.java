package State_1.state;

import State_1.context.CoffeeMachine;

public class StateIdle implements State {

    private CoffeeMachine machine;

    public StateIdle(CoffeeMachine machine) {
        System.out.println("The machine is started. Put 2.2 CHF to have a coffee.");
        this.machine = machine;
    }

    public void buttonPushed() {
        System.out.println("The machine is idle.");
    }

    public void coinInserted() {
        System.out.println("Coin has been inserted.");
        machine.setState(machine.getInsertingCoinsState());
    }

    public void coinReturn() {
        System.out.println("The machine is idle.");
    }

    public void cupRemoved() {
        System.out.println("The machine is idle.");
    }

    public void problemDetected() {
        System.out.println("The machine is idle.");
    }

    public void resetButton() {
        System.out.println("The machine is idle.");
    }

    public void rightAmountEntered() {
        System.out.println("The machine is idle.");
    }
}
