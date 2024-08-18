package com.ozgen;

import java.net.URL;

public class Main {

    private static final URL configURL = Main.class.getResource("/checkstyle.xml");

    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Please provide the directory path to check.");
            return;
        }
        try {
            assert configURL != null;
            String[] checkstyleArgs = new String[]{
                    "-c", configURL.toString(),
                    args[0]
            };
            com.puppycrawl.tools.checkstyle.Main.main(checkstyleArgs);
        } catch (Exception e) {
            System.err.println("Error running Checkstyle: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
