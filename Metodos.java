package atividade2;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Metodos {
    ArrayList<Aluno> aluno = new ArrayList();
    public void salvarAluno(){
        ArrayList<Aluno> aluno = new ArrayList();
        Aluno al = new Aluno();
        al.setNome(JOptionPane.showInputDialog("Informe o nome do Aluno"));
        al.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do Aluno")));
        al.setCpf(Integer.parseInt(JOptionPane.showInputDialog("Informe o cpf do Aluno")));
        al.setRa(Integer.parseInt(JOptionPane.showInputDialog("Informe o Ra do Aluno")));
        al.setSexo(JOptionPane.showInputDialog("Informe o sexo do Aluno"));
        
        
        aluno.add(al);
    }
    ArrayList<Professor> prof = new ArrayList();
    public void salvarProfessor(){
        ArrayList<Professor> prof = new ArrayList();
        Professor p = new Professor();
        p.setNome(JOptionPane.showInputDialog("Informe o nome do Professor"));
        p.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a Idade do Professor")));
        p.setCpf(Integer.parseInt(JOptionPane.showInputDialog("Informe o cpf do Professor")));
        p.setSiape(Integer.parseInt(JOptionPane.showInputDialog("Informe o Siape do Professor")));
        p.setSexo(JOptionPane.showInputDialog("Informe o Sexo do Professor"));
        
        
        prof.add(p);
    }
    public void exibirAluno(){
        Iterator<Aluno> iterator = aluno.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            JOptionPane.showMessageDialog(null,"Posição"+ i+"- "+ iterator.next());
            i++;
        }
    }
    public void exibirProfessor(){
        Iterator<Professor> iterator = prof.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            JOptionPane.showMessageDialog(null,"Posição"+ i+"- "+ iterator.next());
            i++;
        }
    }
    public void removerAluno(int ra){
        for(int i = 0; i < aluno.size(); i++)
        {
            Aluno a = aluno.get(i);

            if(a.getRa()== ra)
            {
                aluno.remove(a);
                JOptionPane.showMessageDialog(null,"Removido com Sucesso!", "Atenção",2 );
                break;
            }
        }
    }
    public void removerProfessor(int siape){
        for(int i = 0; i < prof.size(); i++)
        {
            Professor p = prof.get(i);

            if(p.getSiape()== siape)
            {
                prof.remove(p);
                JOptionPane.showMessageDialog(null,"Removido com Sucesso!", "Atenção",2 );
                break;
            }
        }
    }
}
