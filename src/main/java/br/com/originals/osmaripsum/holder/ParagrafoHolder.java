package br.com.originals.osmaripsum.holder;

import java.util.List;
import java.util.stream.Collectors;

import br.com.originals.osmaripsum.enums.Frase;

public class ParagrafoHolder
{

    public String paragrafo;

    @Deprecated
    public ParagrafoHolder()
    {
        super();
    }

    public ParagrafoHolder(List<Frase> frases)
    {
        if (frases == null || frases.isEmpty())
            return;

        String paragrafo = frases.stream()
                .map(Frase::getValor)
                .collect(Collectors.joining(" "));

        this.paragrafo = new StringBuilder()
                .append(paragrafo.substring(0, 1).toUpperCase())
                .append(paragrafo.substring(1))
                .append(".").toString();
    }

    public String getParagrafo()
    {
        return paragrafo;
    }

}