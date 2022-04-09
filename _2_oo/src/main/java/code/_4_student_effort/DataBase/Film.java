package code._4_student_effort.DataBase;

import code._4_student_effort.DataBase.Actor;

public class Film {
    Integer an_Aparitie;
    String name;
    Actor[] actor;

    public Film (Integer an_Aparitie , String name, Actor[] actor){
        this.an_Aparitie = an_Aparitie;
        this.actor = actor;
        this.name = name;
    }
}
