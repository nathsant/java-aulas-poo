package br.sesi.file;

import org.springframework.boot.origin.SystemEnvironmentOrigin;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ManipuladorArquivo {

    public void leitor(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String linha = "";
        while(true){
            if(linha != null){
                System.out.println(linha);
            } else {
                break;
            }
            linha = reader.readLine();
        }
        reader.close();
    }

    public void escritor(String path){

    }
}
