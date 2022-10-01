package model;

public class Veiculo {
    String marca;
    String modelo;
    String placa;
    String cor;
    double km;
    boolean isLigado;
    int litroCombustivel;
    int velocidade;
    double preco;

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

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public boolean isLigado() {
        return isLigado;
    }

    public void setLigado(boolean ligado) {
        isLigado = ligado;
    }

    public int getLitroCombustivel() {
        return litroCombustivel;
    }

    public void setLitroCombustivel(int litroCombustivel) {
        this.litroCombustivel = litroCombustivel;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void acelerar() {
         setVelocidade (getVelocidade() +20);
    }

    public int abastecer(int combustivel) {
        if (litroCombustivel == 60) {
            System.out.println("Desculpe, seu tanque está cheio!!!");
        } else if (litroCombustivel + combustivel > 60) {
            double faltaParaCompletar = 60 - litroCombustivel;
            System.out.println("A capacidade maxima do seu tanque é 60 litros. Você pode abastecer: " + faltaParaCompletar);
        } else {
            System.out.println("Você abasteceu com sucesso");
            litroCombustivel += combustivel;
        }

        return litroCombustivel;
    }

    public int frear() {
        if (velocidade < 20) {
            System.out.println("Sua velocidade é " + velocidade + "km/h, você não pode diminuir no momento. Tente aumentar à velocidade antes!!!");
        } else if (velocidade == 0) {
            System.out.println("Seu veiculo parou!!!");
        }else{
            velocidade -= 20;
            System.out.println("Seu carro está à " + velocidade + " km/h.");
        }
        return 0;
    }

    public String pintar(String cor){
        this.cor = cor;
        System.out.println("Pronto! Seu carro foi pintado de " + cor );
        return cor;
    }

    public boolean ligar(){
        if(isLigado == true ){
            System.out.println("Você não pode ligar um carro já ligado");
        } else {
            isLigado = true;
            System.out.println("Pronto! Agora seu carro está ligado");
        }

        return isLigado;
    }

    public boolean desligado(){
        if(isLigado == false){
            System.out.println("Você não pode desligar um carro já desligado");
        } else if ( isLigado == true && velocidade != 0){
            System.out.println("Você não pode desligar o carro em movimento!");
        } else{
            isLigado = false;
            System.out.println("Seu carro foi desligado");
        }
        return isLigado;
    }

	
}
