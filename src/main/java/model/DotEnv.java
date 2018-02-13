/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import io.github.cdimascio.dotenv.Dotenv; //after add dependency --> clean and build before import

/**
 *
 * @author Suparerk
 */
public class DotEnv {
    private static Dotenv dotEnv;
    
    public static String getEnvVariable(String envVar){
        return dotEnv.get(envVar);
    }

    public static Dotenv getDotEnv() {
        return dotEnv;
    }

    public static void setDotEnv(Dotenv dotEnv) {
        DotEnv.dotEnv = dotEnv;
    }   
}
