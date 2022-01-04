package org.acme.geometry;

import java.util.ArrayList;

public class EnvelopeBuilder implements GeometryVisitor {

    private ArrayList<Coordinate> coordinates;

    public EnvelopeBuilder(){

        this.coordinates = new ArrayList<Coordinate>();
    }

    public void insert(Coordinate coordinate){

        this.coordinates.add(coordinate);

    }

    public Envelope build(){

        Double xMin = 10E9;
        Double yMin = 10E9;

        Double xMax = -10E9;
        Double yMax = -10E9;

        for (Coordinate coordinate : coordinates) {

            if(coordinate.getX() < xMin){

                xMin = coordinate.getX();

            }
            if(coordinate.getX()>xMax){

                xMax = coordinate.getX();

            }
            if (coordinate.getY() < yMin) {

                yMin = coordinate.getY();
                
            }
            if (coordinate.getY() > yMax) {

                yMax = coordinate.getY();
                
            }
            
        }

        Coordinate coordinateTopRight= new Coordinate(xMax, yMax);
        Coordinate coordinateBottomLeft = new Coordinate(xMin, yMin);

        Envelope envelope = new Envelope(coordinateBottomLeft, coordinateTopRight);

        return envelope;
    }

    @Override
    public void visit(Point point){

        this.insert(point.getCoordinate());
    }

    @Override
    public void visit(LineString lineString){

        for (int i = 0; i < lineString.getNumPoints(); i++) {

            this.insert(lineString.getPointN(i).getCoordinate());
            
        }
    }


    
}
