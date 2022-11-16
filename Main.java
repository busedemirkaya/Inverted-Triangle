import java.util.Scanner;
public class Main {
    /*
    Ters Üçgen Yapımı
    Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana ters üçgen çizen program

    Basamak Sayısı 10:
     *******************
      *****************
       ***************
        *************
         ***********
          *********
           *******
            *****
             ***
              **
               */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Sayısı : ");
        int n = input.nextInt();

        for(int i=0; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for (int k=1; k<=(2*n-(2*i+1)); k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}