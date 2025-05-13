package polimorfismo12.veiculo;

import javax.swing.JOptionPane;

public class Cadastrar {
        public static void main(String[] args) {
        int p = 0;
        while (p != 4) {
            p = Integer.parseInt(JOptionPane.showInputDialog("Qual veículo você quer cadastrar?\n1- Bicicleta\n2- Automóvel\n3-Camihão\n4- Sair"));

            if (p == 4) {
                System.out.println("Saindo!");
                break;
            }
            if (p!=1&&p!=2&&p!=3){
                System.out.println("Opção inválida!");
                continue;
            }

            int cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do veículo"));
            String desc = JOptionPane.showInputDialog("Digite a descrição do veículo");
            String marca = JOptionPane.showInputDialog("Digite a marca do veículo");
            String modelo = JOptionPane.showInputDialog("Digite o modelo do veículo");
            String cor = JOptionPane.showInputDialog("Digite a cor do veículo");
            int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do veículo"));
            float tam = Float.parseFloat(JOptionPane.showInputDialog("Digite o tamanho do veículo"));
            float peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso do veículo"));      

            Veiculo veiculoEscolhido = null;

            switch (p) {
                case 1:
                    int rodas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de rodas do veículo")); 
                    Bicicleta bicicleta =  new Bicicleta(cod, desc, marca, modelo, cor, ano, tam, peso, rodas);
                    bicicleta.dados("bicicleta");
                    bicicleta.dadosBicicleta();
                    veiculoEscolhido = bicicleta;
                    break;
                case 2:
                    String combustivel = JOptionPane.showInputDialog("Digite o tipo do combustivel do veículo");
                    Automovel automovel =  new Automovel(cod, desc, marca, modelo, cor, ano, tam, peso, combustivel);
                    automovel.dados("automóvel");
                    automovel.dadosAutomovel();
                    veiculoEscolhido = automovel;
                    break;
                case 3:
                    String classificacao = JOptionPane.showInputDialog("Digite a do classificacao do veículo");
                    Caminhao caminhao =  new Caminhao(cod, desc, marca, modelo, cor, ano, tam, peso, classificacao);
                    caminhao.dados("caminhao");
                    caminhao.dadosCaminhao();
                    veiculoEscolhido = caminhao;
                    break;
            }  
            System.out.println("\nIniciando os serviços para o veículo escolhido...");
            Oficina oficina = new Oficina();
            oficina.realizarServico(veiculoEscolhido);  
        }
    }
}
