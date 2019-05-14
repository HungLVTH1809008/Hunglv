package Assignment2;

public class SoNguyenTo {
        int a;
      int timSoNguyenTotieptheo;
      int n;

 public static boolean isSoNguyenTo (int x) {
     {
         // Neu n < 2 thi khong phai la SNT
         if (x < 2){
             return false;
         }

         for (int i = 2; i < (x - 1); i++){
             if (x % i == 0){
                 return false;
             }
         }

         return true;
     }

  }
  public static int timSoNguyenTotieptheo(int a) {

      if (a <= 1)
          return 0;
      for (int i = 2; i < a; i++)
          if (a % i == 0)
              return 0;
      return 1;
  }
      int sntlienke ( int a[], int n){
          for (int i = 0; i < n; i++)
              if ((a[i]) == 1)
                  return a[i];
          return 0;
      }
      public int getA () {
          return a;
      }

      public void setA ( int a){
          this.a = a;
      }

}
