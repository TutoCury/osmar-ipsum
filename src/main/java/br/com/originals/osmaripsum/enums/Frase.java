package br.com.originals.osmaripsum.enums;

import com.fasterxml.jackson.annotation.JsonValue;

import br.com.originals.osmaripsum.util.RandomUtil;

public enum Frase
{

    TIPO_FEIO(1l, "que tipo feio"),
    VAMO_APOSTAR(2l, "vamo apostar"),
    SEMPRE_CERTO(3l, "eu sempre to certo"),
    DILUBRIADO(4l, "fui dilubriado"),
    GRAFICO_MENTIROSO(5l, "esse gráfico é mentiroso"),
    AMOR_DE_PESSOA(6l, "já te disseram que você é um amor de pessoa"),
    BRUXARIA(7l, "isso é uma bruxaria"),
    MENTIRA(8l, "kotlin é melhor que java"),
    ABSURDO(9l, "que absurdo"),
    BURRO(10l, "sabe o que o burro tem mais né"),
    DEU_CERTO(11l, "deu certo mas não deu"),
    DUVIDA_DUVIDOSA(12l, "me tira uma dúvida duvidosa"),
    JA_FOI_MELHOR(13l, "você já foi melhor"),
    PRA_VOCE_VER(14l, "pra você ver"),
    NAO_TEM_VERGONHA(15l, "não tem vergonha não"),
    AGRADECIDO(16l, "eu ficaria agradecido"),
    OLHA_MEU_POVO(17l, "olha aí meu povo"),
    ME_CONFIRMA(18l, "me confirma uma coisa"),
    INJUSTICA(19l, "é muita injustiça nesse Brasil"),
    MUITO_AGRADECIDO(20l, "muito agradecido"),
    ACASO_DO_DESTINO(21l, "por acaso do destino"),
    POCO_DE_CONHECIMENTO(22l, "você é um poço de conhecimento"),
    QUESTAO_TODA(23l, "agora a questão toda é"),
    PE_ATRAS(24l, "eu fiquei com um pé atrás"),
    CAPIAL(25l, "to me sentindo um capial");

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