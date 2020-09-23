# Call of Dirty

Projeto implementado como requisito parcial da disciplina de Análise e Desenvolvimento de Sistemas, do curso de Sistemas de Informação (Centro Universitário de Patos de Minas - UNIPAM), sob a orientação do Professor Filipe Guelber Melo.

## Objetivo

O objetivo deste projeto é aplicar alguns conhecimentos de padrões de projeto adquiridos, na disciplina de Análise e Desenvolvimento de Sistemas, usando a linguagem de programação JAVA.

Esse é um projeto bem simples que foi feito utilizando 3 designs patterns, sendo eles:

* Factory
* State
* Strategy

## Cenário

O projeto foi pensado com base em jogos FPS clássicos, o qual tenta simular um confronto entre dois personagens (jogadores), em que cada um em posse de uma arma lutam um contra o outro até que somente um fique de pé.

## O que cada pattern faz?

* Factory: Usamos a Factory para centralizar as criações dos modos de tiro na fábrica e facilitar a instanciação desse objeto na main. Ao invés de adicionarmos um modo de tiro via new automatico(); ou new rajada();, simplesmente passamos o nome do modo de tiro para à fábrica, que recebe o nome, instancia o objeto correto e o retorna para a main.
* State: Usamos o State para setar o estado do personagem (jogador) ao estar ferido. Por exemplo, quando a vida do personagem estiver menor que 60 ele irá andar lentamente.
* Strategy: Usamos o Strategy para que possamos realizar a mesma operação/ação de atirar de diferentes maneiras como: automático, explosão, rajada e semi-automático.

## Autores

* m4sterin => Caio Vicente Rodrigues
* RhuanThales => Rhuan Thales de Souza Trajano