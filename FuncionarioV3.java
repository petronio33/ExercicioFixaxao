
import javafx.scene.chart.PieChart.Data;

public class FuncionarioV3 {
    
    String Funcionario;
    String Departamento;
    double Salario;
    Data Data_Entrada;
    String RG;
    boolean Ativo;
    
void Bonifica(double Aumento){  
  Salario = Salario + (Salario / 100 * Aumento);
}

void Demite(){
    
    this.Ativo = false;
}

void Mostrar(){
    
    System.out.println("Nome: " + Funcionario);
    System.out.println("Departamento: " + Departamento);
    System.out.println("RG" + RG);
    System.out.println("Salário: " + Salario);
    System.out.println("Data Entrada: " + Data_Entrada.Dia + "/" + Data_Entrada.Mes + "/" + Data_Entrada.Ano);
    System.out.println("Situação: " + Ativo);

}
}
