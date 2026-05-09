public class Carro extends Veiculo{
    private int lugares;
    public Carro(String marca, String modelo, int ano, String matricula, int lugares){
        super(marca, modelo, ano, matricula);
        this.lugares = lugares;
    }
    public double calcularCusto(int dias){
        return dias * 40;
    }

    public int getLugares(){
        return this.lugares;
    }
    public void setLugares(int lugares){
        this.lugares = lugares;
    }


    @Override
    public String toString(){
        return "Marca: " + getMarca() + " | Modelo: " + getModelo() + " (" + getAno() + ")" + " | Lugares: " + this.lugares + " | Matricula: " + getMatricula();
    }

}
