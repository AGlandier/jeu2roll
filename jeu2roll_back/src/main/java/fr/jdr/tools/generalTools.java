package fr.jdr.tools;

import java.sql.Date;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class generalTools {

	public Date GetTodayDate() {
		long miliseconds = System.currentTimeMillis();
        Date date = new Date(miliseconds);
        return date;
	}
}
