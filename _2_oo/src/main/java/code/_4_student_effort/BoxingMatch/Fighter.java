package code._4_student_effort.BoxingMatch;

public class Fighter {
    public String name;
    public int damagePerAtack;
    public int health;

    public Fighter(String name , int damagePerAtack , int health) {
        this.name = name;
        this.health = health;
        this.damagePerAtack = damagePerAtack;
    }
    public void attack(Fighter opponent){
        opponent.health = opponent.health - this.damagePerAtack;
    }
}

