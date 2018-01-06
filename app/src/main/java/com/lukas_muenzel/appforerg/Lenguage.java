package com.lukas_muenzel.appforerg;

/**
 * Created by lukas_muenzel on 05.01.18.
 */

public class Lenguage {
    public double[] letterFrequency = new double[26];

    public Lenguage(double[] lF){
        for(int i = 0; i<= letterFrequency.length - 1; i++){
            letterFrequency[i] = lF[i];
        }
    }

}
