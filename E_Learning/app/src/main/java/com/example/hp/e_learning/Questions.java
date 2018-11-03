package com.example.hp.e_learning;

public class Questions {

    public String mQuestions[]={
            "Declration d'un entier A",
            "Incrementation de 2 d'une variable i",
            "La fonction de lecture en C est ?",
            "La fonction de d'eriture en C est ?",
            "Affectation d'un reel K a un entier N",
            "La structure SELON en Algorithme est remplace en Lagage C par ?",
            "Une boucle DO WHILE execute l'instruction au moins une fois",
            "Declaration et initialisation d'un en tier i a 1",
            "Comment on nomme un reel en C",
            "Où sont déclarées les variables locales ?"
    };

   public String mChoices[][]={
           {"int A;","A int;","int A=0;","A:entier"},
           {"i++","i=i+2","i=i+1","++i"},
           {"Printf()","Read()","Scanf()","fflush()"},
           {"Ecrire()","Lire()","Printf()","Write()"},
           {"K=N","N=K","N affect K","impossible"},
           {"SWITCH","WHILE","DO WHILE","CASE"},
           {"FAUX","ANORMAL","PLUS","VRAI"},
           {"int i;","i=1","int i=1","i=1:entier"},
           {"int","entier","double","float"},
           {"En début du programme principal.","Au début de chaque fonction où elles interviennent.","Au début de chaque fonction où elles interviennent.","N'importe ou"},
   };

   public String mCorrectAnswer[]={"int A;","i=i+2","Scanf()","Printf()","impossible","SWITCH","VRAI","int i=1","float","Au début de chaque fonction où elles interviennent."};

   public String getQuestion(int a){
       String question=mQuestions[a];
       return question;
   }

    public String getChoice1(int a){
        String choice=mChoices[a][0];
        return choice;
    }

    public String getchoice2(int a){
       String choice=mChoices[a][1];
       return choice;
    }

    public String getChoice3(int a){
        String choice=mChoices[a][2];
        return choice;
    }

    public String getChoice4(int a){
        String choice=mChoices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a){
       String answer=mCorrectAnswer[a];
       return answer;
    }
}
