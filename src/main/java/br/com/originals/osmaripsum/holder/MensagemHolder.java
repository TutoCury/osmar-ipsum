package br.com.originals.osmaripsum.holder;

public class MensagemHolder
{

    private String mensagem;

    @Deprecated
    public MensagemHolder()
    {
        super();
    }

    public MensagemHolder(String mensagem)
    {
        this.mensagem = mensagem;
    }

    public String getMensagem()
    {
        return mensagem;
    }

}