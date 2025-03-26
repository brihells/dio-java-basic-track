# **README - Projeto ContaTerminal**  

Bem-vindo ao **ContaTerminal**, um programa simples em Java que simula a criação de uma conta bancária via terminal!  

## **📌 Descrição**  
Este projeto permite que um usuário crie uma conta bancária fornecendo:  
✅ **Nome completo**  
✅ **Número da conta**  
✅ **Agência**  
✅ **Saldo inicial**  

Ao final, o sistema exibe uma mensagem personalizada com os dados cadastrados.  

---

## **🚀 Como Executar**  
1. **Pré-requisitos**:  
   - Java JDK 8+ instalado.  
   - IDE (VSCode, IntelliJ, Eclipse) ou terminal.  

2. **Compilar e Executar**:  
   ```bash
   javac ContaTerminal.java
   java ContaTerminal
   ```  

3. **Siga as instruções no terminal**:  
   ```plaintext
   Bem vindo ao Seu Nosso Banco!!
   Para criar sua conta digite o seu Nome Completo: 
   [Digite seu nome]
   Por favor digite seu numero de conta:
   [Digite o número]
   Agora sua agencia, por favor:
   [Digite a agência]
   Qual seu saldo atual?
   [Digite o saldo]
   ```  

---

## **🛠️ Funcionalidades**  
✔ **Validação de entrada**:  
   - Usa `Scanner` para ler dados do terminal.  
   - Trata números (`int`, `double`) e texto (`String`).  

✔ **Mensagem personalizada**:  
   ```plaintext
   Olá, [Nome] obrigado por criar uma conta em nosso banco!!
   Sua agencia é: [Agência]
   Sua conta: [Conta]
   Seu saldo atual: [Saldo] já está disponível para saque.
   ```  

✔ **Internacionalização**:  
   - Usa `Locale.US` para garantir que números decimais usem ponto (ex: `100.50`).  

---

## **📝 Exemplo de Uso**  
**Entrada:**  
```plaintext
Bem vindo ao Seu Nosso Banco!!
Para criar sua conta digite o seu Nome Completo: 
MARIO ANDRADE
Por favor digite seu numero de conta:
1021
Agora sua agencia, por favor. 
067-8
Qual seu saldo atual? 
237.48
```  

**Saída:**  
```plaintext
Olá, MARIO ANDRADE obrigado por criar uma conta em nosso banco!!
Sua agencia é: 067-8
Sua conta: 1021
Seu saldo atual: 237.48 já está disponível para saque.
```  

---

## **🔧 Possíveis Melhorias**  
- Validar se o número da conta/agência tem o formato correto.  
- Permitir operações bancárias (saque, depósito).  
- Salvar os dados em um arquivo.  

---

## **📚 Tecnologias Utilizadas**  
- Java (JDK)  
- `java.util.Scanner` para input.  
- `java.util.Locale` para formatar números.  

---

**✨ Dúvidas?** Abra uma *issue* ou me chame no GitHub!  

--- 

Feito com ❤️ por Gabriel Miranda/brihells 👋
