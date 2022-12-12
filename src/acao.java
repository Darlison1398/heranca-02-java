import javax.swing.*;

public class acao {
    public static void main(String[] args){
        people p1 = new people();
        professor pro = new professor();

        pro.setNome(JOptionPane.showInputDialog("Digite o nome do professor"));
        pro.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade do professor")));

        System.out.println(pro.mostrar());
        System.out.println("Abaixo, estão as matérias lecionadas pelo professor");
        pro.materias();
    }
}
