public class Demo {
  public static void main(String[] args) {
    if (args.length > 0) {
      printLoop(Integer.parseInt(args[0]));
    }else{
      printLoop(5);
    }

    /* arrToString Tests
    int[]a = {1,4,7};
    int[]b = {21,0};
    int[]c = {2,6,10};
    int[]d = {1,3,5,7};
    int[]e = {4,2,0,9};
    System.out.println(arrToString(a));
    System.out.println(arrToString(b));
    System.out.println(arrToString(c));
    System.out.println(arrToString(d));
    System.out.println(arrToString(e));
    */

    /* arrayDeepToString Tests
    int[][]f = { {1,2,3}, {7,9,11} };
    int[][]g = { {1,4,7}, {21,0}, {}, {4,2,0,9} };
    System.out.println(arrayDeepToString(f));
    System.out.println(arrayDeepToString(g));
    System.out.println(arrayDeepToString(f).replace("), ","},\n "));
    */

    /* create2DArray Tests
    System.out.println(arrayDeepToString(create2DArray(5,4,4)));
    System.out.println(arrayDeepToString(create2DArray(6,2,3)));
    */

    /* create2DArrayRandomzied Tests
    System.out.println(arrayDeepToString(create2DArrayRandomzied(6,4,4)));
    System.out.println(arrayDeepToString(create2DArrayRandomzied(4,10,100)));
    */
  }

  public static void printLoop(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = i; j <= n; j++) {
        System.out.print(i);
      }
      System.out.println();
    }
  }

  public static String arrToString(int[] arr){
    if (arr.length == 0) {
      return "{}";
    }
    String converted = "{" + arr[0];
    for (int i = 1; i < arr.length; i++) {
      converted+= (", " + arr[i]);
    }
    converted+= "}";
    return converted;
  }

  public static String arrayDeepToString(int[][] arr) {
    String newStr = "{" + arrToString(arr[0]);
    for (int i = 1; i < arr.length; i++){
      newStr+=(", " + arrToString(arr[i]));
    }
    newStr+="}";
    return newStr;
  }

  public static int[][] create2DArray(int rows, int cols, int maxValue) {
    int[][]x = new int[rows][cols];
    for (int i = 0; i < rows; i++) {
      x[i] = new int[cols];
      for (int j = 0; j < x[i].length && j < maxValue; j++){
          x[i][j] = (int)(Math.random() * (maxValue + 1));
      }
    }
    return x;
  }

  public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue) {
    int[][]y = new int[rows][cols];
    for (int i = 0; i < rows; i++) {
      y[i] = new int[(int)(Math.random() * (cols + 1))];
      for (int j = 0; j < y[i].length && j < maxValue; j++) {
        y[i][j] = (int)(Math.random() * (maxValue + 1));
      }
    }
    return y;
  }

}
