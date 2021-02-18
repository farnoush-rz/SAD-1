
package javaapplication13;


public class BackupController {
    
    private long lastSync;
    private boolean isMaster;
    private boolean isSyncing;
    
    //*******************************************
    
    public void BackupController(int lastSync, boolean isMaster, boolean isSyncing){
        
        
    }
    
    //*********************************************
    private void autoSync() {
        this.lastSync = System.currentTimeMillis();
        System.out.println("Synced");
    }
}
