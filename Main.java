public class Main{
   public static void main(String[] args)
   {
    Candy[][] candies= new Candy[4][3];
    BoxOfCandy candybox=new BoxOfCandy(candies);
    candies[0][1]=new Candy("lime");
    candies[1][1]=new Candy("orange");
    candies[2][2]=new Candy("cherry");
    candies[3][1]=new Candy("lemon");
    candies[3][2]=new Candy("grape");
    System.out.println(candybox);
    candybox.moveCandyToFirstRow(2);
    System.out.println(candybox);

    Candy[][] candies2= new Candy[3][5];
    BoxOfCandy candybox2=new BoxOfCandy(candies2);
    candies2[0][0]=new Candy("lime");
    candies2[0][1]=new Candy("lime");
    candies2[0][3]=new Candy("lemon");
    candies2[1][0]=new Candy("orange");
    candies2[1][3]=new Candy("lime");
    candies2[1][4]=new Candy("lime");
    candies2[2][0]=new Candy("cherry");
    candies2[2][2]=new Candy("lemon");
    candies2[2][3]=new Candy("orange");
    System.out.println(candybox2);
    System.out.println(candybox2.removeNextByFlavor("cherry"));
   // System.out.println(candybox2);
    System.out.println(candybox2.removeNextByFlavor("lime"));
  //  System.out.println(candybox2);
    System.out.println(candybox2.removeNextByFlavor("grape"));
    System.out.println(candybox2);
   }
}