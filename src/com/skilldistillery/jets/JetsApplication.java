package com.skilldistillery.jets;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class JetsApplication {
	Collection<Jet> jets;
Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {

		
		
	}

	public void loadAllCargo(Collection<Jet> jets) {
		ArrayList<CargoCarrier> cargoCarriers = new ArrayList<CargoCarrier>();
		for (Jet jet : jets) {
			if (jet.getType().equals("Cargo")) {
				cargoCarriers.add((CargoCarrier) jet);
			}
		}
		for (CargoCarrier cc : cargoCarriers) {
			cc.loadCargo();
		}
	}

	public void listFleet(Collection<Jet> jets) {
		for (Jet jet : jets) {
			System.out.println(jet);
		}
	}

	public void flyAllJets(Collection<Jet> jets) {
		for (Jet jet : jets) {
			jet.fly();
		}
	}

	public void viewFastestJet(ArrayList<Jet> jets) {
		int indexCount = 0;
		double fastestSpeed = 0;
		for (Jet jet : jets) {
			if (jet.getSpeed() > fastestSpeed) {
				fastestSpeed = jet.getSpeed();
				indexCount++;
			}
		}
		Jet fastestJet = jets.get(indexCount);
		System.out.println("The fastest aircraft is: " + fastestJet);
	}

	public void viewJetWithLongestRange(ArrayList<Jet> jets) {
		int indexCount = 0;
		double longestRange = 0;
		for (Jet jet : jets) {
			if (jet.getRange() > longestRange) {
				longestRange = jet.getRange();
				indexCount++;
			}
		}
		Jet longestRangeJet = jets.get(indexCount);
		System.out.println("The fastest aircraft is: " + longestRangeJet);
	}

	public void upgradeAllCharters(Collection<Jet> jets) {
		ArrayList<Charters> charters = new ArrayList<Charters>();
		for (Jet jet : jets) {
			if (jet.getType().equals("Cargo")) {
				charters.add((Charters) jet);
			}

		}
		for (Charters charter : charters) {
			charter.upgradeTrim();
		}
	}
	public Collection<Jet> addCustomJet(ArrayList<Jet> jets){
		System.out.println("Please enter number of which type of aircraft to add: \n1. Cargo\n2. Charter\n3. Standard ");
		int menuSelection = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the Model: ");
		String model = scanner.nextLine();
		System.out.println("Enter the Speed: ");
		Double speed = scanner.nextDouble();
		System.out.println("Enter the Range: ");
		int range = scanner.nextInt();
		System.out.println("Enter the Price: ");
		long price = scanner.nextLong();
		
		Jet newJet = null; 
		switch(menuSelection) {
		case 1:
			newJet = new CargoPlane(model,speed,range,price);
			break;
		case 2:
			newJet = new CharterJet(model,speed,range,price);
			break;
		case 3:
			newJet = new JetImpl(model,speed,range,price);
			break;
		default:
			System.out.println("Invalid selection");
		break;
		}
		jets.add(newJet);
		
		return jets;
	}
	public Collection<Jet> removeJet(ArrayList<Jet> jets){
		int count = 0;
		System.out.println("Please type the number of the plane you would like to remove: ");
	
		for (Jet jet : jets) {
			count++;
			System.out.println(count + ". " +  jet);
		}
		int menuSelection = scanner.nextInt();
		jets.remove(menuSelection-1);
		return null;
	}
}
