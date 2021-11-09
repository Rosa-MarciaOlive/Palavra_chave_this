public class Teste_Gerente{
    public static void main(String[] args){
        Gerente g=new Gerente();
        g.setNome("Rosa Márcia");
        g.setCpf("123456789");
        g.setSenha(2468);
        g.setSalario(20000.0);

        //Rotina do gerente de acesso ao sistema.
        //Senha invalida
        if(g.autentica(1234)){
            System.out.println("Senha correta.");
        }else{
            System.out.println("Senha invalida.");
        }
        //Senha válida
        if(g.autentica(2468)){
            System.out.println("Senha correta.");
        }else{
            System.out.println("Senha invalida.");
        }

    }
}