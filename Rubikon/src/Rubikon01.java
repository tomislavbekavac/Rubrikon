import javax.swing.JOptionPane;

public class Rubikon01 {

	public static void main(String[] args) {


			int a=Integer.parseInt(JOptionPane.showInputDialog("broj redka"));
			int b=Integer.parseInt(JOptionPane.showInputDialog("broj stupca"));
			
			int[] [] tablica = new int [a] [b];
			
			int minStup = 0;
			int maxStup = b-1;
			int minRed = 0;
			int maxRed = a-1;
			
			int broj=1;
			
			while(broj<=(a*b)) {
				for(int i = maxStup; i >= minStup; i-- ) {
					tablica[maxRed][i] = broj++;
					
				}
				if(broj>(a*b)) {
					break;
				}
				for (int i = maxRed-1; i >= minRed; i--){
					tablica[i][minStup] = broj++;
				}
				if(broj>(a*b)) {
					break;
				}
				for (int i = minStup+1; i <= maxStup; i++) {
					tablica[minRed][i] = broj++;
				}
				if(broj>(a*b)) {
					break;
				}
				for (int i= minRed+1; i <= maxRed-1; i++) {
					tablica[i][maxStup] = broj++;
				}
				if(broj>(a*b))	{
					break;
				}
				
				minStup++;
				minRed++;
				maxStup--;
				maxRed--;
			}
			
			for(int i=0;i<a;i++) {
				for(int j=0;j<b;j++) {
					System.out.println(tablica[i][j]+ "  ");
				}
				System.out.println();
			}
	}

}
