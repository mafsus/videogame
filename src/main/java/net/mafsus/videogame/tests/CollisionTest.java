package net.mafsus.videogame.tests;

import net.mafsus.videogame.math.Vector2;
import net.mafsus.videogame.math.collision.AABB;

public class CollisionTest implements ITest {
    @Override
    public void runInitialTest() {
        AABB first = new AABB(new Vector2(-10,10),new Vector2(0,0));
        AABB second = new AABB(new Vector2(-5,5),new Vector2(5,-5));
        testCollision(first,second);
        second = second.translate(new Vector2(15,15));
        testCollision(second,first);
    }

    void testCollision(AABB a, AABB b){
        System.out.println("Collision with "+a+" and "+b+" returns: "+a.intersects(b));
    }

    @Override
    public void runContinousTest() {

    }
}
