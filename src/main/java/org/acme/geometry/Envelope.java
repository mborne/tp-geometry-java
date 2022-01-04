package org.acme.geometry;

public class Envelope {

    private Coordinate bottomLeft;
    private Coordinate topRight;

    public Envelope(){

        this.bottomLeft = new Coordinate();
        this.topRight = new Coordinate();

    };

    public Envelope( Coordinate bottomLeft, Coordinate topRight){

        this.bottomLeft = bottomLeft;
        this.topRight = topRight;

    };

    public Boolean isEmpty(){

        if(bottomLeft.isEmpty()){
            return true;
        }
        if(topRight.isEmpty()){
            return true;
        }
        return false;

    };

    public Double getXmin(){

        return bottomLeft.getX();

    };

    public Double getYmin(){

        return bottomLeft.getY();

    };

    public Double getXmax(){

        return topRight.getX();

    };

    public Double getYmax(){

        return topRight.getY();

    };


    
}
