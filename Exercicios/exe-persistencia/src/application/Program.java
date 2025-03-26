package application;

import entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Product> products = new ArrayList<>();

        String path = "/home/pedrofonseca/Documentos/Curso Java POO/Exercicios/exe-persistencia/src/input.csv";
        File file = new File(path);

        String parent = file.getParent();
        boolean createFolder = new File(parent + "/out").mkdir(); // criando novo diretorio
        System.out.println("Diretório criado? " + createFolder);

        String targetFile = parent + "/out/summary.csv"; // arquivo de destino

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                // enquanto o leitor de linhas do arquivo não retornar nulo o laço continua
                String[] values = line.split(",");
                String name = values[0];
                double price = Double.parseDouble(values[1]);
                int quantity = Integer.parseInt(values[2]);
                products.add(new Product(name, price, quantity));
            }
            System.out.println("Leitura realizada!");

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile))) {
                for (Product product : products) {
                    bw.write(product.getName() + "," + String.format("%.2f", product.total())); // escreve a linha no arquivo
                    bw.newLine(); // passa para a prox linha
                }
                System.out.println("Escrita realizada no novo arquivo!");
            }
            catch (IOException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
