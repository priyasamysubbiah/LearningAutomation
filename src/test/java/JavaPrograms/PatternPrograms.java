package JavaPrograms;

//i - row
//j - column
//k -space

public class PatternPrograms {

//  *
//  **
//  ***
  static void pattern1(int n) {
    for (int i = 0; i < n; i++) { //row
      for (int j = 0; j <= i; j++) { //column
        System.out.print("* ");
      }
      System.out.println();
    }
  }

//  ***
//  **
//  *
  static void pattern2(int n) {
    for (int i = 0; i < n; i++) {
      //for (int j = n; j>i; j--){
      for (int j = 0; j < n - i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

//  1
//  1 2
//  1 2 3
  static void pattern3(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }

//  *
//  **
//  ***
//  **
//  *
  static void pattern4(int n) {
    for (int i = 0; i < 2 * n; i++) {
      int columns = i > n ? (2 * n) - i : i;
      for (int j = 0; j < columns; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

//    *
//   * *
//  * * *
//   * *
//    *
  static void pattern5(int n) {
    for (int i = 0; i < 2 * n; i++) { //row
      int columns = i > n ? (2 * n) - i : i;
      int space = n - columns;
      for (int k = 0; k < space; k++) { //space
        System.out.print(" ");
      }
      for (int j = 0; j < columns; j++) { //column
        System.out.print("* ");
      }
      System.out.println();
    }
  }

//    1
//   212
//  32123
  static void pattern6(int n) {
    for (int i = 1; i <= n; i++) {
      for (int k = 0; k < n - i; k++) {
        System.out.print("  ");
      }
      for (int j = i; j >= 1; j--) {
        System.out.print(j + " ");
      }
      for (int j = 2; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }

//    1
//   212
//  32123
//   212
//    1
  static void pattern7(int n) {
    for (int i = 1; i <= 2*n-1; i++) {
      int columns = i > n ? (2 * n) - i : i;
      int space = n - columns;
      for (int k = 0; k < space; k++) {
        System.out.print("  ");
      }
      for (int j = columns; j>=1; j-- ){
        System.out.print(j+" ");
      }
      for(int j=2;j<=columns;j++){
        System.out.print(j+" ");
      }
      System.out.println();
    }
  }

//  1
//  2 3
//  4 5 6
//  7 8 9 10
static void pattern8(int n) {
  int num=1;
  for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
      System.out.print(num + " ");
      num++;
    }
    System.out.println();
  }
}

//       1
//     2 3 4
//   5 6 7 8 9
//    10 11 12
//       13
  static void pattern9(int n) {
  int num = 1;
  for (int i = 1; i <= 2 * n - 1; i++) {
    int column = i > n ? (2 * n) - i : i;
    int space = n - column;
    for (int k = 0; k < space; k++) {
      System.out.print("  ");
    }
    for (int j = column; j >= 1; j--) {
      System.out.print(num + " ");
      num++;
    }
    for (int j = 2; j <= column; j++) {
      System.out.print(num + " ");
      num++;
    }
    System.out.println("");
    }
}

//  *
//  ***
//  *****
//  *******
  static void pattern10(int n){
    int k=1;
    for (int i =1; i<=n; i++){
      for (int j=1; j<=k;j++){
        System.out.print("* ");
      }
      k=k+2;
      System.out.println("");
    }

  }

   public static void main(String[] args) {
    //pattern1(5);
    //pattern2(5);
    //pattern3(5);
    //pattern4(5);
    //pattern5(5);
    //pattern6(5);
    //pattern7(5);
    //pattern8(5);
    pattern9(3);
    //pattern10(5);
  }
}
