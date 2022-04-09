package code._4_student_effort.Movie_Database;

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
