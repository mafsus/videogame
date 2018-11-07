package net.mafsus.videogame.math.collision;

import net.mafsus.videogame.math.Vector2;

public class AABB {
    Vector2 topLeft;
    Vector2 bottomRight;


    public AABB(Vector2 topLeft, Vector2 bottomRight){
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public Vector2 getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Vector2 topLeft) {
        this.topLeft = topLeft;
    }

    public Vector2 getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(Vector2 bottomRight) {
        this.bottomRight = bottomRight;
    }

    public Vector2 getCenter(){
        return topLeft.add(bottomRight.subtract(topLeft).scale(.5f));
    }

    public float getHeight(){
        return Math.abs(topLeft.getX()-bottomRight.getX());
    }

    public boolean intersects(AABB other){
        return true;
    }
}
