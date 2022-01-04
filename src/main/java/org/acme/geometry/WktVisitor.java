package org.acme.geometry;

public class WktVisitor implements GeometryVisitor{

    private StringBuilder buffer;

    public WktVisitor(){

        this.buffer =new StringBuilder();
    }


    public String getResult(){
        return buffer.toString();
    }

    @Override
    public void visit(Point point){
        this.buffer.append("POINT");

        if(point.isEmpty()){
            this.buffer.append(" EMPTY");
        }
        else{

            this.buffer.append("(" + point.getCoordinate().getX() + " " + point.getCoordinate().getY() + ")");
        }

    }

    @Override
    public void visit(LineString lineString){
        this.buffer.append("LINESTRING");

        if(lineString.isEmpty()){
            this.buffer.append(" EMPTY");
        }
        else{

            String pointLineString = new String();

            for (int i = 0; i < lineString.getNumPoints(); i++) {

                 if(i == 0){

                    pointLineString = pointLineString + '(' + lineString.getPointN(i).getCoordinate().getX() + ' ' + lineString.getPointN(i).getCoordinate().getY();
                 }
                else{
                    pointLineString = pointLineString + ',' + lineString.getPointN(i).getCoordinate().getX() + ' ' + lineString.getPointN(i).getCoordinate().getY() ;
                }                }
            this.buffer.append(pointLineString+")");
            }
        }

    }
    

