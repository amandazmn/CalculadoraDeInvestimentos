# Roteiro 1 – Calculadora de Investimentos

**Instituto Federal de Santa Catarina – Campus Gaspar <br>
Curso Técnico de Informática <br>
Disciplina: Práticas em Desenvolvimento de Sistemas I <br>
Prof. Andrei de Souza Inácio** <br>
**Aluna:** Amanda Zimmermann

# Passos
### Passo 1
Crie a janela CalculadoraInvestimentos com largura e altura de 250px, conforme exemplo
abaixo.
  > **Obs.:** Não defina layout para a Janela. <br>


### Passo 2
Desenvolva uma nova janela para a aplicação calculadora de investimentos. Essa janela deverá ter a aparência da figura abaixo. Para isto, crie uma nova classe chamada 
ClaculadoraInvestimentosGrid e crie uma nova instância desta nova classe no método main,
ao invés de criar uma nova instância de CalculadoraInvestimentos. 
  > **Dica:** utilize o gerenciador de layout GridLayout. <br>

Ao concluir o desenvolvimento, redimensione a janela
para verificar o que acontece com os componentes da interface gráfica neste exemplo.

### Passo 3
Altere a classe ClaculadoraInvestimentosGrid de maneira que os campos de texto
(JTextField) não tenham o seu tamanho alterado quando a janela é redimensionada. 
  > **Dica:** coloque cada componente em um JPanel que tenha FlowLayout, depois acrescente os JPanels no GridLayout. <br>


### Passo 4
Adicione a ação no botão Calcular para realizar o cálculo do investimento. A classe
Investimento será a classe responsável por esse cálculo e deverá ser codificada conforme
abaixo. 

~~~java
public class Investimento
{
 private int meses;
 private double juros;
 private double deposito_mensal;

 public Investimento(int a, double j, double dm) {
 meses = a;
 juros = j/100;
 deposito_mensal = dm;
 }

 public double calculaTotal() {
 int num_pagamentos = meses;
 double total = 0;
 for (int i = 0; i < num_pagamentos; i++) {
 total = total + deposito_mensal;
 total = total + total * juros;
 }
 return total;
 }
}
~~~

### Passo 5
Adicione à janela da aplicação o menu Ajuda conforme a figura abaixo. 
Esse menu
apresentará informações sobre o aplicativo. 

### Passo 6
Implemente a ação do menu Sobre. O menu deve mostrar a saída apresentada na figura
abaixo. 
Para isso, crie uma nova classe chamada FormSobre. Especifique o formulário
Sobre de maneira a obter tal layout conforme figura abaixo. 

## Perguntas
Considerando o desenvolvimento do Roteiro Prático 1, responda as seguintes perguntas: <br>

**1.** Após a conclusão do passo 1, o que aconteceu com os componentes da tela ao redimensionar a janela? Justifique sua resposta.
  #### Resposta
  Os componentes estão estáticos, eles não aumentam, diminuem ou mudam de lugar. Os componentes permanecem nos locais setados no código, ao diminuir a janela "cortamos" parte dos componentes, ao aumentar a janela os componentes permanecem no local em que foram setados. Isso ocorre porque o Absolut Layout não redimensiona os componentes na tela, já que é orientado por coordenadas fixas. <br>

**2.** Após a conclusão do passo 2, o que aconteceu com os componentes da tela ao redimensionar a janela? Justifique sua resposta.
#### Resposta
Utilizando o GridLayout, os componentes adaptam-se ao tamanho da janela. Por ser um layout em forma de "tabela" (grid, do inglês grade), as "células" são redimensionadas igualmente. Os grids do layout mudam de tamanho conforme a janela, consequentemente, os componentes nos grids também mudam de tamanho.

**3.** Após a conclusão do passo 3, o que aconteceu com os componentes da tela ao redimensionar a janela? Justifique sua resposta. 
#### Resposta
  Utilizando os componentes em um JPanel com FlowLayout ao redimensionar a tela o tamanho dos componentes não é alterado, apenas a posição adequa-se à nova dimensão, devido ao GridLayout. Ao usar o FlowLayout os componentes não tem seus tamanhos alterados, mas, como este FlowLayout está dentro de um GridLayout, a posição muda. <br>

**4.** Na sua opinião, qual a importância do uso dos diferentes layouts usados no contexto do desenvolvimento de interfaces gráficas?
#### Resposta
Cada layout pode ser utilizado em casos específicos, ao utilizar um conjunto de deles na mesma tela as possibilidades aumentam consideravelmente. A importância desta variedade está no conforto que a boa utilização dos layouts trará para o usuário, além de adaptar a tela do programa a diferentes displays, uma característica imprescindível de uma interface gráfica bem desenvolvida.  
