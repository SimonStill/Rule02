/******************************************************************************
 *  Rule02 - XP00
 *
 ******************************************************************************/

import java.io.File;

public class R02_XP00_Compilable{
    public static void deleteFile (){
        File someFile = new File ("someFileName.txt "); 
        // Do something with someFile
        someFile.delete ();
    }
    
    public static void main (String[] args){
        deleteFile();
    }
}


