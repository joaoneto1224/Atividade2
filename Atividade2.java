package atividade2;

import javax.swing.JOptionPane;

public class Atividade2{

    public static void main(String[] args) {
        Metodos M = new Metodos();
        int consulta = 1;
        while(consulta != 0){
            String a = JOptionPane.showInputDialog("-------------MENU----------- \n1- Salvar\n2- Exibir\n3- Remover ");
            switch(a){
                case "1":
                    String p = JOptionPane.showInputDialog("1- Salvar novo Aluno\n2- Salvar novo Professor");
                    M.salvar(p);
                    
                    consulta = Integer.parseInt(JOptionPane.showInputDialog("Deseja fazer outra operação? \n1-Sim \n0-Não"));
                break;
                case "2":
                    String b = JOptionPane.showInputDialog("1- Exibir Alunos\n2- Exibir Professores\n3- Exibir todos");                
                    M.exibir(b);
                    
                    consulta = Integer.parseInt(JOptionPane.showInputDialog("Deseja fazer outra operação? \n1-Sim \n0-Não"));
                break;
                case"3":
                    String x = JOptionPane.showInputDialog("1- Remover um Aluno\n2- Remover um Professor");
                    M.remover(x);
                    
                    consulta = Integer.parseInt(JOptionPane.showInputDialog("Deseja fazer outra operação? \n1-Sim \n0-Não"));
                break;
                default:                    
                    break;  
            }

        } 
    }
}
