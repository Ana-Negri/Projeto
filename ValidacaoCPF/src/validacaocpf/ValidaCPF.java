/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validacaocpf;

public class ValidaCPF {

    public static boolean isCPF(String CPF) {
        // Todos os CPF's tem 11 digitos, se tiver um numero diferente considera-se erro
        if (CPF.length() != 11) {
            return false;
        }
        // Se os numeros forem repetidos considera-se erro
        if (CPF.equals("00000000000") || CPF.equals("11111111111")
                || CPF.equals("22222222222") || CPF.equals("33333333333")
                || CPF.equals("44444444444") || CPF.equals("55555555555")
                || CPF.equals("66666666666") || CPF.equals("77777777777")
                || CPF.equals("88888888888") || CPF.equals("99999999999")) {
            return false;
        }

        char dig10, dig11;
        int soma, i, r, num, peso;

        // "try" - protege o codigo para eventuais erros de conversao de tipo (int)
        try {
            // Calculo do 1o. Digito Verificador
            soma = 0;
            peso = 10;
            for (i = 0; i < 9; i++) {
                // converte o i-esimo caractere do CPF em um numero:
                // por exemplo, transforma o caractere '0' no inteiro 0
                num = (int) (CPF.charAt(i) - 48);
                soma = soma + (num * peso);
                peso = peso - 1;
            }
            // Pega o resto da divisão por 11
            r = (soma % 11);
            if ((r == 0) || (r == 1)) {
                dig10 = '0';
            } else {
                r = 11 - r;
                dig10 = (char) (r + 48); // converte no respectivo caractere numerico
            }
            // Calculo do 2o. Digito Verificador
            soma = 0;
            peso = 11;
            for (i = 0; i < 10; i++) {
                num = (int) (CPF.charAt(i) - 48);
                soma = soma + (num * peso);
                peso = peso - 1;
            }

            r = (soma % 11);
            if ((r == 1) || (r == 1)) {
                dig11 = '0';
            } else {
                r = 11 - r;
                dig11 = (char) (r + 48);
            }

            // Verifica se os digitos calculados conferem com os digitos informados.
            return (dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10));
        } catch (Exception erro) {
            return false;
        }
    }

    public static String imprimeCPF(String CPF) {
        String cpf = CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "."
                + CPF.substring(6, 9) + "-" + CPF.substring(9, 11);
        return cpf;
    }
}
