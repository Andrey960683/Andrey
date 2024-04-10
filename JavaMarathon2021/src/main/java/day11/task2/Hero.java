package day11.task2;

public abstract class Hero implements PhysAttack {
    static final int MAX_HEALTH=100;
    static final int MIN_HEALTH =0;
    int health;
    int physAtt;
    double physDef;
    double magicDef;

    public Hero() {
        health = MAX_HEALTH;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double attackScore = physAtt * (1-hero.physDef);

        if(hero.health- attackScore < MIN_HEALTH){
            hero.health = MIN_HEALTH;
        }else
            hero.health-=attackScore;
    }
}
