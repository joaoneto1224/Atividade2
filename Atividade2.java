package atividade2;

import javax.swing.JOptionPane;

public class Atividade2{

    public static void main(String[] args) {
        Metodos M = new Metodos();
        int consulta = 1;
        while(consulta != 0){
            String a = JOptionPane.showInputDialog("-------------MENU----------- \n1- Salvar\n2- Exibir\n3- Revomer ");
            switch(a){
                case "1":
                    String p = JOptionPane.showInputDialog("1- Salvar novo Aluno\n2- Salvar novo Professor");
                    if(p.equals("1")){
                        M.salvarAluno();
                    }
                    else{
                        M.salvarProfessor();
                    }
                    consulta = Integer.parseInt(JOptionPane.showInputDialog("Deseja fazer outra operação? /n1-Sim /n0-Não"));
                break;
                case "2":
                    String b = JOptionPane.showInputDialog("1- Exibir Alunos\n2- Exibir Professores");
                    if(b.equals("1")){
                        M.exibirAluno();
                    }
                    else{
                        M.exibirProfessor();
                    }
                    consulta = Integer.parseInt(JOptionPane.showInputDialog("Deseja fazer outra operação? /n1-Sim /n0-Não"));
                break;
                case"3":
                    String x = JOptionPane.showInputDialog("1- Remover um Aluno\n2- Remover um Professor");
                    if(x.equals("1")){
                        int ra = Integer.parseInt(JOptionPane.showInputDialog("Informe o Ra do aluno"));
                        M.removerAluno(ra);
                    }
                    else{
                        int siape = Integer.parseInt(JOptionPane.showInputDialog("Informe o Siape do Professor"));
                        M.removerProfessor(siape);
                    }
                    consulta = Integer.parseInt(JOptionPane.showInputDialog("Deseja fazer outra operação? /n1-Sim /n0-Não"));
               break;
                  
            }

        } 
    }
}