import java.util.Scanner;
 
public class tugasAOK {
    public static void main(String[] args) {
        Scanner masuk = new Scanner (System.in);
        
        while (true){
        System.out.println("\nKonversi Bilangan");
        System.out.println("1. Biner ke Hexa");
        System.out.println("2. Hexa ke Biner");
        System.out.println("3. Biner ke Desima");
        System.out.println("4. Desimal ke Biner");
        System.out.println("5. Desimal ke Hexa");
        System.out.println("6. Hexa ke Desimal");
        System.out.print("Masukan Pilihan :");
        int pilihan = masuk.nextInt();
        
        switch (pilihan){
            case 1 :
                BinerKeHexa();
                break;
            case 2 :
                HexaKeBiner();
                break;
            case 3 :
                BinerKeDesimal();
                break;
            case 4 :
                DesimalKeBiner();
                break;
            case 5 :
                DesimalKeHexa();
                break;
            case 6 : 
                HexaKeDesimal();
                break;
            default:
                System.out.println("\nPilih angka dari 1-6");
                
            }
                       
        }
         
    }
    
    public static void BinerKeDesimal(){
        Scanner masuk = new Scanner (System.in);
        System.out.print("\nMasukkan bilangan biner: ");
        String biner = masuk.nextLine();
        int desimal = Integer.parseInt(biner, 2);
        System.out.println("Hasil konversi: " + desimal);
                
    }
    
    public static void DesimalKeBiner(){
        Scanner masuk = new Scanner (System.in);
        System.out.print("\nMasukkan bilangan desimal: ");
        int desimal = masuk.nextInt();
        String biner = Integer.toBinaryString(desimal);
        System.out.println("Hasil konversi: " + biner);
        
    }
    
    public static void BinerKeHexa(){
        Scanner masuk = new Scanner (System.in);
        System.out.print("\nMasukkan bilangan biner: ");
        String biner = masuk.nextLine();
        int desimal = Integer.parseInt(biner, 2);
        String hexa = Integer.toHexString(desimal).toUpperCase();
        System.out.println("Hasil konversi: " + hexa);
        
    }
    
    public static void HexaKeBiner(){
        Scanner masuk = new Scanner (System.in);
        System.out.print("\nMasukkan bilangan hexa: ");
        String hexa = masuk.nextLine();
        int desimal = Integer.parseInt(hexa, 16);
        String biner = Integer.toBinaryString(desimal);
        System.out.println("Hasil konversi: " + biner);
        
    }
    
    public static void DesimalKeHexa(){
        Scanner masuk = new Scanner (System.in);
        System.out.print("\nMasukkan bilangan desimal: ");
        int desimal = masuk.nextInt();
        String hexa = Integer.toHexString(desimal).toUpperCase();
        System.out.println("Hasil konversi: " + hexa);
        
    }
    
    public static void HexaKeDesimal(){
        Scanner masuk = new Scanner (System.in);
        System.out.print("\nMasukkan bilangan heksadesimal: ");
        String hexa = masuk.nextLine();
        int desimal = Integer.parseInt(hexa, 16);
        System.out.println("Hasil konversi: " + desimal);
        
    }
    
}