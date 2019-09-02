package atividade2;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Metodos {
    private List<Aluno> ListAluno = new ArrayList();
    private List<Professor> ListProf = new ArrayList();
    
    public void salvar(String x){       
        if(x.equals("1")){
            Aluno al = new Aluno();
            
            al.setNome(JOptionPane.showInputDialog("Informe o nome do Aluno"));
            al.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do Aluno")));
            al.setCpf(Long.parseLong(JOptionPane.showInputDialog("Informe o cpf do Aluno")));
            al.setRa(Integer.parseInt(JOptionPane.showInputDialog("Informe o Ra do Aluno")));
            al.setSexo(JOptionPane.showInputDialog("Informe o sexo do Aluno"));
            
            ListAluno.add(al);
        }
        else{
            Professor p = new Professor();
            
            p.setNome(JOptionPane.showInputDialog("Informe o nome do Professor"));
            p.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a Idade do Professor")));
            p.setCpf(Long.parseLong(JOptionPane.showInputDialog("Informe o cpf do Professor")));
            p.setSiape(Integer.parseInt(JOptionPane.showInputDialog("Informe o Siape do Professor")));
            p.setSexo(JOptionPane.showInputDialog("Informe o Sexo do Professor"));
             
            ListProf.add(p);
        }
    }
    
    public void exibir(String e){
        int i = 0;
        if(e.equals("1")){
            for( i = 0;i<ListAluno.size();i++){
                JOptionPane.showMessageDialog(null,"Nome: "+ ListAluno.get(i).getNome() +"\n"+ "Idade: "+ListAluno.get(i).getIdade() +"\n"+ "Cpf: "+ListAluno.get(i).getCpf() +"\n"+"Ra: "+ ListAluno.get(i).getRa() +"\n"+"Sexo: "+ ListAluno.get(i).getSexo());
                ;
            }
        }
        else if(e.equals("2")){
            for( i = 0;i<ListProf.size();i++){
                JOptionPane.showMessageDialog(null,"Nome: "+ ListProf.get(i).getNome() +"\n"+ "Idade: "+ListProf.get(i).getIdade() +"\n"+ "Cpf: "+ListProf.get(i).getCpf() +"\n"+"Siape: "+ ListProf.get(i).getSiape() +"\n"+"Sexo: "+ ListProf.get(i).getSexo());
                ;
            }
        }
        else{
            int c = 0;
            for( i = 0;i<ListAluno.size();i++){
                JOptionPane.showMessageDialog(null,"Agora todos os Alunos serão exibidos");
                JOptionPane.showMessageDialog(null,"Nome: "+ ListAluno.get(i).getNome() +"\n"+ "Idade: "+ListAluno.get(i).getIdade() +"\n"+ "Cpf: "+ListAluno.get(i).getCpf() +"\n"+"Siape: "+ ListAluno.get(i).getRa() +"\n"+"Sexo: "+ ListAluno.get(i).getSexo());
                ;
            }
            for( c = 0;c<ListProf.size();c++){
                JOptionPane.showMessageDialog(null,"Agora todos os Professores serão exibidos");
                JOptionPane.showMessageDialog(null,"Nome: "+ ListProf.get(c).getNome() +"\n"+ "Idade: "+ListProf.get(c).getIdade() +"\n"+ "Cpf: "+ListProf.get(c).getCpf() +"\n"+"Siape: "+ ListProf.get(c).getSiape() +"\n"+"Sexo: "+ ListProf.get(c).getSexo());
                ;
            }
        }
    }
    
    public void remover(String r){
        if(r.equals("1")){
            int ra = Integer.parseInt(JOptionPane.showInputDialog("Informe o Ra do aluno"));
            for(int i = 0; i < ListAluno.size(); i++)
            {
                Aluno a = ListAluno.get(i);

                if(a.getRa()== ra)
                {
                    ListAluno.remove(a);
                    JOptionPane.showMessageDialog(null,"Aluno removido com Sucesso!", "Atenção",2 );
                    break;
                }
            }
        }
        else{
            int siape = Integer.parseInt(JOptionPane.showInputDialog("Informe o Siape do Professor"));
            for(int i = 0; i < ListProf.size(); i++)
            {
                Professor p = ListProf.get(i);

                if(p.getSiape()== siape)
                {
                    ListProf.remove(p);
                    JOptionPane.showMessageDialog(null,"Professor removido com Sucesso!", "Atenção",2 );
                    break;
                }
            }
        }
    }    
}

