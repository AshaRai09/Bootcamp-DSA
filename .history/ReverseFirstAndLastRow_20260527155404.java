public class ReverseFirstAndLastRow{
  public static void main(String args[]){
    int r= sc.nextInt();
    int c= sc.nextInt();
    int arr[][]= new int[r][c];
    for(int i=0 ; i<r ; i++){
      for(int j=0 ; j<c; j++){
         arr[i][j]= sc.nextInt();
      }
    }
    for(int i=0 ; i<r ; i+=2){
      for(int j=0 ; j<c; j++){
         arr[i][j]= -arr[i][j];
      }
    }
    for(int j=0 ; j<c ; j++){
      int top=0;
      int bottom =r-1;
      while(top<bottom){
        int temp= arr[top][j];
        arr[top][j]= arr[bottom][j];
        
      }
    }

  }
}