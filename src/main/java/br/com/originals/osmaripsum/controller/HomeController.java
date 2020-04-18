package br.com.originals.osmaripsum.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.originals.osmaripsum.enums.Frase;
import br.com.originals.osmaripsum.holder.FraseHolder;
import br.com.originals.osmaripsum.holder.MensagemHolder;
import br.com.originals.osmaripsum.holder.ParagrafoHolder;
import br.com.originals.osmaripsum.util.RandomUtil;

@RestController
public class HomeController
{

    @GetMapping
    public MensagemHolder bemVindo()
    {
        return new MensagemHolder("Seja Bem Vindo");
    }

    @GetMapping("/frase")
    public FraseHolder geraFrase()
    {
        return new FraseHolder(Frase.random());
    }

    @GetMapping("/paragrafo")
    public ParagrafoHolder geraParagrafo()
    {
        List<Frase> frases = new ArrayList<>();
        int numeroDeFrases = RandomUtil.geraNumeroInteiro(5, 10);

        for (int i = 0; i < numeroDeFrases; i++)
        {
            frases.add(Frase.random());
        }

        return new ParagrafoHolder(frases);
    }

}