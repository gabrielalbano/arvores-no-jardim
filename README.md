# Desafio Java: Número de árvores num jardim

Exercício em Java para o Academy do Elo7, no qual temos um jardim onde podem ser plantadas árvores também removidas, além de manter uma contagem atualizada do número de árvores presentes no jardim.

## Como usar:

O programa pede primeiramente o tamanho do jardim, o qual deve ser dado no formato `X Y`.
```
Digite a largura e a profundidade do jardim.
>>> 5 5
```

Depois, através de um menu, o usuário deve selecionar uma das opções disponíveis. 
```
Escolha uma das opções:
1 - Plantar uma árvore
2 - Remover uma árvore
3 - Visualizar o jardim.
4 - Sair.
```

Escolhendo a opção 1 ou 2, o usuário pode inserir ou remover uma árvore informando as coordenadas do local desejado, também no formato `X Y`. Não é possível plantar árvores em locais já ocupados ou fora dos limites do jardim, ou remover árvores de locais vazios.
```
Digite as coordenadas do local: 
2 2
```

Escolhendo a opção 3, o programa fornece uma visualização gráfica do jardim, mostrando onde há árvores plantadas.

```
>>> 3
[ ][ ][ ][ ][ ]
[ ][ ][ ][ ][ ]
[ ][ ][x][ ][ ]
[ ][ ][ ][ ][ ]
[ ][ ][ ][ ][ ]
```

Escolhendo a opção 4, o programa printa a quantidade total de árvores no jardim e termina.
```
>>> 4
Saindo.
Total de árvores no jardim: 1
```
