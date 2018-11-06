public class ArrayMethods{
  public static int rowSum(int[][] ary, int x){
    int sum = 0;
    if (x >= ary.length){
      x = 0;
    }
    if (x < 0){
      x = 0;
    }
    for (int c = 0; c < ary[x].length; c ++){
      sum = sum + ary[x][c];
    }
    return sum;
  }
  public static int columnSum (int[][] ary, int x){
    int sum = 0;
    if (x < 0){
      x = 0;
    }
    for (int c = 0; c < ary.length; c ++){
      if (x < ary[c].length){
        sum = sum + ary[c][x];
      }
    }
    return sum;
  }
  public static int[] allRowSums(int[][] ary){
    int ans[];
    ans = new int[ary.length];
    for (int c = 0; c < ary.length; c++){
      ans[c] = rowSum(ary, c);
    }
    return ans;
  }
  public static int[] allColSums(int[][] ary){
    int ans[];
    int big = 0;
    int where = 0;
    for (int i =0; i < ary.length; i ++){
      if (ary[i].length > big){
        where = i;
        big = ary[i].length;
      }
    }
    ans = new int[big];
    for (int c = 0; c < ary[where].length; c++){
      ans[c] = columnSum(ary, c);
    }
    return ans;
  }
  public static boolean isRowMagic(int[][] ary){
    boolean ans = true;
    for (int c = 1; c < allRowSums(ary).length; c++){
      if (allRowSums(ary)[c] != allRowSums(ary)[c - 1]){
        ans = false;
      }
    }
    return ans;
  }
  public static boolean isColumnMagic(int[][] ary){
    boolean ans = true;
    for (int c = 0; c < allColSums(ary).length -1 ; c++){
      if (allColSums(ary)[c] != allColSums(ary)[c + 1]){
        ans = false;
      }
    }
    return ans;
  }

}
