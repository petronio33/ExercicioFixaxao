public class FuncionarioV1 {
    
    String Funcionario;
    String Departamento;
    double Salario;
    String Data_Entrada;
    String RG;
    boolean Ativo;
    
/*Crie um método bonifica que aumenta o salario do funcionário de acordo com o
parâmetro passado como argumento. Esse argumento representa a
porcentagem de aumento que o funcionário irá receber.*/

void Bonifica(double Aumento){  
  Salario = Salario + (Salario / 100 * Aumento);
}

/*Crie, também, um método demite, que não recebe parâmetro algum, só
modifica o valor booleano indicando que o funcionário não trabalha mais na
empresa.*/

void Demite(){
    
    this.Ativo = false;
}
    
}