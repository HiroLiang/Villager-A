package hiro.liang.games.villager_a.core.model;

public interface Creature {

    /*
     * Def Bio Act
     */
    void die();
    void eat();
    void speak();
    void sleep();
    void pee();
    void poo();

    /*
     * Interaction
     */
    void interact();
    void talk();
    void mating();
    void attack();
    void damaged();

}
