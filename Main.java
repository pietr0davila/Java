import java.util.Scanner;
import strings.Strings;
import static utils.Print.printMsg; 

public class Main {
    static int pontos = 0;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] perguntas = Strings.Perguntas();
        String[] alternativas = Strings.Alternativas();
        char[] respostasCorretas = Strings.respostas();

        printMsg("QUIZ DE CONHECIMENTOS GERAIS");
        
        for (int i = 0; i < perguntas.length; i++) {
            String resposta;
            boolean respostaValida;

            do {
                printMsg(perguntas[i]);
                printMsg(alternativas[i]);
                printMsg("Sua resposta (A, B, C ou D): ", false);
                resposta = scanner.nextLine().toUpperCase();

                respostaValida = resposta.length() == 1 && "ABCD".contains(resposta);

                if (!respostaValida) {
                    printMsg("⚠️ Resposta inválida! Digite apenas A, B, C ou D.\n");
                }

            } while (!respostaValida);

            if (resposta.charAt(0) == respostasCorretas[i]) {
                printMsg("✅ Correto!\n");
                pontos++;
            } else {
                printMsg("❌ Errado! Resposta correta: " + respostasCorretas[i] + "\n");
            }
        }
            float acertos = calcPorcent();    
            printMsg("Você acertou " + pontos + " de 20 perguntas.");
            printMsg("Sua porcentagem de acertos é de " + acertos);
            scanner.close();
        }

    public static float calcPorcent() {
        int perguntasLength = Strings.Perguntas().length;
        float percentual = (pontos * 100) / perguntasLength;
        return percentual;
    }
}