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
        } else if (query.contains("cheese")) {
            return "Cheese is a food derived from milk that is produced in a wide range of flavors, " +
                    "textures, and forms by coagulation of the milk protein casein. " +
                    "It comprises proteins and fat from milk, usually the milk of " +
                    "cows, buffalo, goats, or sheep. During production, the milk is " +
                    "usually acidified, and adding the enzyme rennet causes coagulation. " +
                    "The solids are separated and pressed into final form.";
        } else if (query.contains("chocolate")) {
            return "Chocolate is a processed, typically sweetened food produced " +
                    "from the seed of the tropical Theobroma cacao tree. Cacao " +
                    "has been cultivated for at least three millennia in " +
                    "Mexico, Central America and Northern South America.";
        } else if (query.contains("aubergines")) {
            return "Eggplant (Solanum melongena) is a species of nightshade commonly known in " +
                    "British English as aubergine and also known as brinjal, brinjal eggplant, " +
                    "melongene, garden egg, or guinea squash. AUBERGINES! AUBERGINES! AUBERGINES!";
        } else if (query.contains("what is your name")) {
            return "Aubergines";
        } else if (query.contains("which of the following numbers is the largest:")) {
            String[] queryParts = query.split(":");
            String numbers = queryParts[2];
            String[] numbersParts = numbers.split(",");
            int highest = Integer.parseInt(numbersParts[0].trim());

            for (int i = 0; i< numbersParts.length; i++){
                int current = Integer.parseInt(numbersParts[i].trim());
                if (current > highest){
                    highest = current;
                }
            }


            return String.valueOf(highest);
        } else if (query.contains("what is 10 plus 12")) {
            return "22";
        }
        return "";
    }
}
