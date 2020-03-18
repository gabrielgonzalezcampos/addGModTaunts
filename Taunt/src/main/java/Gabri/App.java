package Gabri;

import Gabri.Directorio;

import java.io.*;
import java.util.List; // import just the List interface
import java.util.ArrayList; // import just the ArrayList class

/*addTaunt("Test", {
    "prophunters/xp.wav",
    }, "props", "both", {"test"})
*/

public class App {
    public static void main( String[] args )
    {
        Directorio principal = new Directorio();
        //List audios = new ArrayList();
        int index = 0;
        String content = "";

        System.out.println( "Hello, please type (or paste) the directory where you have the taunts you want to include:" );

        String path = System.console().readLine();

        String[] collectionName = path.split("\\\\");

        File folder = new File(path);

        //System.out.println(folder.listFiles()[0].getClass().getName());

        for (File element: folder.listFiles()){
            
            index = element.getName().lastIndexOf('.');
            
            //System.out.println(element.getName().substring(index+1));
            if(!element.isDirectory()){
                if(index>=0){
                    if(element.getName().substring(index+1).equals("txt")){

                        audios.add(element);
                    }
                }
            }
            //System.out.println(audios.get(0));
        }

        index=0;
        for (File element: audios){
            index = element.getName().lastIndexOf('.');

            content = content + "addTaunt(\"" + collectionName[collectionName.length-2] +"\", {\n"+
                "\"prophunters/"+element.getName().substring(0, index)+".wav\",\n"+
                "}, \"props\", \"both\", {";

        }


    }

    static Directorio loadDirectory(path){

        Directorio directory = new Directorio();

        String[] collectionName = path.split("\\\\");

        File folder = new File(path);

        //System.out.println(folder.listFiles()[0].getClass().getName());

        for (File element: folder.listFiles()){
            
            index = element.getName().lastIndexOf('.');
            
            //System.out.println(element.getName().substring(index+1));
            if(!element.isDirectory()){
                if(index>=0){
                    if(element.getName().substring(index+1).equals("txt")){
                        directory.listaArchivos.add(element);
                    }
                }
            }else{

            }
            //System.out.println(audios.get(0));
        }
    }    
}
