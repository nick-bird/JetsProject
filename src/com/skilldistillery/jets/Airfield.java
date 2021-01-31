package com.skilldistillery.jets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Airfield {

	public ArrayList<Jet> readJets() {
		String fileName = "jets.txt";
		Jet newJet;

		BufferedReader bufIn = null;
		ArrayList<Jet> jets = new ArrayList<Jet>();
		String[] s;
		try {
			bufIn = new BufferedReader(new FileReader(fileName));
			String line;
			while ((line = bufIn.readLine()) != null) {
				s = line.split(",");
				newJet = createJet(s);

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
		return jets;
	}

	public Jet createJet(String[] s) {
		Jet newJet;
		if (s[0].equals("Cargo")) {
			newJet = new CargoPlane();
			newJet.setModel(s[1]);
			newJet.setSpeed(Double.parseDouble(s[2]));
			newJet.setRange(Integer.parseInt(s[3]));
			newJet.setPrice(Long.parseLong(s[4]));
		} else if (s[0].equals("Charter")) {
			newJet = new CharterJet();
			newJet.setModel(s[1]);
			newJet.setSpeed(Double.parseDouble(s[2]));
			newJet.setRange(Integer.parseInt(s[3]));
			newJet.setPrice(Long.parseLong(s[4]));
		} else {
			newJet = new JetImpl();
			newJet.setModel(s[1]);
			newJet.setSpeed(Double.parseDouble(s[2]));
			newJet.setRange(Integer.parseInt(s[3]));
			newJet.setPrice(Long.parseLong(s[4]));
		}

		return newJet;
	}
}
