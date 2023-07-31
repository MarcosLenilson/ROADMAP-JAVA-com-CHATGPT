# Roadmap de Estudo de Estrutura de Dados Lineares

## Etapa 1: Introdução

- Conceito de Estruturas de Dados Lineares
- Diferença entre Array e Lista
- Vantagens e Desvantagens das Estruturas Lineares
- Complexidade de Tempo e Espaço

### Exercícios

- Defina os termos: array, lista, fila e pilha
- Liste algumas situações em que você usaria uma lista em vez de um array

## Etapa 2: Arrays

- Declaração e Inicialização de Arrays

  - Sintaxe para declarar um array. **(RESOLVIDO)**

    > int n1, n2, n3, n4, n5;

    > final int tamanho = 5; >>> DEFINIÇÂO DE CONTANTE

  - Como inicializar um array com valores. **(RESOLVIDO)**

    > int [ ] num = {102, 56, 186, 5, 17}; >>> ARRAY JÁ COM ELEMENTOS DENTRO (INICIALIZADO)

  - Índices de arrays (geralmente começam em 0). **(RESOLVIDO)**

    > int[ ] num = new int[tamanho]; >>> ARRAY VAZIO COM ESSA INICIALIZAÇÃO

- Acesso e Atualização de Elementos

  - Como acessar um elemento específico do array usando o índice. **(RESOLVIDO)**

  - Como modificar o valor de um elemento no array. **(RESOLVIDO)**

- Operações Básicas: Inserção e Remoção

  - Limitações dos arrays estáticos em algumas linguagens de programação.

    > **Tamanho Fixo:** Arrays estáticos têm um tamanho fixo, definido no momento de sua criação.

    > **Desperdício de Espaço:** Se você definir um tamanho maior do que o necessário para um array estático, poderá acabar desperdiçando espaço na memória, já que o array ocupará o espaço total reservado, mesmo que nem todos os elementos sejam usados.

    > **Alocação Estática de Memória:** A memória para arrays estáticos é alocada em tempo de compilação ou antes da execução do programa, dependendo da linguagem.

    > **Falta de Flexibilidade:** Arrays estáticos não permitem a inserção ou remoção eficiente de elementos em posições arbitrárias. 

    > **Não Suporta Tipos Diferentes:** Em algumas linguagens, como C, os arrays estáticos são homogéneos, o que significa que todos os elementos devem ser do mesmo tipo. 

    > **Dificuldade em Retornar Arrays de Funções:** Em muitas linguagens, retornar arrays de funções pode ser complicado, pois os arrays estáticos têm escopo local e a memória alocada para eles pode ser desalocada após a saída da função

  - Inserção de elementos em um array. **(RESOLVIDO)**

  - Remoção de elementos de um array. **(RESOLVIDO)**

- Arrays Multidimensional

  - Criação e manipulação de arrays bidimensionais e tridimensionais.

  - Acesso a elementos em arrays multidimensionais usando múltiplos índices.

### Exercícios

1. Implemente um programa que encontre o maior e o menor elemento em um array. **(RESOLVIDO)**
2. Implemente um programa que verifique se um array está ordenado.
3. Implemente um programa que insira elementos em um array dinamicamente.
4. Implemente um programa que remova elementos de um array.

## Etapa 3: Listas Ligadas

- Conceito de Listas Ligadas
- Listas Simplesmente Ligadas
- Listas Duplamente Ligadas
- Inserção e Remoção em Listas
- Operações: Busca, Tamanho, Concatenação

### Exercícios

- Implemente uma lista simplesmente ligada e suas operações básicas.
- Implemente a remoção de um elemento específico em uma lista duplamente ligada.

## Etapa 4: Pilhas

- Conceito de Pilhas
- Operações: Push, Pop, Top
- Implementação de Pilhas usando Arrays e Listas Ligadas
- Aplicações de Pilhas

### Exercícios

- Implemente uma pilha utilizando arrays.
- Use uma pilha para verificar se uma expressão matemática está balanceada.

## Etapa 5: Filas

- Conceito de Filas
- Operações: Enqueue, Dequeue, Front
- Implementação de Filas usando Arrays e Listas Ligadas
- Filas de Prioridade

### Exercícios

- Implemente uma fila circular.
- Use uma fila para resolver o problema do produtor/consumidor.

## Etapa 6: Revisão e Prática

- Faça uma revisão geral de todos os tópicos estudados.
- Resolva problemas envolvendo várias estruturas de dados lineares.
- Considere desafios de codificação e projetos práticos.

### Exercícios

- Resolva problemas de revisão envolvendo diferentes estruturas de dados.
- Implemente um projeto que utilize várias estruturas de dados.

## Recursos

- Consulte livros e tutoriais sobre Estrutura de Dados Lineares.
- Pratique em plataformas de exercícios de algoritmos e estruturas de dados online.
