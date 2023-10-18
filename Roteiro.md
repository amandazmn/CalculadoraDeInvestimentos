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

A Seguir, tente redimensionar a janela com o mouse. O que aconteceu com os componentes
da tela? <br>

#### Resposta
Os componentes estão estáticos, eles não aumentam, diminuem ou mudam de lugar. Os componentes permanecem nos locais setados no código, ao diminuir a janela "cortamos" parte dos componentes, ao aumentar a janela os componentes permanecem no local em que foram setados. <br>

### Passo 2
Desenvolva uma nova janela para a aplicação calculadora de investimentos. Essa janela deverá ter a aparência da figura abaixo. Para isto, crie uma nova classe chamada 
ClaculadoraInvestimentosGrid e crie uma nova instância desta nova classe no método main,
ao invés de criar uma nova instância de CalculadoraInvestimentos. 
  > **Dica:** utilize o gerenciador de layout GridLayout. <br>

Ao concluir o desenvolvimento, redimensione a janela
para verificar o que acontece com os componentes da interface gráfica neste exemplo.

#### Resposta
Utilizando o layout GridLayout, os componentes adaptam-se ao tamanho da janela. Os grids do layout mudam de tamnho conforme a janela, consequentemente, os componentes nos grids também mudam de tamanho.

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
