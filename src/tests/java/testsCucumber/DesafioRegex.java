package testsCucumber;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class DesafioRegex {
    @Dado("que o ticket é {string}")
    public void que_o_ticket_é(String string) {
        System.out.println(string);
    }
    @E("que o valor da passagem é R$ {double}")
    public void que_o_valor_da_passagem_é_r$(Double double1) {
        System.out.println(double1);
    }
    @E("que o nome do passageiro é {string}")
    public void que_o_nome_do_passageiro_é(String string) {
        System.out.println(string);
    }
    @E("que o telefone do passageiro é {int}-{int}")
    public void que_o_telefone_do_passageiro_é(Integer int1, Integer int2) {
        System.out.println(int1 );
    }

    @E("que o ticket especial é {string}")
    public void que_o_ticket_especial_é(String string) {
        System.out.println(string);
    }

    @Quando("criar os steps")
    public void criar_os_steps() {
        System.out.println("criou");
    }
    @Então("o teste vai funcionar")
    public void o_teste_vai_funcionar() {
        System.out.println("funcionou");
    }

}
