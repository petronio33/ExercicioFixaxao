public class TesteFuncionarioV1 {
    
    public static void main(String[] args) {
        
        FuncionarioV1 V1 = new FuncionarioV1();
        V1.Funcionario = "Petrônio";
        V1.Departamento = "Caixa";
        V1.RG = "M1234569";
        V1.Salario = 1000.0;
        V1.Data_Entrada = "10/01/2019";
        V1.Ativo =  true;
        
        V1.Bonifica(10);
        V1.Demite();
        
        System.out.println("Nome: " + V1.Funcionario);
        System.out.println("Departamento: " + V1.Departamento);
        System.out.println("RG" + V1.RG);
        System.out.println("Salário: " + V1.Salario);
        System.out.println("Data Entrada: " + V1.Data_Entrada);
        System.out.println("Situação: " + V1.Ativo);
        
    }  
    
}
