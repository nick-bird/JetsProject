package com.skilldistillery.jets;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class JetsApplication {
	Collection<Jet> jets;
 Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		Airfield1 af = new Airfield1();
		ArrayList<Jet> jets = af.readJets();
		
		
		boolean keepMenu = true;
		JetsApplication ja = new JetsApplication();
		System.out.println(jets);
		while(keepMenu) {
			ja.printMenu();
			int menuSelection = ja.scanner.nextInt();
			switch(menuSelection) {
			case 1:
				ja.listFleet(jets);
				break;
			case 2:
				ja.flyAllJets(jets);
				break;
			case 3:
				ja.viewFastestJet(jets);
				break;
			case 4:
				ja.viewJetWithLongestRange(jets);
				break;
			case 5:
				ja.loadAllCargo(jets);
				break;
			case 6:
				ja.upgradeAllCharters(jets);
				break;
			case 7:
				jets = ja.addCustomJet(jets);
				break;
			case 8:
				jets = ja.removeJet(jets);
				break;
			case 9:
				keepMenu = false;
				break;
			default:
				System.out.println("Invalid entry");
			}
		}
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
		System.out.println("The fastest aircraft is:\n" + fastestJet);
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
		System.out.println("The longest range aircraft is:\n" + longestRangeJet);
	}

	public void upgradeAllCharters(Collection<Jet> jets) {
		ArrayList<Charters> charters = new ArrayList<Charters>();
		for (Jet jet : jets) {
			if (jet.getType().equals("Charter")) {
				charters.add((Charters) jet);
			}

		}
		for (Charters charter : charters) {
			charter.upgradeTrim();
		}
	}
	public ArrayList<Jet> addCustomJet(ArrayList<Jet> jets){
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
	public ArrayList<Jet> removeJet(ArrayList<Jet> jets){
		int count = 0;
		System.out.println("Please type the number of the plane you would like to remove: ");
	
		for (Jet jet : jets) {
			count++;
			System.out.println(count + ". " +  jet);
		}
		int menuSelection = scanner.nextInt();
		jets.remove(menuSelection-1);
		return jets;
	}
	public void printMenu() {
		System.out.println("\nPlease select a number from the following choices:"
				+ "\n1. List fleet\n2. Fly all jets\n3. View fastest jet"
				+ "\n4. View jet with longest range\n5. Load all Cargo Planes"
				+ "\n6. Upgrade all Charter Jets\n7. Add an aircraft to fleet"
				+ "\n8. Remove a jet from Fleet\n9. Quit "
				);
	}
}
