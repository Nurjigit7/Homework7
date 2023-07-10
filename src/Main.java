import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //  System.out.println("Hello world!");
//        Random ran = new Random();
//        int [] arr = new int[20];
//        for (int i = 0; i <arr.length ; i++) {
//            arr[i]=ran.nextInt(170,220) ;
//            if (arr[i]>180){
//                System.out.println("180den chon san :"+arr[i]);
//            } else if (arr[i]<190) {
//                System.out.println("190kichine san :"+arr[i]);
//
//
//
//          }  }

//        Random random = new Random();
//        int cout = 0;
//        int cout1 = 0;
//        int[] array = new int[15];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(1, 20);
//            System.out.print(cout + "[" + array[i] + "]");
//            if (array[i] % 2 == 0) {
//                cout++;
//            } else {
//                cout1++;
//            }
//        }
//        System.out.println("\n(" + cout + ")" + "jup sandar");
//        System.out.println(cout1+" tak san");
//        Random random = new Random();
//        int[] array = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(1, 20);
//            System.out.print(array[i]+" ");
//            if (array[i] % 2 == 0){
//                array[i]=0;
//            }
//        }
//
//            for (int j = 0; j < array.length; j++) {
//                System.out.println(array[j]);
//
//           }

//        int[] array = {1,2,3,4,5,6,7,8,9,10};
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 0) {
//                System.out.print(" " + array[i]);
//
//
//            }
//        }
//     Random ran =new Random();
//     int[]array=new int[10];
//        for (int i = 0; i < array.length; i++) {
//     array[i]=ran.nextInt(1,10);
//            if(array[i]%2==0){
//                System.out.println(array[i])
//
//            }
        System.out.println(tryugolnik(5,7.4,4.4));
    }
    static double tryugolnik(double a,double b,double c) {

        double p = (a + b + c) / 2;
        double s = p * (p - a) * (p - b) * (p - c);

        return  Math.sqrt(s);
    }
}