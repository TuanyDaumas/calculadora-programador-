/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calcularodaprogramador;
/**
 *
 * @author Tuany
 */
public class CalculadoraProgramador {
    // Método para converter de binário para decimal
    public int BinToDec(String valor) {
        return Integer.parseInt(valor, 2);
    }

    // Método para converter de octal para decimal
    public int OctalToDec(String valor) {
        return Integer.parseInt(valor, 8);
    }

    // Método para converter de hexadecimal para decimal
    public int HexToDec(String valor) {
        return Integer.parseInt(valor, 16);
    }

    // Método para converter de decimal para binário
    public String DecToBin(int valor) {
        return Integer.toBinaryString(valor);
    }

    // Método para converter de decimal para octal
    public String DecToOctal(int valor) {
        return Integer.toOctalString(valor);
    }

    // Método para converter de decimal para hexadecimal
    public String DecToHex(int valor) {
        return Integer.toHexString(valor);
    }

    // Método para converter de octal para hexadecimal
    public String OctalToHex(String valor) {
        int decValue = Integer.parseInt(valor, 8);
        return Integer.toHexString(decValue).toUpperCase();
    }

    // Método para converter entre bases (numero: o número a ser convertido, baseInicial: a base numérica inicial do número e novaBase: a base para a qual o número será convertido). 
    public String convertBetweenBases(String numero, String baseInicial, String novaBase) {
        int numDecimal; //armazena o número convertido para a base decimal.
        numDecimal = switch (baseInicial.toLowerCase()) {
            case "bin" -> Integer.parseInt(numero, 2);
            case "oct" -> Integer.parseInt(numero, 8);
            case "hex" -> Integer.parseInt(numero, 16);
            default -> Integer.parseInt(numero);
        }; //O método retorna uma String, que é o número convertido para a nova base.

        return switch (novaBase.toLowerCase()) {
            case "bin" -> Integer.toBinaryString(numDecimal);
            case "oct" -> Integer.toOctalString(numDecimal);
            case "hex" -> Integer.toHexString(numDecimal);
            default -> String.valueOf(numDecimal);//se não houver a escolha da base retorna o número convertido na base decimal.
        }; 
    }
}