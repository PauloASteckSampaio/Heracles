public class Aplicativo {
    // Esta aplicação ira: Criar um emeail seguindo um modelo, determinar o departamento do dono do email, gerar
    // uma senha, ter metodos para mudar a senha, definir a capacidade da caixa de email, definir endereço de email
    // alternativo e possui métodos para exibi o nome, email e a capacidade da caixa de email.
    public static void main(String[] args) {
        Email em1 = new Email("Paulo", "Antonio");

        System.out.println(em1.mostrar());
    }
}