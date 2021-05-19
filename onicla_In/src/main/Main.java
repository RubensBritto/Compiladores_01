package main;

import exceptions.OniclaLexicalException;
import exceptions.OniclaSintaticoException;
import lexico.OniclaLexico;
import sintatico.OniclaSintatico;

public class Main {
    public static void main(String[] args) {
        try {
            String test = "C:\\Users\\ramon\\Desktop\\Compiladores\\onicla_In\\src\\main\\shell.txt";
            //OniclaLexico lexico = new OniclaLexico(test);
            OniclaSintatico sintatico = new OniclaSintatico(test);

            System.out.println("Sucesso ");
        } catch (OniclaLexicalException ex) {
            System.out.println("Lexico erro " + ex.getMessage());
        } catch (OniclaSintaticoException ex){
            System.out.println("Syntax Error " +ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Erro generico");
        }
    }
}