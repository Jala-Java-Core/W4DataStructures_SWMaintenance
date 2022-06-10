package game;

import java.util.LinkedList;
import java.util.List;

public class MyFunGame {
    //Code W4-1
    // Take atention  to this attribute, private means that is used only here
    private String name;
    public int clock = 0;
    // we don't have idea what variable a represents
    // Please change to players a better name
    // be careful, 'protected' means that other calss or sub class is using it
    protected List<Player> a = new LinkedList<Player>();

    public void playOneStep() {
        clock++; // increments clock
        for (Player p : a) {
            // Hard to understand
            if (p.isAlive()&&p.points > 0&&p.ready()==true)p.move();
            else if (p.isAlive() && p.points() >0) p.pause();
            // Can be rewrited
            if (p.isAlive() && p.points() > 0) {
                if (p.ready) {
                    p.move();
                } else {
                    p.pause();
                }
            }
        }
    }

    public void add_player(String name) {
        // This is the unique place where 'name' is called
        // also para name and attribute name has the same name
        this.name = name;
        a.add(new Player(name));
    }

    public void go() {
        clock++;
        for (Player p : a) {
            if (p.isAlive()&&p.points > 0&&p.ready()==true)p.move();
            else if (p.isAlive() && p.points() >0) p.pause();
        }
    }
}
