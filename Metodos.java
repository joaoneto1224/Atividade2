package atividade2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

public class Metodos {
    private List<Aluno> ListAluno = new ArrayList();
    private List<Professor> prof = new ArrayList();
    
    public void salvarAluno(){
        
        Aluno al = new Aluno();
        al.setNome(JOptionPane.showInputDialog("Informe o nome do Aluno"));
        al.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do Aluno")));
        al.setCpf(Integer.parseInt(JOptionPane.showInputDialog("Informe o cpf do Aluno")));
        al.setRa(Integer.parseInt(JOptionPane.showInputDialog("Informe o Ra do Aluno")));
        al.setSexo(JOptionPane.showInputDialog("Informe o sexo do Aluno"));
                
        
        ListAluno.add(al);
    }
    
    public void salvarProfessor(){
        
        Professor p = new Professor();
        p.setNome(JOptionPane.showInputDialog("Informe o nome do Professor"));
        p.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a Idade do Professor")));
        p.setCpf(Integer.parseInt(JOptionPane.showInputDialog("Informe o cpf do Professor")));
        p.setSiape(Integer.parseInt(JOptionPane.showInputDialog("Informe o Siape do Professor")));
        p.setSexo(JOptionPane.showInputDialog("Informe o Sexo do Professor"));
             
        prof.add(p);
    }
    public void exibirAluno(){
        int i = 0;
        
        for( i = 0;i<ListAluno.size();i++){
            JOptionPane.showMessageDialog(null,"Nome: "+ ListAluno.get(i).getNome() +"\n"+ "Idade: "+ListAluno.get(i).getIdade() +"\n"+ "Cpf: "+ListAluno.get(i).getCpf() +"\n"+"Ra: "+ ListAluno.get(i).getRa() +"\n"+"Sexo: "+ ListAluno.get(i).getSexo());
            ;
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
        for(int i = 0; i < ListAluno.size(); i++)
        {
            Aluno a = ListAluno.get(i);

            if(a.getRa()== ra)
            {
                ListAluno.remove(a);
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
                JOptionPane.showMessageDialog(null,"Removido com Sucesso!", "AtenÃ§Ã£o",2 );
                break;
            }
        }
    }
}

