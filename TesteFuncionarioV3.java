public class TesteFuncionarioV3 {
    
    public static void main(String[] args) {
        
        FuncionarioV3 V1 = new FuncionarioV3();
        
        V1.Funcionario = "Rafael";
        V1.Departamento = "TI";
        V1.RG = "M0001112";
        V1.Salario = 1000.0;
        V1.Ativo =  true;
        
        Data D1 = new Data();
        D1.Dia = 10;
        D1.Mes = 9;
        D1.Ano = 2000;
        
        V1.Data_Entrada = D1;
        
        V1.Bonifica(20);
        V1.Demite();
        V1.Mostrar();
        
        
    }
    
}