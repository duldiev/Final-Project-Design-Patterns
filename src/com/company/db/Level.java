package com.company.db;

import java.io.*;

public class Level {
    public static int getLevel(int level, String troopName, String property) throws IOException {
        File file = new File("/Users/raiymbekduldiev/IdeaProjects/Final-Project-Design-Patterns/src/com/company/db/" + troopName + ".txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null) {
            String[] res = st.split("-");
            if (Integer.parseInt(res[0]) == level) {
                switch (property) {
                    case "Damage per Attack":
                        return Integer.parseInt(res[2]);
                    case "Hit points":
                        return Integer.parseInt(res[3]);
                    case "Training cost":
                        return Integer.parseInt(res[4]);
                }
            }
        }
        return 0;
    }
}
