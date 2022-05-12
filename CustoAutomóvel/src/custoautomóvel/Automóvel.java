package custoautomóvel;

import javax.swing.JOptionPane;

public class Automóvel {

    public static void main(String[] args) {

        String combustíveis[] = {"Gasolina", "Álcool", "Diesel", "GNV", "Flex"};

        String operações[] = {"Cadastrar automóvel", "Listar informações", "Reajustar preço de venda", "Sair"};

        ValoresAutomóvel objValores = null;

        String opçãoUser = "";

        while (!opçãoUser.equals(operações[3])) {
            opçãoUser = (String) JOptionPane.showInputDialog(null, "Selecione a operação desejada:", "Automóvel", 3, null, operações, operações[0]);

            switch (opçãoUser) {
                case "Cadastrar automóvel":

                    String marca = JOptionPane.showInputDialog(null, "Informe a marca do seu carro:", "Automóvel", 3);

                    String modelo = JOptionPane.showInputDialog(null, "Informe o modelo:", "Automóvel", 3);

                    String cor = JOptionPane.showInputDialog(null, "Informe a cor:", "Automóvel", 3);

                    String combustível = (String) JOptionPane.showInputDialog(null, "Escolha o combustível:", "Automóvel", 3, null, combustíveis, combustíveis[0]);

                    float custo = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o custo de seu carro (sem 'R$' e decimais depois de ponto):", "Automóvel", 3));
                    
                    int novo = JOptionPane.showConfirmDialog(null,"Seu automóvel é 0KM?","Automóvel",JOptionPane.YES_NO_OPTION,3);

                    if (novo == 0){
                        objValores = new ValoresAutomóvel(marca, modelo, cor, combustível, custo);
                    }
                    else{
                        int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ano:", "Automóvel", 3));
                        objValores = new ValoresAutomóvel(marca, modelo, cor, combustível, custo, ano);
                    }
                    JOptionPane.showMessageDialog(null, "Auomóvel cadastrado com sucesso.", "Automóvel", 1);
                    
                break;
                case "Listar informações":
                    
                    if(objValores!=null){
                        JOptionPane.showMessageDialog(null, "As informações do seu automóvel são:\n" + objValores.valores(), "Automóvel", 1);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Cadastre um automóvel primeiro", "Automóvel", 1);
                    }

                break;
                case "Reajustar preço de venda":
                    
                    if(objValores!=null){
                    float percentual = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe seu reajuste:", "Automóvel", 3));
                    objValores.reajuste(percentual);
                    }
                    
                    else{
                        JOptionPane.showMessageDialog(null, "Cadastre um automóvel primeiro", "Automóvel", 1);
                    }

                break;
            }
        }

        System.exit(0);

    }

}
