class Patternleftalp{
  public static void main (String args[]){
    int i,j;
    int alp=65; 
    for (i=6-1;i>=1;i--){
      
    
    for(j=1;j<=i;j++){
     System.out.print((char) (alp+j)+" ");
    }
      System.out.println( );
    }
  }
}