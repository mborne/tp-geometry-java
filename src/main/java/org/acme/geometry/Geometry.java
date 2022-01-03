package org.acme.geometry;

public interface Geometry {

    String getType();

    Boolean isEmpty();

    void translate(Double dx, Double dy);
    
}
