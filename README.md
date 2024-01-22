## Sobre

Este repositório é uma série de exercícios de aprendizado em Java.

### 1. O que é esse número?
Um algoritmo que recebe um número qualquer e imprime na tela se o número é par ou ímpar, positivo ou negativo.
```java
// Exemplos de Saída
-5 é ímpar e negativo.
10 é par e positivo.
```
    
### 2. Fibonacci
Gerador de sequência de Fibonacci de tamanho `x`.
```java
// Exemplo de saída para uma sequência de tamanho 5
0 1 1 2 3
// Exemplo de saída para uma sequência de tamanho 20
0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181
```

### 3. MultiplicaAí
Imprime a tabela de multiplicação de um número `x`.
```java
Tabela de multiplicação por 5
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45
5 x 10 = 50
```

### 4. Pirâmide de números
Cria uma pirâmide de números, onde cada linha imprime a quantidade de números do valor iterado atualmente.
```java
// Exemplo de saída para 5
1
22
333
4444
55555
```
### 5. Duplicados não!
Algoritmo que encontra os elementos em comum que existem em dois arrays e imprima no console quais são esses elementos, um a um.

```java
// Exemplo com as seguintes entradas:
array1 => "Morango", "Banana", "Maçã", "Uva", "Caqui"
array2 => "Manga", "Caqui", "Morango", "Amora"

// A saída seria:
Morango
Caqui
```
### 6. Holidayzer
Calendário de feriados que:
- Imprime a lista com todos os feriados
- Recebe uma data como parâmerto e retorna uma mensagem.
    - Se o dia não for feriado, imprime: “Dia <data-inserida> não é feriado 🥲”
    - Se o dia for feriado, retorna: “Dia <data-inserida> é <nome-do-feriado>! 🎉”
```java
// Lista de feriados:
"01-01-2024" => "Confraternização Mundial"
"12-02-2024" => "Carnaval"
"13-02-2024" => "Carnaval"
"29-03-2024" => "Sexta-feira Santa"
"21-04-2024" => "Tiradentes"
"01-05-2024" => "Dia do Trabalho"
"30-05-2024" => "Corpus Christi"
"07-09-2024" => "Independência do Brasil"
"12-10-2024" => "Nossa Senhora Aparecida"
"02-11-2024" => "Finados"
"15-11-2024" => "Proclamação da República"
"20-11-2024" => "Dia Nacional de Zumbi e da Consciência Negra"
"25-12-2024" => "Natal"
```

### 7. APItização dos Feriados
Exercício anterior transformado em uma API. As rotas à seguir são correspondentes às funções descritas:
- **GET** `/holidays`
- **GET** `/holidays/:date` (data no formato `30-05-2024`)