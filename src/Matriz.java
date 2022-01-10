public class Matriz {
        public static void main(String[] args) {

            int primera_matriz[][] = new int[3][3];
            int segunda_matriz[][] = new int[3][3];
            int resultado[][] = new int[3][3];

            //primer matriz
            for (int i = 0; i < primera_matriz.length; i++) {
                for (int j = 0; j < primera_matriz.length; j++) {
                    primera_matriz[i][j] = (int) (Math.random() * 5);
                }
            }
            for (int i = 0; i < segunda_matriz.length; i++) {
                for (int j = 0; j < segunda_matriz.length; j++) {
                    segunda_matriz[i][j] = (int) (Math.random() * 5);
                }
            }
            for (int i = 0; i < primera_matriz.length; i++) {
                for (int j = 0; j < segunda_matriz.length; j++) {
                    resultado[i][j] = primera_matriz[i][j] +segunda_matriz[i][j];
                }
            }
            for(int i= 0 ;i < primera_matriz.length; i++){

                for(int j=0; j < primera_matriz.length; j++){
                    System.out.print("["+ primera_matriz[i][j] +"]");
                }
                if(i == 1) {
                    System.out.print("   +   ");
                } else{
                    System.out.print("      ");
                }

                for(int j=0; j < segunda_matriz.length; j++){
                    System.out.print("["+ segunda_matriz[i][j] +"]");
                }

                if(i == 1) {
                    System.out.print("   =   ");
                } else{
                    System.out.print("      ");
                }
                for(int j=0; j < resultado.length; j++){
                    System.out.print("["+ resultado[i][j] +"]");
                }

                System.out.println("");
            }
        }
}
