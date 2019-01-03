package com.example.hun.sivarun;

public class Bone {
    int x,y;
    int boneSpeed=15;

    Bone(int x , int y){
        this. x = x ; this.y = y;
    }
    public void move(){
       x+=boneSpeed;
    }
}
