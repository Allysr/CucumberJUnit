package testsCucumber;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

public class PrimeiroTeste {

    private Integer contador;
    @Dado("que o contador esteja em {int}")
    public void queOContadorEstejaEm(Integer int1) {
        contador = int1;
    }
    @Quando("eu incrementar em {int}")
    public void euIncrementarEm(Integer int1) {
        contador = contador + int1;
    }
    @Entao("deve ser {int} o valor do contador")
    public void deveSerOValorDoContador(Integer int1) {
        Assert.assertTrue(contador == int1);
        Assert.assertEquals(int1 , contador);
    }


}
