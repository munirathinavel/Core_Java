package OODP.Behavioral.Command;

// Receiver Interface
interface ElectronicDevice {
	void turnOn();

	void turnOff();

	void volumeUp();

	void volumeDown();

}

// Receiver
class Laptop implements ElectronicDevice {

	int volume = 0;

	// Actions - action-1
	@Override
	public void turnOn() {
		System.out.println("Turning On Laptop..");
	}

	// Actions - action-2
	@Override
	public void turnOff() {
		System.out.println("Turning Off Laptop..");
	}

	// Actions - action-3
	@Override
	public void volumeUp() {
		System.out.println("Volume Up Laptop with volume=" + ++volume);
	}

	// Actions - action-4
	@Override
	public void volumeDown() {
		System.out.println("Volume Down Laptop with volume=" + --volume);
	}
}

// Command
interface Command {
	void execute();
}

// Types of Command
class LaptopTurnOn implements Command {
	ElectronicDevice laptop;

	public LaptopTurnOn(ElectronicDevice laptop) {
		this.laptop = laptop;
	}

	@Override
	public void execute() {
		laptop.turnOn();
	}
}

class LaptopTurnOff implements Command {
	ElectronicDevice laptop;

	public LaptopTurnOff(ElectronicDevice laptop) {
		this.laptop = laptop;
	}

	@Override
	public void execute() {
		laptop.turnOff();
	}
}

class LaptopVolumeUp implements Command {
	ElectronicDevice laptop;

	public LaptopVolumeUp(ElectronicDevice laptop) {
		this.laptop = laptop;
	}

	@Override
	public void execute() {
		laptop.volumeUp();
	}
}

class LaptopVolumeDown implements Command {
	ElectronicDevice laptop;

	public LaptopVolumeDown(ElectronicDevice laptop) {
		this.laptop = laptop;
	}

	@Override
	public void execute() {
		laptop.volumeDown();
	}
}

// Invoker
class RemoteControl {
	Command command;

	public RemoteControl(Command command) {
		this.command = command;
	}

	void pressButton() {
		command.execute();
	}
}

public class CommandDesignPattern {

	public static void main(String[] args) {
		ElectronicDevice electronicDevice = new Laptop();
		Command command = new LaptopVolumeUp(electronicDevice);
		RemoteControl remoteControl = new RemoteControl(command);
		remoteControl.pressButton();

		command = new LaptopTurnOff(electronicDevice);
		remoteControl = new RemoteControl(command);
		remoteControl.pressButton();

		command = new LaptopVolumeUp(electronicDevice);
		remoteControl = new RemoteControl(command);
		remoteControl.pressButton();

		command = new LaptopVolumeDown(electronicDevice);
		remoteControl = new RemoteControl(command);
		remoteControl.pressButton();
	}
}
