class OneBHK{
    int roomArea,hallArea,price;
    OneBHK(int roomArea,int hallArea,int price){
       this.roomArea=roomArea;
       this.hallArea=hallArea;
       this.price=price;
    }
    void show(){
        System.out.println("Room area"+roomArea);
        System.out.println("Hall area"+hallArea);
        System.out.println("Price"+price);

    }
}
class TwoBHK  extends OneBHK{
    int room2Area;
    TwoBHK(int roomArea,int hallArea,int price,int room2Area){
        super(roomArea,hallArea,price);
        this.room2Area=room2Area;
    }
    void show(){
        System.out.println("Room area"+roomArea);
        System.out.println("Hall area"+hallArea);
        System.out.println("Price"+price);
        System.out.println("Room 2 area"+room2Area);

    }

}
public class DriverClass {
    public static void main(String[] arg){
        TwoBHK ob1=new TwoBHK(200,400,20,150);
        TwoBHK ob2=new TwoBHK(300,600,30,250);
        TwoBHK ob3=new TwoBHK(500,800,50,300);
        ob1.show();
        ob2.show();
        ob3.show();
        double Total_price=ob1.price+ ob2.price+ ob3.price;
        System.out.println("Total price="+Total_price);



    }
}
