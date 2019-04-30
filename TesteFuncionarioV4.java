public class TesteFuncionarioV4 {
    
    public static void main(String[] args) {
        
        FuncionarioV4 V1 = new FuncionarioV4();
        V1.Funcionario = "Rafael";
        V1.Departamento = "TI";
        V1.RG = "M0001112";
        V1.Salario = 1000.0;
        V1.Ativo =  true;
        
        Data D1 = new Data();
        D1.Dia = 10;
        D1.Mes = 9;
        D1.Ano = 2000;
        
        V1.Data = D1;
        
        V1.Bonifica(20);
        V1.Demite();
        V1.Mostrar();
        System.out.println("");
        
        FuncionarioV4 V2 = new FuncionarioV4();
        V2.Funcionario = "Rafael";
        V2.Departamento = "TI";
        V2.RG = "M0001112";
        V2.Salario = 1000.0;
        V2.Ativo =  true;
        
        Data D2 = new Data();
        D2.Dia = 10;
        D2.Mes = 9;
        D2.Ano = 2000;
        
        V2.Data = D2;
        
        V2.Bonifica(20);
        V2.Demite();
        V2.Mostrar();
        
        V1.equals(V2);
        
    }   
}
