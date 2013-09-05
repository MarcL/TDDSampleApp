package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.contains("programming")) {
            return "Computer programming is the comprehensive process that leads from an original " 
                   + "formulation of a computing problem to executable programs.";
        } else if (query.contains("cakes")) {
            return "Battenberg cake is a light sponge cake. The cake is covered in marzipan and, " +
                    "when cut in cross section, displays a distinctive two-by-two check pattern " +
                    "alternately coloured pink and yellow.";
        }
        return "";
    }
}
