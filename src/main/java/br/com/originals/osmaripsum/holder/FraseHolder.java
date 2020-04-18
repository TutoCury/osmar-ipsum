package br.com.originals.osmaripsum.holder;

import br.com.originals.osmaripsum.enums.Frase;

public class FraseHolder
{

    private String frase;

    @Deprecated
    public FraseHolder()
    {
        super();
    }

    public FraseHolder(Frase frase)
    {
        this.frase = frase.getValor();
    }

    public String getFrase()
    {
        return frase;
    }

}