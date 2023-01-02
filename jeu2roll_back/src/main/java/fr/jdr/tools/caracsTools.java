package fr.jdr.tools;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class caracsTools {

	public int modificateurCarac (int montant) {
		
		if (montant <= 3) {
			return -4;
		} else if (montant <= 5) {
			return -3;
		} else if (montant <= 7) {
			return -2;
		} else if (montant <= 9) {
			return -1;
		} else if (montant <= 11) {
			return 0;
		} else if (montant <= 13) {
			return 1;
		} else if (montant <= 15) {
			return 2;
		} else if (montant <= 17) {
			return 3;
		} else if (montant <= 19) {
			return 4;
		} else {
			return 5;
		}
	}
	
public int rollLife (int dice, int number, int constit) {
	int result = 0;
	for (int i = 1; i <= number; i ++) {
		result += (int) Math.floor(Math.random()*dice) + 1;
	}
	result += modificateurCarac(constit);
	return result;
}
	
public List<Integer> getListCarac () {
		
		List<Integer> des = new ArrayList<>();
		int result = 0;
		int percep = 0;
		int D6;
		List<Integer> list = new ArrayList<>();
		
		// Force
		for (int i = 1; i <= 4; i++) {
			D6 = (int) Math.floor(Math.random()*6) + 1;
			des.add(D6);
		}
			Collections.sort(des);
			for (int i2 = 1; i2 <= 3; i2++) {
				result += des.get(i2);
			}
		list.add(result);
		result = 0;
		des.clear();
		
		// Dexterite
		for (int i = 1; i <= 4; i++) {
			D6 = (int) Math.floor(Math.random()*6) + 1;
			des.add(D6);
		}
			Collections.sort(des);
			for (int i2 = 1; i2 <= 3; i2++) {
				result += des.get(i2);
			}
			list.add(result);
		result = 0;
		des.clear();
		
		// Constitution
		for (int i = 1; i <= 4; i++) {
			D6 = (int) Math.floor(Math.random()*6) + 1;
			des.add(D6);
		}
			Collections.sort(des);
			for (int i2 = 1; i2 <= 3; i2++) {
				result += des.get(i2);
			}
			list.add(result);
		result = 0;
		des.clear();
		
		// Intelligence
		for (int i = 1; i <= 4; i++) {
			D6 = (int) Math.floor(Math.random()*6) + 1;
			des.add(D6);
		}
			Collections.sort(des);
			for (int i2 = 1; i2 <= 3; i2++) {
				result += des.get(i2);
			}
			list.add(result);
		result = 0;
		des.clear();
		
		// Sagesse + percep
		caracsTools tools = new caracsTools();
		for (int i = 1; i <= 4; i++) {
			D6 = (int) Math.floor(Math.random()*6) + 1;
			des.add(D6);
		}
			Collections.sort(des);
			for (int i2 = 1; i2 <= 3; i2++) {
				result += des.get(i2);
			}
			list.add(result);
		list.add(10 + tools.modificateurCarac(result));
		result = 0;
		des.clear();
		
		// Charisme
		for (int i = 1; i <= 4; i++) {
			D6 = (int) Math.floor(Math.random()*6) + 1;
			des.add(D6);
		}
			Collections.sort(des);
		for (int i2 = 1; i2 <= 3; i2++) {
				result += des.get(i2);
			}
		list.add(result);
		return list;
	}
}

