package com.example.assignment1_quiz;

public class Images {
    public int[] pictures = {R.drawable.desmond_dube,
            R.drawable.liteboho_molise,
            R.drawable.obatia_lawrence_chapi
    };

    private final String[][] choices = {
            {"Liteboho Molise", "Desmond Dube", "Obatia Lawrence Chapi"},
            {"Obatia Lawrence Chapi", "Desmond Dube", "Liteboho Molise"},
            {"Desmond Dube", "Liteboho Molise", "Obatia Lawrence Chapi"},
    };
    private final String[] correctAnswer = {"Liteboho Molise", "Desmond Dube", "Obatia Lawrence Chapi"};

    //getters
    public int getPic(int i){
        return pictures[i];
    }

    public String getChoice1(int i){
        return choices[i][0];
    }

    public String getChoice2(int i){
        return choices[i][1];
    }

    public String getChoice3(int i){
        return choices[i][2];
    }

    public String getCorrectAnswer(int i){
        return correctAnswer[i];
    }
}
