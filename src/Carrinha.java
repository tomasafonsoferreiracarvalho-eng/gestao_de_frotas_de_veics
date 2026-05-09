public class Carrinha extends Veiculo{
    private int lugares;
    private double capacidadecarga;

    public Carrinha(String marca, String modelo, int ano, String matricula, int lugares, double capacidadecarga){
        super(marca, modelo, ano, matricula);
        this.lugares = lugares;
        this.capacidadecarga = capacidadecarga;
    }

    public double calcularCusto(int dias){
        return dias * 60;
    }

    public int getLugares(){
        return lugares;
    }
    public void setLugares(int lugares){
        this.lugares = lugares;
    }
    public double getCapacidadecarga(){
        return capacidadecarga;
    }
    public void setCapacidadecarga(double capacidadecarga){
        this.capacidadecarga = capacidadecarga;
    }

    @Override
    public String toString(){
        return "Marca: " + getMarca() + " | Modelo: " + getModelo() + " (" + getAno() + ")" + " | Lugares: " + this.lugares + " | Matricula: " + getMatricula() + " | Capacidade de carga: "+ this.capacidadecarga + " Kg";
    }

}
