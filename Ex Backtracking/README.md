# 👑 Problema das N-Rainhas

<div align="center">
<img width="200" height="200" src="https://media.tenor.com/n6aE1z2sIRwAAAAi/%E0%B8%A1%E0%B8%87%E0%B8%A5%E0%B8%87-sassy.gif">
</div>

## ℹ️ Informações
- **Autores:** Maria Maia e Marina Yamaguti
- **Data:** 27/05/2024
- **Linguagem:** Java
- **Status:** Concluído
- **Descrição:** Solução do problema das n-rainhas utilizando algoritmo.
- **Link:** https://github.com/DudaWendelMaia/PROJ.git

## 🎯 Problema
O problema das n-rainhas é um desafio clássico de otimização combinatória. Consiste em posicionar n rainhas em um tabuleiro de xadrez NxN de modo que nenhuma rainha possa atacar outra.

### Detalhes do Problema
- **Complexidade:** NP-completo devido ao crescimento exponencial das possíveis soluções com o tamanho do tabuleiro.
- **Regras de Ataque:** 
  - Rainhas atacam na mesma linha, coluna ou diagonal.
- **Objetivo:** Encontrar uma solução eficiente para o problema das n-rainhas.

### Exemplo Visual
```
Q   .   .   .   .   .   .   .
.   .   .   .   .   .   Q   .
.   .   .   .   Q   .   .   .
.   .   .   .   .   .   .   Q
.   Q   .   .   .   .   .   .
.   .   .   Q   .   .   .   .
.   .   .   .   .   Q   .   .
.   .   Q   .   .   .   .   .
```

Cada `Q` representa uma rainha posicionada sem ameaçar outra.

### Estratégia de Solução
A solução utiliza busca e backtracking para posicionar as rainhas de forma não conflituosa no tabuleiro.

## ▶️ Como Executar
Certifique-se de ter o JDK instalado. Clone o repositório e compile o código Java.

1. Clone o repositório:
    ```sh
    git clone https://github.com/DudaWendelMaia/PROJ.git
    ```

2. Navegue até a pasta do projeto:
    ```sh
    cd "Ex Backtracking"
    ```

3. Compile o código:
    ```sh
      javac NQueens.java
    ```

4. Execute o programa:
    ```sh
      java NQueens
    ```
