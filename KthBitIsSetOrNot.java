//Check Kth Bit is Set or not
class KthBitIsSetOrNot{
  void kthBitIsSetOrNot(int n,int k){
    int x=(n>>(k-1));
    if((x&1)!=0){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    } 
  }
  public static void main(String[] args){
    KthBitIsSetOrNot K = new KthBitIsSetOrNot();
    K.kthBitIsSetOrNot(5,3);
  }
}
