package br.edu.unoesc;

public class Veiculo implements Runnable {

    private long velocidade;
    private String nomeCarro;

    public Veiculo(long velocidade, String nomeCarro) {
        this.velocidade = velocidade;
        this.nomeCarro = nomeCarro;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.currentThread().sleep((100 - velocidade));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //System.out.println("Carro " + nomeCarro.toUpperCase() + " está va volta " + i);
        }
        System.out.println(nomeCarro.toUpperCase() + " terminou a corrida com velocidade máxima de " + velocidade + "Km/h.");
    }
}
