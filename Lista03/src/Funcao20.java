
public class Funcao20 {

	public static int[] ShortenVector(int SizeVector, int vector[], int vectorMatrix[][]) {
		int sizeVector = vector.length;
		//int vectorMatrix[][] = new int[sizeVector][sizeVector];
		
		for(int i=0; i<sizeVector; i++) {
			System.out.print(i+" ");
			for(int j=0; j<(sizeVector-i); j++) {
				System.out.print(vector[j]);
				vectorMatrix[i][j]=vector[j];
			}
			System.out.println();
		}
		
		int reducedVector[] = new int[1];
		reducedVector[0] = vectorMatrix[(sizeVector-1)][0];
		
		return reducedVector;
	}
	
	public static void main(String[] args) {
		
		int reducedVector[] = new int[5];
		reducedVector.clone();

	}

}
