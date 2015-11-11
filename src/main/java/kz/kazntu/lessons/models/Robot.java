package kz.kazntu.lessons.models;

import kz.kazntu.lessons.interfaces.Hand;
import kz.kazntu.lessons.interfaces.Head;
import kz.kazntu.lessons.interfaces.Leg;

public class Robot {

    private Hand hand;
    private Leg leg;
    private Head head;

    public Robot(){

    }
    public Robot(Hand hand, Leg leg, Head head) {
        super();
        this.hand = hand;
        this.leg = leg;
        this.head = head;
    }

    public void action(){
        head.calc();
        hand.catchSomething();
        leg.go();
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }
}