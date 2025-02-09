class Solution{
	int sumDiagonal(int N, int [][] M) {
		 int sum=0;
		 for(int i=0; i<N; i++){
		     for(int j=0; j<N; j++){
		         if(i==j){
		             sum+=M[i][j];
		         }
		     }
		 }
		 return sum;
	}
