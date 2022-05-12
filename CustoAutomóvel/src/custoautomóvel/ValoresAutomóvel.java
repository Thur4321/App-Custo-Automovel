package custoautomóvel;

import java.time.LocalDate;

public class ValoresAutomóvel {

    private String marca, modelo, cor, combustível;

    private float custo, venda;

    private int ano;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getCusto() {
        return custo;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCombustível() {
        return combustível;
    }

    public void setCombustível(String combustível) {
        this.combustível = combustível;
    }

    public ValoresAutomóvel(String marca, String modelo, String cor, String combustível, float custo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.combustível = combustível;
        this.custo = custo;
        this.ano = ano;
        venda();
    }

    public ValoresAutomóvel(String marca, String modelo, String cor, String combustível, float custo) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.combustível = combustível;
        this.custo = custo;
        this.ano = LocalDate.now().getYear();
        venda();

    }

    public String valores() {
        return "Marca: " + marca
                + "\nModelo: " + modelo
                + "\nAno: " + ano
                + "\nCor: " + cor
                + "\nPreço de custo: R$" + custo
                + "\nPreço de venda: R$" + venda;
    }

    private void venda() {
        if (combustível.equals("Gasolina")) {
            venda = custo + (custo * 5 / 100);
        } else if (combustível.equalsIgnoreCase("Álcool")) {
            venda = custo + (custo * 7 / 100);
        } else if (combustível.equalsIgnoreCase("Diesel")) {
            venda = custo + (custo * 15 / 100);
        } else if (combustível.equalsIgnoreCase("GNV")) {
            venda = custo + (custo * 3 / 100);
        } else if (combustível.equalsIgnoreCase("Flex")) {
            venda = custo + (custo * 10 / 100);
        }
    }

    public void reajuste(float percentual) {
        venda += venda * percentual / 100;
    }

}
