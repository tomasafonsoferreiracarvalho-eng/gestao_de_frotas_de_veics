import java.util.ArrayList;
public class Frota {
    private ArrayList<Veiculo> veiculos;
    public Frota(){
        this.veiculos = new ArrayList<>();
    }
    public void addVeiculo(Veiculo v){
        this.veiculos.add(v);
    }
    public void mostrarFrota(){
        System.out.println("---->Frota de Veiculos<----");
        for(int i = 0; i < this.veiculos.size(); i++){
            System.out.println(this.veiculos.get(i));
        }
    }

    public void removerVeiculo(String matricula){
        for (int i = 0; i < this.veiculos.size(); i++) {
            if (this.veiculos.get(i).getMatricula().equals(matricula)) {
                this.veiculos.remove(i);
            }
        }
    }

    public Veiculo maisBarato(int dias){
        double first = this.veiculos.get(0).calcularCusto(dias);
        Veiculo maisBarato = this.veiculos.get(0);
        for (int i = 0; i < this.veiculos.size(); i++){
            if(this.veiculos.get(i).calcularCusto(dias) < first){
                maisBarato = this.veiculos.get(i);  // este passa a ser o mais barato
                first = this.veiculos.get(i).calcularCusto(dias);  // atualiza o custo
            }
        }
        System.out.println("\n---->Veiculo atual mais barato<----\n" + maisBarato + "\n");
        return maisBarato;
    }

    public void listarPorTipo(Class<?> tipo){
        System.out.println("---->Lista de veiculos da class " + tipo.getSimpleName() + "<----");
        for (int i = 0; i < this.veiculos.size(); i++){
            if (tipo.equals(this.veiculos.get(i).getClass())){
                System.out.println(this.veiculos.get(i));
            }
        }
    }
}
