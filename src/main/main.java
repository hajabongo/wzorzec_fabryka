package main;

import computer.Computer;
import computer.impl.ComputerA;
import graphics.GraphicsCard;
import graphics.impl.GraphicsCardImpl;
import processor.Processor;
import processor.impl.ProcessorImpl;
import ram.Ram;
import ram.impl.RamImpl;

public class main {

	public static void main(String[] args) {
		
//		GraphicsCard geForce = new GraphicsCardImpl("GeForce GTX 1050 OC 2GB GDDR5", 599.99);
//		GraphicsCard radeon = new GraphicsCardImpl("Radeon Rx 550 2G 16xPCI-E DDR5 Hdmi", 439.00);
//		
//		Processor intel = new ProcessorImpl("Intel Core i5-7500 3.4 GHz", 874.99);
//		Processor amd = new ProcessorImpl("AMD A4-6300 FM2", 125.99);
//		
//		Ram kingston = new RamImpl("Kingston DDR4 2x4GB 2133MHz CL13 HyperX Savage XMP 1.2V", 293.76); 
//		Ram crucial = new RamImpl("Crucial Ballistix Sport DDR3 2x4GB 1600MHz CL9", 259.00); 
		
		Computer mobile = new Computer("Mobile", new ComputerA());
		System.out.println(mobile.getInformation());

	}

}
