/******************************************************************************
 *  Rule02 - XP00
 *  Compliant Solution
 ******************************************************************************/

import java.io.File;

public class R02_XP00_Compliant_Compilable{
    public static void deleteFile (){
        File someFile = new File ("someFileName.txt"); // Do something with someFile
        if (!someFile.delete ()) {
            // Handle failure to delete the file
        }
    }

    public static void main (String[] args){
            deleteFile(); 
        }
}
