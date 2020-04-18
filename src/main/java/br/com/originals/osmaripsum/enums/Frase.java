package br.com.originals.osmaripsum.enums;

import com.fasterxml.jackson.annotation.JsonValue;

import br.com.originals.osmaripsum.util.RandomUtil;

public enum Frase
{

    TIPO_FEIO(1l, "que tipo feio"),
    VAMO_APOSTAR(2l, "vamo apostar"),
    SEMPRE_CERTO(3l, "eu sempre to certo"),
    DILUBRIADO(4l, "fui dilubriado"),
    GRAFICO_MENTIROSO(5l, "esse gráfico é mentiroso");

    private Long chave;
    private String valor;

    private Frase(Long chave, String valor)
    {
        this.chave = chave;
        this.valor = valor;
    }

    public Long getChave()
    {
        return chave;
    }

    @JsonValue
    public String getValor()
    {
        return valor;
    }

    public static Frase random()
    {
        int random = RandomUtil.geraNumeroInteiro(0, values().length - 1);
        return values()[random];
    }

}