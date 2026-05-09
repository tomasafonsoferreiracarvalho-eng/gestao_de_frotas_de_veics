public class Mota extends Veiculo{
    private  int cilindrada;
    private int lugares;
    public Mota(String marca, String modelo, int ano, String matricula,  int cilindrada, int lugares){
        super(marca, modelo, ano, matricula);
        this.cilindrada = cilindrada;
        this.lugares = lugares;
    }

    public int getCilindrada() {
        return cilindrada;
    }
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getLugares(){
        return lugares;
    }
    public void setLugares(int lugares){
        this.lugares = lugares;
    }
    @Override
    public String toString(){
        return "Marca: " + getMarca() + " | Modelo: " + getModelo() + " (" + getAno() + ")" + " | Lugares: " + this.lugares + " | Matricula: " + getMatricula() + " | Cilindrada: " + getCilindrada();
    }

    public double calcularCusto(int dias) {
        return dias * 25;
    }
}
