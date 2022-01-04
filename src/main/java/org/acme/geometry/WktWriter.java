package org.acme.geometry;

public class WktWriter {

    public String write(Geometry geometry){

        String type = geometry.getType();

        if(geometry.isEmpty()){
            return type + " EMPTY";
        }
        else{

            if(type == "POINT"){

                Point point = (Point)geometry;

                return type + '(' + point.getCoordinate().getX() + ' ' + point.getCoordinate().getY() + ')';
            }
            else{

                LineString lineString = (LineString)geometry;

                String pointLineString = new String();

                for (int i = 0; i < lineString.getNumPoints(); i++) {

                    if(i == 0){

                        pointLineString = pointLineString + '(' + lineString.getPointN(i).getCoordinate().getX() + ' ' + lineString.getPointN(i).getCoordinate().getY();
                    }
                    else{
                        pointLineString = pointLineString + ',' + lineString.getPointN(i).getCoordinate().getX() + ' ' + lineString.getPointN(i).getCoordinate().getY() ;
                    }
                }
                return type + pointLineString + ')';
            }
        }
    }
    
}
