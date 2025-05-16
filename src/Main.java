import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            String path = "data/documento.pdf";
            String content = Ingestor.readPDF(path);

            Indexer indexer = new Indexer();
            indexer.indexText(content);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite um termo para buscar:");
            String term = scanner.nextLine();
            List<Integer> result = indexer.search(term);

            if (result.isEmpty()) {
                System.out.println("Termo não encontrado.");
            } else {
                System.out.println("Termo encontrado nas linhas: " + result);
            }

        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}