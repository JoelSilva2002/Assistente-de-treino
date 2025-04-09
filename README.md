# 🏋️ Assistente de Treino

API REST em Java (Spring Boot) para ajudar no controle de treinos, com sugestões automáticas para aumento de **peso** ou **repetições** com base no desempenho do usuário.

---

## 🚀 Funcionalidades

- ✅ Cadastrar exercício com nome, peso e número de repetições.
- 📈 Avaliação automática se deve aumentar peso ou repetições.
- 📚 Consulta do histórico de treinos por nome de exercício.

---

## 🛠️ Tecnologias

- Java 21
- Spring Boot
- Maven
- Spring Data JPA
- Banco de dados H2 (em memória, para testes)
- HTTPie (para testes via terminal)

---

## 📦 Como rodar o projeto

1. Clone o repositório:

git clone https://github.com/JoelSilva2002/Assistente-de-treino.git
cd Assistente-de-treino
Compile e execute com Maven:



./mvnw spring-boot:run
A API ficará disponível em http://localhost:8080

🧪 Exemplos de uso com HTTPie
➕ Adicionar novo exercício

http POST :8080/api/exercicios nome="Supino Reto" peso:=40 repeticoes:=13
📚 Consultar histórico por nome


http GET :8080/api/exercicios/historico/"Supino Reto"
📋 Listar todos os exercícios cadastrados


http GET :8080/api/exercicios

📂 Estrutura do Projeto

src
├── controller    # Endpoints REST
├── service       # Lógica de negócio
├── repository    # Integração com banco de dados
├── model         # Entidades (Exercicio)
📌 Observações
Banco de dados em memória (H2), reiniciado a cada execução.

A recomendação de treino considera se o exercício teve + de 12 repetições:

12 repetições = sugerir aumentar o peso

≤12 repetições = sugerir aumentar as repetições
