# Lista 03 - Exercícios em Java

Esta pasta contém a resolução dos exercícios da terceira listagem em Java, desenvolvidos para praticar conceitos de Programação Orientada a Objetos.

## Exercícios

<details>
<summary><strong>Exercício 01</strong></summary>

Validador de Cadastro de Funcionário: Criar uma classe `Funcionario` com `nome`, `cpf` e `salario`. O construtor deve impedir a criação do objeto se o nome for nulo/vazio ou se o salario for menor que o salário mínimo atual.

**Regra:**
- Se os dados forem inválidos, o programa deve exibir uma mensagem de erro e não atribuir os valores (simulando uma barreira de segurança).

Para usar, basta executar a classe `Cadastro` e preencher no terminal os dados pedidos do funcionário.  
Ao final, o programa retorna as informações cadastradas ou informa que os dados são inválidos.

**Arquivos:**
- `Cadastro.java`
- `Funcionario.java`

</details>

<details>
<summary><strong>Exercício 02</strong></summary>

Gestão de Reservas com Proteção de Estado: Classe `Reserva`. Atributos: `numeroQuarto`, `tipo` (Simples ou Luxo) e `status` (String). O atributo `status` deve ser `private`. A classe deve conter um método `confirmarCheckIn()` e `reservar()`.

**Regra:**
- Status: `Ocupado`, `Reservado` ou `Livre`
- O status só pode mudar para `Reservado` se antes estivesse como `Livre`.
- O status só pode mudar para `Ocupado` se antes estivesse como `Reservado`.
- Não deve ser possível mudar o status diretamente via set.

Para usar, execute a classe `Main`, escolha no terminal o número do quarto desejado e depois a operação que quer realizar.  
O programa mostrará se a reserva ou o check-in foi feito com sucesso.

**Arquivos:**
- `Main.java`
- `Reserva.java`

</details>

<details>
<summary><strong>Exercício 03</strong></summary>

Controle de Versão de Software: Classe `Versao`. Atributos: `major`, `minor`. O construtor recebe os dois números. Criar um método `lancarNovaVersao(boolean isCritica)` e um método `String mostrarVersao()`.

**Regra:**
- Se `isCritica` for `true`, o `major` aumenta em 1 e o outro zera. Se `false`, apenas o `minor` aumenta. O acesso direto aos números deve ser bloqueado (`private`).

Para usar, basta executar a classe `Main`.  
Esse exercício não exige digitação no terminal, pois o próprio código já demonstra as atualizações de versão e mostra o resultado na tela.

**Arquivos:**
- `Main.java`
- `Versao.java`

</details>

<details>
<summary><strong>Exercício 04</strong></summary>

Controle de alunos: Deve se criar uma classe `Alunos` com `nome`, `matrícula`. O construtor deve impedir a criação de objeto se o nome ou matrícula estiver nulo/vazio. Deve se criar um contador estático dentro da própria classe para que possa consultar quantos alunos foram criados.

**Regras:**
- Criar um contador estático para saber quantos alunos foram criados e incrementá-lo ao construir um novo aluno
- Criar um método para imprimir na tela a quantidade de alunos

Para usar, execute a classe `Main` e utilize o menu no terminal.  
Com ele, é possível cadastrar alunos, listar os alunos criados e consultar a quantidade total cadastrada.

**Arquivos:**
- `Main.java`
- `Aluno.java`

</details>