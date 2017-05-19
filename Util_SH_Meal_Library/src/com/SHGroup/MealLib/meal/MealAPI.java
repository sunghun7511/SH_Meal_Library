package com.SHGroup.MealLib.meal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MealAPI {
	public static HashMap<Integer, Meal> getMeal(String schoolcode,
			SimpleDate date) {
		try {
			URL url = new URL(
					"http://stu.dje.go.kr/sts_sci_md00_001.do?schulCode="
							+ schoolcode
							+ "&schulCrseScCode=4&schulKndScCode=04&schYm="
							+ String.format("%04d", date.year)
							+ String.format("%02d", date.month));
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			String all = "";
			BufferedReader br = new BufferedReader(new InputStreamReader(
					con.getInputStream(), "utf-8"));
			String n;
			while ((n = br.readLine()) != null) {
				all += (all.equals("") ? "" : "\n") + n;
			}
			br.close();

			Pattern p = Pattern
					.compile("\\d{1,}<br />(\\[조식\\]|\\[중식\\]|\\[석식\\]).*?(?=</div>)");
			Matcher m = p.matcher(all);

			HashMap<Integer, Meal> ms = new HashMap<>();

			while (m.find()) {
				String group = m.group();
				String[] n2 = group.split("<br( ){0,}/{0,}>");
				int day = Integer.parseInt(n2[0]);

				List<String> b = new ArrayList<>();
				List<String> l = new ArrayList<>();
				List<String> d = new ArrayList<>();

				char c = 'n';

				for (int i = 1; i < n2.length; i++) {
					if (n2[i].contains("[조식]")) {
						c = 'b';
					} else if (n2[i].contains("[중식]")) {
						c = 'l';
					} else if (n2[i].contains("[석식]")) {
						c = 'd';
					} else {
						if (c == 'b') {
							b.add(n2[i]);
						} else if (c == 'l') {
							l.add(n2[i]);
						} else if (c == 'd') {
							d.add(n2[i]);
						}
					}
				}

				ms.put(day, new Meal(b, l, d));
			}
			return ms;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	public static HashMap<Integer, Meal> getDSMMeal(SimpleDate date) {
		return getMeal("G100000170", date);
	}
}
