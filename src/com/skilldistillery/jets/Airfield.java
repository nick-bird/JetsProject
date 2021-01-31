package com.skilldistillery.jets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class Airfield {
	Jet newJet;
	private String fileName = "jets.txt";
	ArrayList<Jet> jets = readJets(fileName); 

	
	public ArrayList<Jet> readJets(String fileName) {
		BufferedReader bufIn = null;
		//Jet newJet;
		//ArrayList<Jet> jets = new ArrayList<Jet>();
		try {
			bufIn = new BufferedReader(new FileReader(fileName));
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] s = line.split(",");
				newJet = createJet(s);
				jets.add(newJet);
			}
		} catch (IOException e) {
			System.err.println(e);
		} finally {
			if (bufIn != null) {
				try {
					bufIn.close();
				} catch (IOException e) {
					System.err.println(e);
				}
			}
		}
		return jets;
	}
	
	public Jet createJet(String[] s) {
		//Jet newJet;
	if(s[0].equals("Cargo")) {
		newJet = new CargoPlane();
		newJet.setModel(s[1]);
		newJet.setSpeed(Double.parseDouble(s[2]));
		newJet.setRange(Integer.parseInt(s[3]));
		newJet.setPrice(Long.parseLong(s[4]));
		
	}
	if(s[0].equals("Charter")) {
		newJet = new CharterJet();
		newJet.setModel(s[1]);
		newJet.setSpeed(Double.parseDouble(s[2]));
		newJet.setRange(Integer.parseInt(s[3]));
		newJet.setPrice(Long.parseLong(s[4]));
		
	}
	else {
		newJet = new JetImpl();
		newJet.setModel(s[0]);
		newJet.setSpeed(Double.parseDouble(s[1]));
		newJet.setRange(Integer.parseInt(s[2]));
		newJet.setPrice(Long.parseLong(s[3]));
	}
	return newJet;
	}
	
	public Collection<Jet> removeJet(int i, ArrayList<Jet> jets){
		if (i>0) {
		i--;
		jets.remove(i);}
		
		
		return jets;
		
	}
	
}
