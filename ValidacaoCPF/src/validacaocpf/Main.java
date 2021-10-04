/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validacaocpf;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author maria
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String CPF = JOptionPane.showInputDialog("Informe um CPF: ");

        // usando os metodos isCPF() e imprimeCPF() da classe "ValidaCPF"
        if (ValidaCPF.isCPF(CPF) == true) {
            JOptionPane.showMessageDialog(null, "Resultado: " + ValidaCPF.imprimeCPF(CPF));
        } else {
            JOptionPane.showMessageDialog(null, "Erro, CPF invalido !!!\n");
        }
    }

}
