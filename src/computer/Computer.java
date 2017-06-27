package computer;

import graphics.GraphicsCard;
import processor.Processor;
import ram.Ram;

public class Computer {

	private String type;
	private double price;
	private GraphicsCard graphicsCard;
	private Processor processor;
	private Ram ram;
	private ComputerFactory computerFactory;
	
	public Computer(String type, ComputerFactory computerFactory) {
		this.type = type;
		this.computerFactory = computerFactory;
		graphicsCard = computerFactory.createGraphicsCard();
		processor = computerFactory.createProcessor();
		ram = computerFactory.createRam();
		price = countPrice();
	}
	
	public double countPrice() {
		return graphicsCard.getPrice() + processor.getPrice() + ram.getPrice();
	}
	
	public String getInformation() {
		return "Typ: " + type + " cena: " + price + " \n" + graphicsCard.getInformation() + " " + processor.getInformation() + " " + ram.getInformation();
	}
}
