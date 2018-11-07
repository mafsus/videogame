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
        return Math.abs(topLeft.getY()-bottomRight.getY());
    }
    public float getWidth(){
        return Math.abs(topLeft.getX()-bottomRight.getX());
    }

    public AABB translate(Vector2 trans){
        return new AABB(getTopLeft().add(trans),getBottomRight().add(trans));
    }

    public AABB scale(float scaleFactor){
        Vector2 center = getCenter();
        return new AABB(getTopLeft().subtract(center).scale(scaleFactor).add(center),getBottomRight().subtract(center).scale(scaleFactor).add(center));
    }



    public boolean intersects(AABB other){
        return (topLeft.getX()<other.bottomRight.getX()&&bottomRight.getX()>other.topLeft.getX()&&bottomRight.getY()<other.topLeft.getY()&&topLeft.getY()>bottomRight.getY());
    }

    @Override
    public String toString() {
        return "AABB{" +
                "Top Left: " + topLeft +
                ", Bottom Right: " + bottomRight +
                '}';
    }
}
