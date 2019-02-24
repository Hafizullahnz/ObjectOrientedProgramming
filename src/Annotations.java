public class Annotations {
    public static void main(String[] args) {
        System.out.println("===========");
        Cube c = new Cube(2);

        System.out.println(c.calcVolume());
        System.out.println(c.getTheVolume());
    }
}

class Cube{
    int side;

    public Cube(int side){
        this.side = side;
    }

    /**
     * this is no longer efficient
     * please use {@link #calcVolume()}
     */
    @Deprecated   // this is a code which we are changing with calcVolume  method
    // we also use @link in the comments to tell which code needs to be used
    public int getTheVolume(){
        int s = side;

        int area = s * s;
        int volume = area * s;

        return volume;
    }

    public int calcVolume(){
        return side*side*side;
    }
}