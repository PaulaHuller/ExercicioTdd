import model.Veiculo;

public class Main {

    public static void main(String[] args) {
        Veiculo carro = new Veiculo();

        System.out.println("------------------------------");
        carro.abastecer(10);
        carro.abastecer(50);
        carro.abastecer(30);

        System.out.println("------------------------------");
        carro.setVelocidade(40);
        carro.frear();

        System.out.println("------------------------------");
        carro.pintar("amarela");

        System.out.println("------------------------------");
        System.out.println("testando com o carro deslidago");
        System.out.println("Retorno do sistema:");

        carro.ligar();

        System.out.println("------------------------------");
        System.out.println("testando com o carro já ligado");
        System.out.println("Retorno do sistema:");

        carro.ligar();

        System.out.println("------------------------------");
        carro.desligado();
        carro.frear();
        carro.frear();
        carro.desligado();
        carro.desligado();


    }
}
