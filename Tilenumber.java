import java.util.Scanner;

class Tile{
    private int tileside;
    private int t_area;

    Tile(int tileside){
        this.tileside=tileside;
        this.t_area=tileside*tileside;
    }
    int getArea(){
        return t_area;
    }
}
class Floor{
    private int length;
    private int width;
    Floor(int length,int width){
        this.length=length;
        this.width=width;
    }
    void totalTiles(Tile t){
        double t_area=t.getArea();
        double floorArea =length*width;
        double Tiles_num= floorArea/t_area;
        System.out.println("Number of tiles:"+Tiles_num);
    }

}
class Tilenumber{
    public static void main(String[] arg){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length of the tile:");
        int tilelength=s.nextInt();
        Tile t=new Tile(tilelength);
        System.out.println("Enter the length of the floor:");
        int floorlength=s.nextInt();
        System.out.println("Enter the width of the floor:");
        int floorwidth=s.nextInt();
        Floor f=new Floor(floorlength,floorwidth);
        f.totalTiles(t);
    }

}