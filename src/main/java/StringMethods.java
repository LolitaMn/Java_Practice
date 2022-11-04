public class StringMethods {

    public String removeSpaces(String sentence) {
        if(sentence.length() > 0) {
            if(sentence.trim().equals(sentence)) {

                return "No Spaces";
            } else {
                sentence.trim();

                return "Extra Spaces were cut off";
            }
        }

        return "Row is empty";
    }

    public String removeAllAs(String sentence) {
        if (sentence.length() > 0) {
            if (sentence.contains("a")) {

                return sentence.trim().replace("a", "");
            } else {

                return sentence.trim();
            }

        }

        return "Row is empty";
    }


    public String removeAllZeros(String sentence) {
        if (sentence.length() > 0) {
            if (sentence.contains("0")) {

                return sentence.replace(" ", "").replace("0", "");
            } else {
                sentence.replace(" ", "");

                return "This is a valid string";
            }
        }

        return "Row is empty";
    }


    public String removeAllSpaces(String sentence) {
        if (sentence.length() > 0) {

            return sentence.replace(" ", "");
        }

        return "Row is empty";

    }


    public String countAs(String sentence) {
        if (sentence.length() > 0) {
            int a = 0;
            int etc = 0;

            for(int i = 0; i < sentence.length(); i++) {
                if(sentence.toLowerCase().charAt(i) == 'a') {
                    a++;
                } else if (sentence.toLowerCase().charAt(i) != 'a') {
                    etc++;
                }
            }

            String result = a + ", " + etc;

            return result;
        }

        return "Row is empty";
    }


    public String countJava(String sentence) {
        if (sentence.length() > 0) {
            if(sentence.contains("Java")) {

                return "true";
            } else {

                return "false";
            }
        }

        return "Row is empty";
    }


    public String insertQuotes(String sentence1, String sentence2) {
        if (sentence1.length() > 0 && sentence2.length() > 0) {

            return "\"".concat(sentence1.concat(": \"").concat(sentence2).concat("\""));
        }

        return "Row is empty";
    }

    public String insertQuotesInQuotes(String sentence1, String sentence2) {
        if (sentence1.length() > 0 && sentence2.length() > 0) {

            return "\"".concat(sentence1.concat(": \"").concat(sentence2).concat("\"").replace("«", "\"")
                    .replace("»", "\""));
        }

        return "Row is empty";
    }

    public String checkCityTitle(String sentence) {
        if (sentence.length() > 0) {
            char sentence1 = sentence.toUpperCase().charAt(0);
            String sentence2 = sentence.toLowerCase().substring(1);

            return sentence1 + sentence2;
        }

        return "Row is empty";
    }


    public String indexOf(String sentence, String index) {
        if (sentence.length() > 0) {


            return sentence.substring(sentence.indexOf(index), sentence.lastIndexOf(index) + 1);
        }

        return "Row is empty";
    }


    public String checkFirstAndLastLetter(String sentence) {
        if (sentence.length() > 0) {
            int lengthWord = sentence.length();
            char first = sentence.toLowerCase().charAt(0);
            char last = sentence.toLowerCase().charAt(lengthWord - 1);
            if(first == last) {

                return "true";
            } else {

                return "false";
            }
        }

        return "Row is empty";
    }

    public String takeSecondWord(String sentence) {
        if (sentence.length() > 0 && sentence.contains(" ")) {

            return sentence.substring(sentence.indexOf(" ")).trim();
        }

        return "Row is empty Or has no space";
    }

    public String RemoveBetweenTwoIndexesFromSentence(String sentence, int index1, int index2) {
        if (sentence.length() > 0) {

            return sentence.replace(sentence.substring(index1, index2), "");
        }

        return "Row is empty";
    }

    public String[] splitSentence(String sentence) {
        if (sentence.length() > 0) {

            return sentence.split(" ");
        }

        return new String[0];
    }

    public String splitSentenceAndAddText(String sentence) {
        if (sentence.length() > 0) {

            String[] parts = sentence.split(" ");
            String result = "Name: " + parts[0] + "\n" + "Middle Name: " + parts[1] + "\n" + "Last Name: " + parts[2];

            return result;
        }

        return  "Row is empty";
    }


    public String repeatText(String sentence, int n) {
        if (sentence.length() > 0) {

            return sentence.repeat(n);
        }

        return  "Row is empty";
    }

    public boolean checkWordsSentence(String sentence1, String sentence2, String sentence3) {
        if (sentence1.equalsIgnoreCase(sentence2) && (sentence2.equalsIgnoreCase(sentence3))){

            return  true;
        }

        return  false;
    }



}


