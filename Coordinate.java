package Pirates;

class Coordinate {

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    private void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    private void setY(int y) {
        this.y = y;
    }

    public Coordinate(int x, int y) {

        setX(x);
        setY(y);

    }

}