public abstract class Veiculo implements Alugavel {
    private String marca;
    private String modelo;
    private int ano;

    private String matricula;
    public Veiculo(String marca, String modelo, int ano, String matricula){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.matricula = matricula;
    }
    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public int getAno(){
        return this.ano;
    }

    public String getMatricula(){
        return this.matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public abstract double calcularCusto(int dias);

    @Override
    public String toString(){
        return "Marca: " + marca + " | Modelo: " + modelo + " (" + ano + ")" + " | Matricula: " + matricula;
    }

    public String getDescricao(){
        return toString();
    }
}
