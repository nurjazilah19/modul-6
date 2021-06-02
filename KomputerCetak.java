package modul.pkg6;

public class KomputerCetak {
    public static void main (String[]args){
        komputer[] komp = new komputer[3];
        
        komp[0] = new PC ();
        komp[1] = new laptop();
        komp[2] = new netbook ();
        
        for (int i = 0; i< komp.length; i++){
            komp [i].hidupkan_os();
            komp [i].matikan_os();
            komp [i].klik_kanan();
            komp [i].klik_kiri();
            komp [i].tekan_enter();
            komp [i].cetak_data();
        }
    }
    
}