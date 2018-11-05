package net.mafsus.videogame.math;

public class Vector2 {
    float X;
    float Y;

    public Vector2(float x, float y){
        this.X=x;
        this.Y=y;
    }
    public Vector2(float val){
        this(val,val);
    }
    public Vector2(){
        this(0);
    }

    public Vector2 add(float x, float y){
        return new Vector2(this.X+x,this.Y+y);
    }

    public Vector2 subtract(float x, float y){
        return new Vector2(this.X-x,this.Y-y);
    }

    public Vector2 scale(float scale){
        return new Vector2(X*scale,Y*scale);
    }

    public Vector2 add(Vector2 val){
        return add(val.X,val.Y);
    }

    public Vector2 subtract(Vector2 val){
        return subtract(val.X,val.Y);
    }

    public float dot(Vector2 vec){
        return this.X*vec.X+this.Y*vec.Y;
    }

    public float getX() {
        return X;
    }

    public void setX(float x) {
        X = x;
    }

    public float getY() {
        return Y;
    }

    public void setY(float y) {
        Y = y;
    }
}
