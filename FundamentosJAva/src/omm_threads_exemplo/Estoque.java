package omm_threads_exemplo;

import java.util.LinkedList;
import java.util.List;

public class Estoque {

    private List conteudo;

    public Estoque()
    {
        conteudo = new LinkedList<String>();
        conteudo.add("http://www.camara.gov.br/internet/deputado/bandep/74016.jpg");
        conteudo.add("http://www.camara.gov.br/internet/deputado/bandep/74210.jpg");
        conteudo.add("http://www.camara.gov.br/internet/deputado/bandep/74319.jpg");
        conteudo.add("http://www.camara.gov.br/internet/deputado/bandep/74016.jpg");
        conteudo.add("http://www.camara.gov.br/internet/deputado/bandep/74210.jpg");
        conteudo.add("http://www.camara.gov.br/internet/deputado/bandep/74319.jpg");
        conteudo.add("http://www.camara.gov.br/internet/deputado/bandep/74324.jpg");
        conteudo.add("http://www.camara.gov.br/internet/deputado/bandep/74421.jpg");
        conteudo.add("http://www.camara.gov.br/internet/deputado/bandep/73805.jpg");
        conteudo.add("http://www.camara.gov.br/internet/deputado/bandep/73808.jpg");
        conteudo.add("http://www.camara.gov.br/internet/deputado/bandep/73507.jpg");
        conteudo.add("http://www.camara.gov.br/internet/deputado/bandep/74833.jpg");
    }

    public List getConteudo()
    {
        return conteudo;
    }

}
