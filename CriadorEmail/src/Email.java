import java.util.Scanner;

public class Email {
    private String primeiroNome;
    private String sobrenome;
    private String senha;
    private String departamento;
    private String email;
    private int tamanhoCaixaDeEmail = 500;
    private int tamanhoPadraoDaSenha = 10;
    private String emailAlternativo;
    private String sufixoDaEmpresa = "stech.com";

    public Email( String primeiroNome, String sobrenome) {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.departamento = setDepartamento();
        this.senha = senhaAleatoria(tamanhoPadraoDaSenha);
        System.out.println("A sua senha é: " + this.senha);
        email = primeiroNome.toLowerCase() + "." + sobrenome.toLowerCase() + "@" + departamento.toLowerCase() +
                "." + sufixoDaEmpresa;
        System.out.println("O seu email é: " + email);
    }

    private String setDepartamento() {
        System.out.print("Digite o código do departamento:\n1 para Vendas\n2 para Desenvolvedor\n3 para Contabilidade" +
                "\n4 para Nenhum\nDigite o código:");
        Scanner in = new Scanner(System.in);
        int escolhaDeDepartamento = in.nextInt();
        if(escolhaDeDepartamento == 1) {return "Vendas";}
        else if(escolhaDeDepartamento ==2) {return "Desenvolvedor";}
        else if(escolhaDeDepartamento ==3) {return "Contabilidade";}
        else {return "";}
    }

    private  String senhaAleatoria(int tamanho) {
        String setSenha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@*$%abcdefghijklmnopqrstuvwxyz";
        char[] senha = new char[tamanho];
        for (int z=0;z<tamanho;z++){
            int aleatorio = (int) (Math.random() * setSenha.length());
            senha[z] = setSenha.charAt(aleatorio);

        }
        return new String(senha);

    }
    public void setTamanhoCaixaDeEmail(int capacidade){
        this.tamanhoCaixaDeEmail = capacidade;
    }

    public void setEmailAlternativo(String alternativo) {
        this.emailAlternativo = alternativo;
    }

    public void mudarSenha(String senha){
        this.senha = senha;
    }

    public int getTamanhoCaixaDeEmail() { return tamanhoCaixaDeEmail;}

    public String getEmailAlternativo() {return emailAlternativo;}

    public String getSenha() {return senha;}

    public String mostrar(){
        return "Nome: " + primeiroNome + " " + sobrenome + " Seu email empresarial é: " + email +
                " A capacidade da sua caixa de email é: " + tamanhoCaixaDeEmail + "MB";

    }
}
