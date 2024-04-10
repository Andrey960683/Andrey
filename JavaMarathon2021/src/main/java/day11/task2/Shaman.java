package day11.task2;

public class Shaman extends Hero implements Healer,MagicAttack{

    static final int HEAL_HIMSELF=50;
    static final int HEALTH_TEAMMATE=30;
    int magicAtt= 15;

    public Shaman() {
        physDef=0.2;
        physAtt= 10;
        magicDef=0.2;
    }

    @Override
    public void healHimself() {
        if(health+HEAL_HIMSELF>MAX_HEALTH){
            health=MAX_HEALTH;
        }else
            health+=HEAL_HIMSELF;


    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health+HEALTH_TEAMMATE>MAX_HEALTH){
            hero.health=MAX_HEALTH;
        }else
            hero.health+=HEALTH_TEAMMATE;

    }

    @Override
    public void magicalAttack(Hero hero) {
        double attackScore = magicAtt * (1-hero.magicDef);
        if(hero.health- attackScore <MIN_HEALTH){
            hero.health = MIN_HEALTH;
        }else
            hero.health-=attackScore;

    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
