public class Main{
    public static void main(String[] args) {
        Veiculo v1 = new Carro("Renault", "Clio", 2019, "12-AB-45", 5);
        Veiculo v2 = new Mota("Ducati", "Panigale V4", 2025, "BC-33-BG", 1400, 2);
        Veiculo v3 = new Carrinha("Renault", "Scania", 2024, "JG-44-IU", 4, 600);
        Frota v4 = new Frota();
        v4.addVeiculo(v1);
        v4.addVeiculo(v2);
        v4.addVeiculo(v3);
        v4.mostrarFrota();
        v4.maisBarato(5);
        v4.listarPorTipo(Mota.class);

    }
}