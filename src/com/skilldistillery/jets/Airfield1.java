package com.skilldistillery.jets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Airfield1 {
	 
	
	public ArrayList<Jet> readJets(){ 
	String fileName = "jets.txt";
	Jet newJet;
	ReaderTest rt = new ReaderTest();

		BufferedReader bufIn = null;
		ArrayList<Jet> jets = new ArrayList<Jet>();
		String[] s;
		try {
			bufIn = new BufferedReader(new FileReader(fileName));
			String line;
			while ((line = bufIn.readLine()) != null) {
				s = line.split(",");
				newJet = rt.createJet(s);
				
				jets.add(newJet);
			}
		} catch (Exception e) {
			System.err.println(e);
		} finally {
			if (bufIn != null) {
				try {
					bufIn.close();
				} catch (Exception e) {
					System.err.println(e);
				}
			}
		}
		System.out.println(jets);
		return jets;
	}
	
	
	
	public Jet createJet(String[] s) {
		Jet newJet;
	if(s[0].equals("Cargo")) {
		newJet = new CargoPlane();
		newJet.setModel(s[1]);
		newJet.setSpeed(Double.parseDouble(s[2]));
		newJet.setRange(Integer.parseInt(s[3]));
		newJet.setPrice(Long.parseLong(s[4]));}
	else if(s[0].equals("Charter")) {
		newJet = new CharterJet();
		newJet.setModel(s[1]);
		newJet.setSpeed(Double.parseDouble(s[2]));
		newJet.setRange(Integer.parseInt(s[3]));
		newJet.setPrice(Long.parseLong(s[4]));}
	else {
		newJet = new JetImpl();
		newJet.setModel(s[1]);
		newJet.setSpeed(Double.parseDouble(s[2]));
		newJet.setRange(Integer.parseInt(s[3]));
		newJet.setPrice(Long.parseLong(s[4]));}
	
	return newJet;
	}
//	public ArrayList<Jet> removeJet(int i, ArrayList<Jet> jets){
//		if (i>0) {
//		
//		jets.remove((i-1));}
//		
//		
//		return jets;
//		
//	}
}
