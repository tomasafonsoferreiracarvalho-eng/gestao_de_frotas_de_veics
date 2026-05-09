# 🚗 Gestão de Frota de Veículos

Projeto desenvolvido em Java para praticar os conceitos de **Programação Orientada a Objetos (POO)**.

## 📋 Descrição

Sistema de gestão de uma frota de veículos que permite adicionar, listar e remover veículos, calcular custos de aluguer e filtrar por tipo.

## 🏗️ Estrutura do Projeto

```
src/
├── Alugavel.java       # Interface
├── Veiculo.java        # Classe abstrata
├── Carro.java          # Herda Veiculo
├── Mota.java           # Herda Veiculo
├── Carrinha.java       # Herda Veiculo
├── Frota.java          # Gere a lista de veículos
└── Main.java           # Ponto de entrada
```

## 🧠 Conceitos de POO Aplicados

| Conceito | Onde foi aplicado |
|---|---|
| **Interface** | `Alugavel` define o contrato `calcularCusto` e `getDescricao` |
| **Classe Abstrata** | `Veiculo` tem atributos comuns e força os filhos a implementar `calcularCusto` |
| **Herança** | `Carro`, `Mota` e `Carrinha` herdam de `Veiculo` |
| **Polimorfismo** | A `Frota` guarda `Veiculo` mas chama o `calcularCusto` correto de cada tipo |
| **Encapsulamento** | Todos os atributos são `private` com getters e setters |

## 💰 Tabela de Custos

| Tipo | Custo por dia |
|---|---|
| Carro | 40€ |
| Carrinha | 60€ |
| Mota | 25€ |

## ⚙️ Funcionalidades

- ✅ Adicionar veículos à frota
- ✅ Listar todos os veículos
- ✅ Remover veículo por matrícula
- ✅ Encontrar o veículo mais barato para X dias
- ✅ Filtrar veículos por tipo (Carro, Mota, Carrinha)

## 🚀 Como Correr

1. Clona o repositório
```bash
git clone https://github.com/o-teu-username/gestao-frota-veiculos.git
```

2. Abre o projeto no IntelliJ IDEA ou qualquer IDE Java

3. Corre o ficheiro `Main.java`

## 📤 Exemplo de Output

```
---->Frota de Veiculos<----
Marca: Renault | Modelo: Clio (2019) | Lugares: 5 | Matricula: 12-AB-45
Marca: Ducati | Modelo: Panigale V4 (2025) | Lugares: 2 | Matricula: BC-33-BG | Cilindrada: 1400
Marca: Renault | Modelo: Scania (2024) | Lugares: 4 | Matricula: JG-44-IU | Capacidade de carga: 600.0 Kg

---->Veiculo atual mais barato<----
Marca: Ducati | Modelo: Panigale V4 (2025) | Lugares: 2 | Matricula: BC-33-BG | Cilindrada: 1400

---->Lista de veiculos da class Mota<----
Marca: Ducati | Modelo: Panigale V4 (2025) | Lugares: 2 | Matricula: BC-33-BG | Cilindrada: 1400
```

## 🛠️ Tecnologias

- Java 17+
- IntelliJ IDEA
