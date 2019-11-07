/******************************************************************************
 *  Rule02 - XP00
 *  Compliant Solution
 ******************************************************************************/

public static void deleteFile (){
    File someFile = new File ("someFileName.txt"); 
    // Do something with someFile
    if (!someFile.delete ()) {
        // Handle failure to delete the file
    }
}
