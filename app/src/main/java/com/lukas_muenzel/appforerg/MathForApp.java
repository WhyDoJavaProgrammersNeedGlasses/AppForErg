package com.lukas_muenzel.appforerg;


/**
 * Created by lukas_muenzel on 05.01.18.
 */

public class MathForApp {
    public static char[] getDecryption(String text, int displacement){
        char[] littleAlphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] bigAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

        char[] textArray = text.toCharArray();
        char[] decryptetTextArray = new char[text.length()];
        int p = -1;
        for (int i = 0; i < textArray.length; i++){
            for (int j = 0; j < littleAlphabet.length; j++){
                if (textArray[i] == littleAlphabet[j]){
                    int k = (j + displacement)% 26;
                    decryptetTextArray[i] = littleAlphabet[k];
                }
                else if(textArray[i] == bigAlphabet[j]){
                    int k = (j + displacement)% 26;
                    decryptetTextArray[i] = bigAlphabet[k];
                }
            }
            if(decryptetTextArray[i] == '\u0000'){
                decryptetTextArray[i] = textArray[i];
            }

        }
        return decryptetTextArray;
    }

    public static Lenguage[] displaceLenguageToArray(Lenguage orginalLenguage){
        Lenguage[] lenguages = new Lenguage[26];
        for(int i = 0; i <= lenguages.length - 1; i++){

        }
        return lenguages;
    }

    public static Lenguage displaceLenguageByOne(Lenguage originLenguage){
        double[] frequencys = originLenguage.letterFrequency;
        double firstFrequency = frequencys[frequencys.length - 1];
        for(int i = 0; i <= frequencys.length - 2; i++){

        }
        //TODO
        return new Lenguage(new double[]{1});
    }
    public static double getMistakeOfArray(double[] correctSolution, double[] realSolution){
        double mistake = 0.0;
        if(correctSolution.length == realSolution.length){
            for(int i = 0; i <= correctSolution.length - 1; i++){
                mistake += getMistakeOfTwoDouble(correctSolution[i], realSolution[i]);
            }
        }

        return mistake;
    }

    public static double getMistakeOfTwoDouble(double correctSolution, double realSolution){
        if(correctSolution <= realSolution){
            return realSolution - correctSolution;
        }
        else{
            return correctSolution - realSolution;
        }
    }

    public static int searchLowestDoubleInArray(double[] input){
        int positionInArray = 0;
        double lowestNumber = input[0];
        for(int i = 0; i <= input.length - 1; i++){
            if(input[i] < lowestNumber){
                lowestNumber = input[i];
                positionInArray = i;
            }
        }
        return positionInArray;
    }

    public static double[] analyzeLetterFrequency(String text){
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int[] letters = new int[26];
        char[] textArray = text.toLowerCase().toCharArray();
        for(int i = 0; i <= text.length() - 1; i++ ){
            for(int k = 0; k <= letters.length - 1; k++){
                if (textArray[i] == alphabet[k]){
                    letters[k] += 1;
                }
            }
        }

        return getPercentOfIntArray(letters);
    }

    public static double[] getPercentOfIntArray(int[] input){
        double sum = 0;
        double[] percentOfEachPart = new double[input.length];
        for(int i = 0; i <= input.length - 1; i++){
            sum += input[i];
        }

        double onePercent = sum / 100;

        for(int i = 0; i <= input.length - 1; i++){
            percentOfEachPart[i] = input[i] / onePercent;
        }

        return percentOfEachPart;
    }
}
