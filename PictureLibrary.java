package com.comma.iqtest;

public class PictureLibrary {

    public static int[] mQuestions2  = new int[] {
            R.drawable.p1, R.drawable.p2,

    };
    public static int mChoices2 [][]  = {
            {R.drawable.pa1, R.drawable.pa2, R.drawable.pa3, R.drawable.pa4empty},
            {R.drawable.pa21, R.drawable.pa22, R.drawable.pa23, R.drawable.pa4empty},
    };

    public static  int[] mCorrectAnswers2 [] = {
            {R.drawable.pa3, R.drawable.pa22}
    };




    public int getQuestion2(int a) {
        int question2 = mQuestions2[a];
        return question2;
    }


    public int getChoice12(int a) {
        int choice02 = mChoices2[a][0];
        return choice02;
    }


    public int getChoice22(int a) {
        int choice12 = mChoices2[a][1];
        return choice12;
    }

    public int getChoice32(int a) {
        int choice22 = mChoices2[a][2];
        return choice22;
    }

    public int getChoice42(int a) {
        int choice32 = mChoices2[a][3];
        return choice32;
    }

    public int[] getCorrectAnswers2(int a) {
        int[] answer2 = mCorrectAnswers2[a];
        return answer2;
    }

}
