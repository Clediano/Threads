package br.edu.unoesc;

public class Corrida {
    public void iniciarCorrida() {
        Veiculo dickVigaristaMuttley = new Veiculo(this.geradorDeVelocidade(), "Dick Vigarista & Muttley");
        Veiculo IrmaosRocha = new Veiculo(this.geradorDeVelocidade(), "Irmãos Rocha");
        Veiculo CupeMalAssombrado = new Veiculo(this.geradorDeVelocidade(), "Cupê Mal-Assombrado");
        Veiculo ProfessorAereo = new Veiculo(this.geradorDeVelocidade(), "Professor Aéreo");
        Veiculo BaraoVermelho = new Veiculo(this.geradorDeVelocidade(), "Barão Vermelho");
        Veiculo PenelopeCharmosa = new Veiculo(this.geradorDeVelocidade(), "Penélope Charmosa");
        Veiculo CarroTanque = new Veiculo(this.geradorDeVelocidade(), "Carro Tanque");
        Veiculo QuadrilhaDeMorte = new Veiculo(this.geradorDeVelocidade(), "Quadrilha de Morte");
        Veiculo PeterPerfeito = new Veiculo(this.geradorDeVelocidade(), "Peter Perfeito");
        Veiculo RufusLenhador = new Veiculo(this.geradorDeVelocidade(), "Rufus Lenhador");

        new Thread(dickVigaristaMuttley).start();
        new Thread(IrmaosRocha).start();
        new Thread(CupeMalAssombrado).start();
        new Thread(ProfessorAereo).start();
        new Thread(BaraoVermelho).start();
        new Thread(PenelopeCharmosa).start();
        new Thread(CarroTanque).start();
        new Thread(QuadrilhaDeMorte).start();
        new Thread(PeterPerfeito).start();
        new Thread(RufusLenhador).start();
    }

    private long geradorDeVelocidade() {
        for (; ; ) {
            long velocidade = Math.round(Math.random() * 100);

            if (velocidade > 1)
                return velocidade;
        }
    }
}
