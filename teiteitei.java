import javax.swing.*;

public class teiteitei {

    public static void main(String[] args) {

     String nome;
     double nota;
     double media = 0,mdfinal = 0;
     int qtdaluno,qtdnota;

     qtdaluno = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantos alunos foram avalidos?"));
     qtdnota = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantas avaliações foram feitas?"));

     int [] notas = new int [qtdnota];
     int [] alunos = new int [qtdaluno];

     for(int i = 0;i < alunos.length; i++) {

         nome = JOptionPane.showInputDialog(null, "Qual o nome do aluno?");

         for (int j = 0; j < notas.length; j++) {
             nota = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual a nota deste aluno?"));
             media += nota;
             mdfinal = media / notas.length;
         }
         JOptionPane.showMessageDialog(null,"nome: "+nome+"\nnota: "+mdfinal);
         media = 0;
         mdfinal = 0;
     }
            }

        }
