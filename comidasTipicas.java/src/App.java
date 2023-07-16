import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String comidaTipica = JOptionPane.showInputDialog(null, "Digite uma comida tipica");
        String nomeImagem = "";
        String origem = "";

        switch (comidaTipica) {
            case "feijoada":   
            origem = """
                Escravos:
                Historia:  Segundo a lenda popular mais difundida sobre 
                a origem da feijoada, é que os senhores forneciam a seus escravos 
                os restos dos porcos, quando estes eram preparado. O cozimento 
                desses restos, com o feijão e agua, teria feito nascer a receita.
                """;      
            nomeImagem = "feijoada-icone";
            break;

            case "brigadeiro":
            origem = """
                São Paulo:
                Descrição: O nome foi uma homenagem ao brigadeiro Euardo Gomes, 
                é um doce tipico da culinaria brasileira, 
                que se tornou comum em todo o país, sempre presente em festas.
            """;
            nomeImagem = "brigadeiro";
            break;

            case "coxinha":
            origem = """
                São Paulo:
                Descrição: A coxinha e um salgado brasileiro, de origem paulista
                foi desenvolvida durante a industrialização de Sao Paulo, 
                para ser comercializada como subistituto a tradicionais 
                coxas de galinha, que eram vendidas nas portas das fábricas.
                """;
            nomeImagem = "coxinha";
            break;

            case "acaraje":   
            origem = """
                Bahia:
                Descrição: O acaraje é um prato tipico da culinaria baiana e um 
                dos principais produtos vendidos no tabuleiro da baiana.
                Ingredientes: Bolo de feijão frito no azeite de dendé,
                e recheado com vatapá, caruru, camarão refogado e pimenta. 
                """;
            nomeImagem = "acaraje";
            break;

            case "baiao de dois":
            origem = """
                Nordeste:
                Descrição: A origem do nome baião de dois tem relação com o baião,
                dança tipica do nordeste do Brasil, sendo que o numero dois
                refere-se combinação que e a base do prato, o arroz com feijão.
                Ingredientes: arroz, feijão, carne seca, calabresa e queijo coalho.
                """;
            nomeImagem = "baiaoDe2";
            break;

            default:
            origem = "outro";
            nomeImagem = "default";
            break;

        }

        String caminhoImagem = String.format("/home/leoni/Área de Trabalho/comidas-Brasil/comidasTipicas.java/src/imagens/%s.jpeg", 
            nomeImagem
            );
        ImageIcon icone = new ImageIcon(caminhoImagem);
        // /home/leoni/Área de Trabalho/comidas-Brasil/comidasTipicas.java/src/imagens/acaraje.jpeg
        String informacoesComidaTipica = String.format(
            "comidaTipica: %s\norigem: %s", comidaTipica, origem
            );
        JOptionPane.showConfirmDialog(
            null, informacoesComidaTipica, "Descrição", 
            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, icone
            );
        
    }
}
