# 🏗️ Sistema de Gestão de Acessos: Factory e Builder 

Este projeto é uma demonstração prática de como combinar dois padrões de projeto criacionais do **GoF** para criar objetos complexos de forma organizada e segura.

O sistema simula o cadastro de diferentes perfis de usuários (Administrativo, Aluno, Professor e Público) em uma instituição, gerenciando permissões e horários de forma centralizada.

## 🎯 Objetivo do Projeto

Demonstrar a separação de responsabilidades:
1.  **Factory Method:** Decide *qual* tipo de objeto criar com base em uma entrada, aplicando regras de negócio (como horários padrão).
2.  **Builder Pattern:** Resolve o problema de construtores complexos, permitindo a criação de objetos `Pessoa` passo a passo e garantindo a imutabilidade.

---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java 17+
* **Paradigma:** Orientação a Objetos
* **Padrões de Projeto:** Factory Method e Builder

---

## 📐 Estrutura de Classes

O projeto utiliza uma estrutura onde a lógica de construção está encapsulada:

* **`Pessoa`**: A classe principal (Produto). Possui um `Builder` estático interno.
* **`PessoaFactory`**: A "fábrica" que recebe o tipo de perfil e utiliza o Builder para retornar a instância configurada com os horários e cargos corretos.

### Atributos Gerenciados:
* Nome
* Cargo (definido pela Factory)
* Matrícula
* Hora de Entrada (definido pela Factory)
* Hora de Saída (definido pela Factory)

---

## 🚀 Como testar

1. **Clone o repositório:**
   ```bash
   git clone [https://github.com/seu-usuario/seu-repositorio.git](https://github.com/seu-usuario/seu-repositorio.git)
2. **Compile o projeto**
   ```bash
   javac *.java

3. **Exexute a Main**
  ```bash
  java Main 
