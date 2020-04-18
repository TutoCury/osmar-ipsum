package br.com.originals.osmaripsum.util;

public class RandomUtil
{

    public static int geraNumeroInteiro(int minimo, int maximo)
    {
        return minimo + (int) (Math.random() * (maximo - minimo));
    }

}