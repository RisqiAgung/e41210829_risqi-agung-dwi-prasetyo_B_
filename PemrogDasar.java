package pemrogdasar;

import java.util.Scanner;

 class PemrogDasar {
     
     //kontol
     static void gigi1 (){
         System.out.println("naik dengan lancar");
     }
     static void gigi2 (){
         System.out.println("naik agak berat");
     }
     static void gigi3 (){
         System.out.println("naik sangat berat");
     }
     static void gigi4 (){
         System.out.println("tidak naik");
     }
     public static void main(String[] args) {
            String gigi;
            Scanner p = new Scanner(System.in);
            System.out.print("ketika anda di tanjakan anda memasukkan giigi berapa : ");
            gigi = p.nextLine();
            if(gigi.equals("1")){
                gigi1();
            }else if(gigi.equals("2")){
                gigi2();
            }else if(gigi.equals("3")){
                gigi3();
            }else if(gigi.equals("4")){
                gigi4();
            }else{
                System.out.println("anda tidak memasukkan gigi");
            }
       }
  }
         
         
     
