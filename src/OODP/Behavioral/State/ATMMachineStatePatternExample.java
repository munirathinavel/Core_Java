package OODP.Behavioral.State;

// State interface
interface ATMState {
	void insertCard();

	void ejectCard();

	void enterPin(int pinEntered);

	void requestCash(int amount);
}

class NoCard implements ATMState {
	ATMMachine atmMachine;

	public NoCard(ATMMachine atmMachine) {
		this.atmMachine = atmMachine;
	}

	@Override
	public void insertCard() {
		System.out.println("Enter Pin:");
		atmMachine.setAtmState(atmMachine.getHasCard());
	}

	@Override
	public void ejectCard() {
		System.out.println("No Card Available!");
	}

	@Override
	public void enterPin(int pinEntered) {
		System.out.println("Please insert Card First..");
	}

	@Override
	public void requestCash(int amount) {
		System.out.println("Please insert Card First..");
	}

}

class HasCard implements ATMState {

	ATMMachine atmMachine;

	public HasCard(ATMMachine atmMachine) {
		this.atmMachine = atmMachine;
	}

	@Override
	public void insertCard() {
		System.out.println("You can't insert more than one card..");
	}

	@Override
	public void ejectCard() {
		System.out.println("Card Ejected!");
		atmMachine.setAtmState(atmMachine.getNoCard());
	}

	@Override
	public void enterPin(int pinEntered) {
		if (pinEntered == 1234) {
			System.out.println("Correct Pin");
			atmMachine.correctPinEntered = true;
			atmMachine.setAtmState(atmMachine.getPinEntered());
		} else {
			System.out.println("Wrong Pin..");
		}
	}

	@Override
	public void requestCash(int amount) {
		System.out.println("Please Enter Pin First...");
	}

}

class PinEntered implements ATMState {

	ATMMachine atmMachine;

	public PinEntered(ATMMachine atmMachine) {
		this.atmMachine = atmMachine;
	}

	@Override
	public void insertCard() {
		System.out.println("You can't insert more than one Card...");
	}

	@Override
	public void ejectCard() {
		System.out.println("Card Ejected!");
	}

	@Override
	public void enterPin(int pinEntered) {
		System.out.println("Pin Already Entered!");
	}

	@Override
	public void requestCash(int amount) {
		if (atmMachine.cashAvailable < amount) {
			System.out.println("Cash Not Available");
			atmMachine.setAtmState(atmMachine.getNoCash());
		} else if (atmMachine.correctPinEntered) {
			System.out.println("Ammounnt Withdrawn=" + amount);
			atmMachine.cashAvailable = atmMachine.cashAvailable - amount;
			atmMachine.setAtmState(atmMachine.getNoCard());
		}
	}

}

class NoCash implements ATMState {

	ATMMachine atmMachine;

	public NoCash(ATMMachine atmMachine) {
		this.atmMachine = atmMachine;
	}

	@Override
	public void insertCard() {
		System.out.println("No Cash in the Machine");
	}

	@Override
	public void ejectCard() {
		System.out.println("No Cash in the Machine. You dont't have any card");
	}

	@Override
	public void enterPin(int pinEntered) {
		System.out.println("No Cash in the Machine");
	}

	@Override
	public void requestCash(int amount) {
		System.out.println("No Cash in the Machine");
	}

}

// Context Implementation

class ATMMachine {
	ATMState noCard;

	ATMState hasCard;

	public ATMState getAtmState() {
		return atmState;
	}

	public void setAtmState(ATMState atmState) {
		this.atmState = atmState;
	}

	ATMState pinEntered;
	ATMState noCash;
	ATMState hasCash;

	ATMState atmState;
	boolean correctPinEntered = false;
	int cashAvailable = 2000;

	public ATMMachine() {
		noCard = new NoCard(this);
		hasCard = new HasCard(this);
		pinEntered = new PinEntered(this);
		noCash = new NoCash(this);

		atmState = noCard;

		if (cashAvailable <= 0) {
			atmState = noCash;
		}
	}

	public void insertCard() {
		atmState.insertCard();
	}

	public void ejectCard() {
		atmState.ejectCard();
	}

	public void enterPin(int pinEntered) {
		atmState.enterPin(1234);
	}

	public void requestCash(int amount) {
		atmState.requestCash(amount);
	}

	public ATMState getNoCard() {
		return noCard;
	}

	public ATMState getHasCard() {
		return hasCard;
	}

	public ATMState getPinEntered() {
		return pinEntered;
	}

	public ATMState getNoCash() {
		return noCash;
	}

	public ATMState getHasCash() {
		return hasCash;
	}
}

public class ATMMachineStatePatternExample {

	public static void main(String[] args) {

		ATMMachine atmMachine = new ATMMachine();

		atmMachine.insertCard();

		atmMachine.enterPin(1234);

		atmMachine.requestCash(1500);

		atmMachine.ejectCard();

		atmMachine.requestCash(1234);

		atmMachine.insertCard();

		atmMachine.enterPin(1234);

		atmMachine.requestCash(1600);

	}

}
