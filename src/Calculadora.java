import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame {

    public Calculadora() {
        // Configurações do JFrame
        setTitle("Calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 500);
        setLocationRelativeTo(null);  // quando a janela abrir, ela vai estar no centro da tela

        // cria um JPanel com BoxLayout na vertical(Y)
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JTextField titulo = new JTextField("CALCULADORA"); // cria um coponente de texto
        titulo.setEditable(false); // define que não é possível editar em execução
        titulo.setHorizontalAlignment(0); // centraliza o componente na janela

        JTextField texto1 = new JTextField("Primeiro número:");;
        texto1.setEditable(false);
        texto1.setHorizontalAlignment(0);

        JTextField campo1 = new JTextField(); // cria um componente de texto, onde vai ser inserido o primeiro número
        campo1.setHorizontalAlignment(0); // centraliza o componente na janela


        JTextField texto2 = new JTextField("Segundo número:");
        texto2.setEditable(false);
        texto2.setHorizontalAlignment(0);

        JTextField campo2 = new JTextField();
        campo2.setHorizontalAlignment(0);

        JTextField texto3 = new JTextField("Escolha a Operação:");
        texto3.setEditable(false);
        texto3.setHorizontalAlignment(0);

        JButton botaoSomar= new JButton("Calcular Soma"); // cria um botão
        botaoSomar.setAlignmentX(Component.CENTER_ALIGNMENT);  // centraliza o botão na janela

        JButton botaoSubtrair = new JButton("Calcular Subtração");
        botaoSubtrair.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton botaoMultiplicar = new JButton("Calcular Multiplicação");
        botaoMultiplicar.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton botaoDividir = new JButton("Calcular Divisão");
        botaoDividir.setAlignmentX(Component.CENTER_ALIGNMENT);

        JTextField resultado = new JTextField(); // cria o componente que vai mostrar o resultado
        resultado.setEditable(false); // desativa a opção de ser editável
        resultado.setHorizontalAlignment(0); // centraliza na janela

        // Adiciona todos os componentes criado ao JPanel criado
        panel.add(titulo);
        panel.add(texto1);
        panel.add(campo1);
        panel.add(texto2);
        panel.add(campo2);
        panel.add(Box.createVerticalStrut(40)); //cria um espaço vertical de largura x entre os componentes
        panel.add(texto3);
        panel.add(Box.createVerticalStrut(20));
        panel.add(botaoSomar);
        panel.add(Box.createVerticalStrut(10));
        panel.add(botaoSubtrair);
        panel.add(Box.createVerticalStrut(10));
        panel.add(botaoMultiplicar);
        panel.add(Box.createVerticalStrut(10));
        panel.add(botaoDividir);
        panel.add(Box.createVerticalStrut(30));
        panel.add(resultado);

        // Adiciona o JPanel ao JFrame
        add(panel);

        // botão resposável por somar os números
        botaoSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(campo1.getText());
                    int num2 = Integer.parseInt(campo2.getText());
                    int soma = num1 + num2;
                    resultado.setText("A soma é igual a " + soma);
                } catch (NumberFormatException exception) {
                    resultado.setText("Erro: digite dois números inteiros.");
                }
            }
        });

        //botão responsável por subtrair os números
        botaoSubtrair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int num1 = Integer.parseInt(campo1.getText());
                    int num2 = Integer.parseInt(campo2.getText());
                    int subtracao = num1 - num2;
                    resultado.setText("A subtração é igual a " + subtracao);
                } catch (NumberFormatException exception){
                    resultado.setText("Erro: digite dois números inteiros");
                }
            }
        });

        //botão responsável por multiplicar os números
        botaoMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int num1 = Integer.parseInt(campo1.getText());
                    int num2 = Integer.parseInt(campo2.getText());
                    int multiplicacao = num1 * num2;
                    resultado.setText("A multiplicação é igual a " + multiplicacao);
                } catch (NumberFormatException exception){
                    resultado.setText("Erro: digite dois números inteiros");
                }
            }
        });

        //botão responsável por dividr os números
        botaoDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int num1 = Integer.parseInt(campo1.getText());
                    int num2 = Integer.parseInt(campo2.getText());
                    int divisao = num1 / num2;
                    resultado.setText("A divisão é igual a " + divisao);
                } catch (NumberFormatException exception){
                    resultado.setText("Erro: digite dois números inteiros");
                }
            }
        });

        //Deixa a Janela visível
        setVisible(true);

    }


    // Método Main (Executar)
    public static void main(String[] args) {
        new Calculadora();
    }
}