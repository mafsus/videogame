package net.mafsus.videogame.entity;

import net.mafsus.videogame.Game;
import net.mafsus.videogame.math.Vector2;

public class EntityBase {

    Vector2 position;
    Vector2 velocity;



    public void tickPhysics(Vector2 acceleration){
        position = position.add(velocity.scale(Game.TICK_INTERVAL)).add(acceleration.scale(Game.TICK_INTERVAL_SQRD/2f));
        velocity = velocity.add(acceleration.scale(Game.TICK_INTERVAL));
    }


    public Vector2 getPosition() {
        return position;
    }

    public void setPosition(Vector2 position) {
        this.position = position;
    }

    public void setPosition(float x, float y){
        setPosition(new Vector2(x,y));
    }

    public float getX(){
        return this.position.getX();
    }

    public float getY(){
        return this.position.getY();
    }

}
