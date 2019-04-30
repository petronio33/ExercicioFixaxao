public class TesteFuncionarioV2 {
    
    public static void main(String[] args) {
        
        FuncionarioV2 V1 = new FuncionarioV2();
        V1.Funcionario = "Rafael";
        V1.Departamento = "TI";
        V1.RG = "M0001112";
        V1.Salario = 1000.0;
        V1.Data_Entrada = "10/01/2018";
        V1.Ativo =  true;
        
        V1.Bonifica(20);
        V1.Demite();
        V1.Mostrar();
        
        
    }
    
}
