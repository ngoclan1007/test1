import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

////        bài 1
        System.out.println("bài 1");
        System.out.println("in hình vuông 4");
        int height =4;
        int weight =4;
        for(int i = 1; i <= height; i++){
            for(int j = 1; j <= weight; j++) {
                System.out.print("*  ");
            }
            System.out.println("");
        }
        System.out.println("in ra tam giác 4");
        int height1 =4;
        for (int i = 1; i <= height1; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n----------------------------------");
//////        bài 2
        System.out.println("bài 2");
        String str1 = "You only live once, but if you do it right, once is enough";
        int count = 1;
        for (int i=0; i<str1.length(); i++){
            if (str1.charAt(i) == ' '){
              count++;
            }
        }
        System.out.println("số từ trong chuỗi:  " + str1 + " : " + count);
     int count1 =0;
        for(int i = 0; i<str1.length(); i++){
            if(str1.charAt(i) == 'o'){
                count1++;
                System.out.println("ký tự o xuất hiện ở vị trí thứ " + i);
            }
        }
        System.out.println("Tổng số lần xuất hiện ký tự o là: " + count1);

        System.out.println("\n----------------------------------");
//////        bài 3
        System.out.println("bài 3");
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số n : ");
        n=sc.nextInt();
        boolean isCheck = true;
        for (int i=2; i<n; i++){
            if(n % i ==0){
                isCheck = false;
                break;
            }
        }
        if (isCheck == true){
            System.out.println(n+ " là nguyên tô");
        }else {
            System.out.println(n + " k phải nguyên tố");
        }


        System.out.println("\n----------------------------------");
//
////        bài 4
        System.out.println("bài 4");
        int n4,count4=0;
        int result = 1;
        int num = 3;
        System.out.println("10 số nguyên tố đầu tiên là:");
        System.out.println(2);
        for ( int i = 2 ; i <=10 ;  ) {
            for ( int j = 2 ; j <= Math.sqrt(num) ; j++ ) {
                if ( num%j == 0 )
                {
                    result = 0;
                    break;
                }
            }
            if ( result != 0 ) {
                System.out.println(num);
                i++;
                count4++;
            }
            result = 1;
            num++;
        }
        System.out.println("các số nguyên tố nhỏ hơn 10");
        int m = 10;
        for (int i= 1; i<10; i++){
            int dem = 0;
            for (int j=1; j<=10; j++){
               if(i%j == 0){
                  dem++;
               }
            }
            if(dem ==2){
                System.out.println(i);
            }
        }
        System.out.println("\n----------------------------------");

//        bài 5
        System.out.println("bài 5");
        Scanner sc1= new Scanner(System.in);
     int dong;
     int cot;
     System.out.println("nhập số dòng cho mảng");
     dong = sc1.nextInt();
     System.out.println("nhập số cột cho mảng");
     cot = sc1.nextInt();

     int[][] array = new int[dong][cot];
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print("Nhập phần tử  [" + i + ", " + j + "]: ");
                array[i][j] = sc1.nextInt();
            }
        }
        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("các phần tử trên đường chéo chính");
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                if(j==i){
                    System.out.print(array[i][j]+",");
                }
            }
        }
        System.out.println();
        System.out.println("nhập mảng 2");
        int[][] array2 = new int[dong][cot];
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print("Nhập phần tử  [" + i + ", " + j + "]: ");
                array[i][j] = sc1.nextInt();
            }
        }
        System.out.println("Mảng 2 vừa nhập: ");
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("\n");
        }

        System.out.println("tính tổng 2 ma trận");
      int[][] sum = new int[dong][cot];
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                sum[i][j] = array[i][j] + array2[i][j];
            }
        }
        System.out.println("ma trận tổng : ");
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println("\n");
        }


    }
}
