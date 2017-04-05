class Barang{
 private String Merk;
 private String Status_Barang;
 
 
 public Barang(){
 
 }
 
 public Barang(String Merk, String Status_Barang){
  this.Merk = Merk;
  this.Status_Barang = Status_Barang;
  
 }
 
 public String getMerk(){
  return Merk;
 }
 
 public String getStatus_Barang(){
  return Status_Barang;
 
 }
 
 public void setMerk(String Merk){
  this.Merk = Merk;
 }
 
 public void setStatus_Barang(String Status_Barang){
  this.Status_Barang = Status_Barang;
 
 }
 
 public void infoBarang() {
  System.out.println("\nInfo Barang");
  System.out.println("Merk\t\t: " + getMerk());
  System.out.println("Status Barang\t\t: " + getStatus_Barang());
  
 }
}

class Tas extends Barang{
 private String kodetas;
 
 public Tas(){
 }


 public Tas(String Merk, String Status_Barang, String kodetas){
  super(Merk, Status_Barang, kodetas);
  this.kodetas = kodetas;
 }
 
 public String getkodetas(){
  return kodetas;
 }
 
 public void setkodetas(String kodetas){
  this.kodetas = kodetas;
 }
 
 public void infoTas(){
  System.out.println("\nInfo TAs");
  System.out.println("Kode Tas\t\t: " + getkodetas());
  System.out.println("Merek\t\t: " + getMerek());
  System.out.println("Status_Barang\t\t: " + getStatus_Barang());
  
 }
 
} 

class Dompet extends Barang{
 private String kodedompet;
 
 public Dompet(){
 }
 
 public Dompet(String Merk, String Status_Barang, String kodedompet){
  super(Merk, Status_Barang, kodedompet);
  this.kodedompet = kodedompet;
 }
 
 public String getkodedompet(){
  return kodedompet;
 }
 
 public void setkodedompet(String kodedompet){
  this.kodedompet = kodedompet;
 }
 
 public void infoDompet(){
  System.out.println("\nInfo Dompet");
  System.out.println("Kode Dompet\t\t: " + getkodedompet());
  System.out.println("Merk\t\t: " + getMerk());
  System.out.println("Status_Barang\t\t: " + getStatus_Barang());
  
 }
 
}

class tampil{
 public static void main(String[]asdasd){
  Barang a = new Barang("Roxy","Baru");
  a.infoBarang();
  
  Tas b = new Tas("Eiger","baru","2905");
  b.infoTas();
  
  Dompet c = new Dompet("Sufer","Baru","0804");
  c.infoDompet();
  System.out.println("-----------------------------------");
 }
}