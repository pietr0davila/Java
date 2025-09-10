public class Main {
    public static void main(String[] args) {
        int[][] notas = {
            {4, 7, 9},  
            {7, 3, 8},  
            {9, 1, 7}  
        };

        System.out.println("Notas dos Alunos e Médias:");
        for (int i = 0; i < notas.length; i++) {
            int soma = 0;
            System.out.print("Aluno " + (i + 1) + ": ");
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + " ");
                soma += notas[i][j];
            }
            double media = (double) soma / notas[i].length;
            System.out.printf("\t\t\t Média: %.2f%n", media);
        }
    }
}