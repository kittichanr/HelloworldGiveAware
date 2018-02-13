/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listener;

import io.github.cdimascio.dotenv.Dotenv;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import model.DotEnv;
import utils.ConnectionBuilder;

/**
 *
 * @author Suparerk
 */
public class ENVContextListener implements ServletContextListener {
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        String pathProject = System.getenv("GiveAware"); // get path that set in catalina file 
        DotEnv.setDotEnv(Dotenv.configure().directory(pathProject).load()); //configure java-dotenv directory
        setEnvtoDatabaseConnection();
    }
    
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        
    }
    
    public static void setEnvtoDatabaseConnection(){
        String dbHost = DotEnv.getEnvVariable("DB_HOST");
        String dbPort = DotEnv.getEnvVariable("DB_PORT");
        String dbName = DotEnv.getEnvVariable("DB_NAME");
        String dbUsername = DotEnv.getEnvVariable("DB_USERNAME");
        String dbPassword = DotEnv.getEnvVariable("DB_PASSWORD");
        ConnectionBuilder builder = new ConnectionBuilder(dbHost, dbPort, dbName, dbUsername, dbPassword);
        ConnectionBuilder.setDatabase(builder);       
    }
    
}
