import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        // 1. Declaração de Variáveis
        String nomeProduto;
        double precoUnitario;
        int quantidadeComprada;
        double taxaImposto;
        double margemLucro;

        // 2. Atribuição de Valores
        nomeProduto = "Laptop"; // Exemplo de nome do produto
        precoUnitario = 2500.00; // Exemplo de preço unitário em reais
        quantidadeComprada = 3; // Exemplo de quantidade comprada
        taxaImposto = 0.15; // Exemplo de taxa de imposto (15%)
        margemLucro = 0.20; // Exemplo de margem de lucro desejada (20%)

        // 3. Operações Simples
        double valorTotalSemImpostos = precoUnitario * quantidadeComprada; // Valor total sem impostos
        double valorImposto = valorTotalSemImpostos * taxaImposto; // Valor do imposto
        double valorTotalComImpostos = valorTotalSemImpostos + valorImposto; // Valor total com impostos

        double precoVendaNecessario = valorTotalComImpostos * (1 + margemLucro); // Preço de venda necessário

        // 4. Desafio Extra
        DecimalFormat formatoMoeda = new DecimalFormat("R$ #,##0.00"); // Formatação de moeda
        double precoVendaArredondado = Math.round(precoVendaNecessario * 100.0) / 100.0; // Arredondar preço de venda

        // Mensagem final formatada
        String mensagemFinal = String.format(
                "Produto: %s\n" +
                        "Valor Total com Impostos: %s\n" +
                        "Preço de Venda Sugerido: %s",
                nomeProduto,
                formatoMoeda.format(valorTotalComImpostos),
                formatoMoeda.format(precoVendaArredondado)
        );

        // 5. Exibição de Resultados
        System.out.println("Nome do Produto: " + nomeProduto);
        System.out.println("Preço Unitário: " + formatoMoeda.format(precoUnitario));
        System.out.println("Quantidade Comprada: " + quantidadeComprada);
        System.out.println("Taxa de Imposto: " + (taxaImposto * 100) + "%");
        System.out.println("Margem de Lucro: " + (margemLucro * 100) + "%");
        System.out.println("Valor Total Sem Impostos: " + formatoMoeda.format(valorTotalSemImpostos));
        System.out.println("Valor do Imposto: " + formatoMoeda.format(valorImposto));
        System.out.println("Valor Total com Impostos: " + formatoMoeda.format(valorTotalComImpostos));
        System.out.println("Preço de Venda Necessário: " + formatoMoeda.format(precoVendaArredondado));
        System.out.println(mensagemFinal);
    }
}
