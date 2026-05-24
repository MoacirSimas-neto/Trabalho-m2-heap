# Trabalho M2 - Fila de Prioridade com Heap

## Descrição

Este projeto implementa uma fila de prioridade baseada em Heap Binário para simular o sistema de triagem do hospital “São Binário”.  
Os pacientes não são atendidos por ordem de chegada, mas sim por prioridade clínica.

Cada paciente possui os seguintes atributos:
- nome
- nivelUrgencia
- tempoEsperaMinutos
- grupoVulneravel

A prioridade de atendimento segue estas regras:
1. Maior nível de urgência.
2. Em caso de empate, maior tempo de espera.
3. Em caso de novo empate, paciente do grupo vulnerável tem prioridade.

## Requisitos

- Java JDK instalado
- VS Code ou outra IDE Java
- Git instalado
- Repositório forkado do projeto `07-priority-queue-heap`

## Estrutura do projeto

- `src/entidades/Paciente.java`: entidade do paciente com regra de comparação de prioridade.
- `src/estatica/FilaComPrioridade.java`: implementação da fila com prioridade usando Heap Binário.
- `src/Main.java`: classe principal para testar a aplicação.

## Compilação

No terminal, dentro da pasta do projeto, execute:

```bash
javac -d out src/entidades/Paciente.java src/estatica/FilaComPrioridade.java src/Main.java
```

## Execução

Após compilar, execute:

```bash
java -cp out Main
```

## Teste esperado

A aplicação insere os 6 pacientes fornecidos no enunciado e imprime o estado interno do heap após cada inserção.  
Depois, remove todos os pacientes em ordem de prioridade.

A ordem de atendimento esperada é:
1. Maria
2. Pedro
3. Beatriz
4. João
5. Helena
6. Carlos

Se a saída estiver nessa ordem, a implementação está correta.

## Implementação

Este projeto atende aos seguintes requisitos da atividade:
- uso de Heap para implementação da fila de prioridade;
- método `enfileirar` com algoritmo Sobe Heap;
- método `desenfileirar` com algoritmo Desce Heap;
- entidade `Paciente` com regras de prioridade clínica.

## Javadoc

O projeto possui workflow para publicação automática do Javadoc no GitHub Pages.  
Para funcionar corretamente, é necessário ativar no repositório a opção:

`Settings > Pages > Source > GitHub Actions`
Última atualização: 24/05/2026