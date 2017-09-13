package OODP.Behavioral.Mediator;

import java.util.ArrayList;
import java.util.List;

// Colleague
interface Participant {
	void sendMessage(String msg);

	void receiveMessage(String msg, String name);

	String getName();
}

// ConcreteColleague
class Human implements Participant {
	String name;
	ChatRoom chatRoom;

	public Human(ChatRoom chatRoom, String name) {
		this.chatRoom = chatRoom;
		this.name = name;
	}

	@Override
	public void sendMessage(String msg) {
		System.out.println(this.name + " Sent Msg:" + msg);
		chatRoom.sendMessage(msg, this);
	}

	@Override
	public void receiveMessage(String msg, String name) {
		System.out.println(this.name + ": from:" + name + " &  Msg:" + msg);
	}

	@Override
	public String getName() {
		return name;
	}
}

// ConcreteColleague
class Bot implements Participant {
	String name;
	ChatRoom chatRoom;

	public Bot(ChatRoom chatRoom, String name) {
		this.chatRoom = chatRoom;
		this.name = name;
	}

	@Override
	public void sendMessage(String msg) {
		System.out.println(this.name + " Sent Msg:" + msg);
		chatRoom.sendMessage(msg, this);
	}

	@Override
	public void receiveMessage(String msg, String name) {
		System.out.println(this.name + ": from:" + name + " &  Msg:" + msg);
	}

	@Override
	public String getName() {
		return name;
	}
}

// Mediator
interface ChatRoom {
	void sendMessage(String msg, Participant participant);

	public void addChatRoomImpl(Participant participant);
}

// Concrete Mediator
class ChatRoomImpl implements ChatRoom {
	private List<Participant> participants;

	public ChatRoomImpl() {
		participants = new ArrayList<>();
	}

	public void addChatRoomImpl(Participant participant) {
		participants.add(participant);
	}

	@Override
	public void sendMessage(String msg, Participant sender) {
		for (Participant p : participants) {
			if (p != sender) {
				p.receiveMessage(msg, sender.getName());
			}
		}
	}
}

public class MediatorDesignPattern {

	public static void main(String[] args) {
		ChatRoom chatRoom = new ChatRoomImpl();
		Participant vel = new Human(chatRoom, "Vel");
		Participant gomathi = new Human(chatRoom, "Gomathi");
		Participant googleBot = new Bot(chatRoom, "GoogleBot");

		chatRoom.addChatRoomImpl(vel);
		chatRoom.addChatRoomImpl(gomathi);
		chatRoom.addChatRoomImpl(googleBot);

		vel.sendMessage("Hello All...");

		googleBot.sendMessage("This is GoogleBot..");

	}
}
