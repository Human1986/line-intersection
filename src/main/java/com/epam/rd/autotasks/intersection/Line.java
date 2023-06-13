package com.epam.rd.autotasks.intersection;

public class Line {

    public int k, b;

    public Line(int k, int b) {
        this.k = k;
        this.b = b;
    }

    public Point intersection(Line other) {
        if (k == other.k) return null;
        
        int x =  (other.b - b ) / (k - other.k);
        int y = k * x + b;

        return new Point(x, y);
    }

}
