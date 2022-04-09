package code._4_student_effort.DataBase;

import code._2_challenge._2_movie_database.Actor;
import code._2_challenge._2_movie_database.Film;
import code._2_challenge._2_movie_database.Premiu;
import code._2_challenge._2_movie_database.Studio;

public class Main {
    public static void main(String[] args) {

        printMovieNamesInWitchPlaysAtLeastAnActorWithAgeAbove50();
        printStudioNamesInWitchPlaysTheActorWithNameActorCu2Oscaruri();
        PrintALLStudioNamesThatHavePublishedMoreThen2Movies();



    }
    public static Studio[] getData() {
        code._2_challenge._2_movie_database.Premiu oscar1990 = new code._2_challenge._2_movie_database.Premiu("oscar", 1990);
        code._2_challenge._2_movie_database.Premiu oscar2000 = new code._2_challenge._2_movie_database.Premiu("oscar", 2000);
        code._2_challenge._2_movie_database.Premiu oscar2010 = new code._2_challenge._2_movie_database.Premiu("oscar", 2010);
        code._2_challenge._2_movie_database.Premiu oscar2018 = new code._2_challenge._2_movie_database.Premiu("oscar", 2018);

        code._2_challenge._2_movie_database.Actor actorOscar1990 = new code._2_challenge._2_movie_database.Actor("actor cu 2 oscaruri", 35, new code._2_challenge._2_movie_database.Premiu[]{oscar1990, oscar2000});
        code._2_challenge._2_movie_database.Actor actorOscar2010 = new code._2_challenge._2_movie_database.Actor("actor cu oscar din 2000", 55, new code._2_challenge._2_movie_database.Premiu[]{oscar2010});
        code._2_challenge._2_movie_database.Actor actorOscar2018 = new code._2_challenge._2_movie_database.Actor("actor cu oscar din 2018", 23, new code._2_challenge._2_movie_database.Premiu[]{oscar2018});
        code._2_challenge._2_movie_database.Actor actorFaraPremii01 = new code._2_challenge._2_movie_database.Actor("actor fara oscar 01", 33, new code._2_challenge._2_movie_database.Premiu[]{});
        code._2_challenge._2_movie_database.Actor actorFaraPremii02 = new code._2_challenge._2_movie_database.Actor("actor fara oscar 02", 60, new code._2_challenge._2_movie_database.Premiu[]{});
        code._2_challenge._2_movie_database.Actor actorFaraPremii03 = new code._2_challenge._2_movie_database.Actor("actor fara oscar 02", 20, new Premiu[]{});

        code._2_challenge._2_movie_database.Film film1 = new code._2_challenge._2_movie_database.Film(1990, "film cu actori de oscar", new code._2_challenge._2_movie_database.Actor[]{actorOscar1990, actorFaraPremii01});
        code._2_challenge._2_movie_database.Film film2 = new code._2_challenge._2_movie_database.Film(2010, "film cu actori fara premii2", new code._2_challenge._2_movie_database.Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        code._2_challenge._2_movie_database.Film film3 = new code._2_challenge._2_movie_database.Film(2010, "film cu actori fara premii3", new code._2_challenge._2_movie_database.Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        code._2_challenge._2_movie_database.Film film4 = new code._2_challenge._2_movie_database.Film(2018, "film cu actori de oscar", new code._2_challenge._2_movie_database.Actor[]{actorOscar2010, actorOscar2018, actorFaraPremii02});
        code._2_challenge._2_movie_database.Film film5 = new code._2_challenge._2_movie_database.Film(2018, "film cu actori fara premii5", new Actor[]{actorFaraPremii02, actorFaraPremii03});

        code._2_challenge._2_movie_database.Studio studio1 = new code._2_challenge._2_movie_database.Studio("MGM", new code._2_challenge._2_movie_database.Film[]{film1, film2});
        code._2_challenge._2_movie_database.Studio studio2 = new code._2_challenge._2_movie_database.Studio("Disney", new Film[]{film3, film4, film5});

        code._2_challenge._2_movie_database.Studio[] studioDatabase = new Studio[]{studio1, studio2};

        return studioDatabase;
    }

    public static void PrintALLStudioNamesThatHavePublishedMoreThen2Movies(){
        for (Studio studio : getData()){
            if (studio.filme.length > 2){
                System.out.println(studio.nume);
            }
        }
    }

    public static void printStudioNamesInWitchPlaysTheActorWithNameActorCu2Oscaruri (){
        for (Studio studio : getData()){
            for (Film film : studio.filme){
                for (Actor actor : film.actori){
                    if (actor.nume.equals("actor cu 2 oscaruri")){
                        System.out.println(studio.nume);
                    }
                }
            }
        }
    }
    public static void printMovieNamesInWitchPlaysAtLeastAnActorWithAgeAbove50(){
        for (Studio studio : getData()){
            for (Film film : studio.filme){
                for (Actor actor : film.actori){
                    if (actor.varsta > 50){
                        System.out.println(film.nume);
                    }
                }
            }
        }
    }



}
