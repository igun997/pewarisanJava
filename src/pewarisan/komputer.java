/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pewarisan;

/**
 *
 * @author SystemFive
 */
public class komputer {
    protected String merk;
    protected int memory;
    public void cetakInfo(){
        System.out.print("Spek Komputer Belum Diketahui");
    }
}
class dekstop extends komputer
{
    private String modelDekstop;
    private String prosessorDekstop;
    public dekstop()
    {
         this.modelDekstop = "Belum Diketahui";
         this.prosessorDekstop = "Belum Diketahui";
         super.merk = "Belum Diketahui";
         super.memory = 0;
    }
    public dekstop (String modelDekstop,String prosessorDekstop)
    {
        this.modelDekstop = modelDekstop = modelDekstop;
        this.prosessorDekstop = prosessorDekstop = prosessorDekstop;
    }
    public void setMemori(int memory)
    {
       super.memory = memory;
    }
    public void setMerk(String merk)
    {
        super.merk = merk;
    }
    public void cetakInfo()
    {
         System.out.println("Merk Dekstop : "+super.merk);
         System.out.println("Model Dekstop : "+this.modelDekstop);
         System.out.println("Processors Dekstop :"+this.prosessorDekstop);
         System.out.println("Memory Dekstop :"+super.memory+" GB");
    }
    
}
class laptop extends komputer
{
    private String modelLaptop;
    private String prosessorLaptop;
    public laptop()
    {
        this.modelLaptop = "Belum Diketahui";
        this.prosessorLaptop = "Belum Diketahui";
        super.merk = "Belum Diketahui";
        super.memory = 0;
    }
    public laptop(String modelLaptop,String prosessorLaptop)
    {
        this.modelLaptop = modelLaptop;
        this.prosessorLaptop = prosessorLaptop;
    }
    public void setMemori(int memory)
    {
        super.memory = memory;
    }
    public void setMerk(String merk)
    {
        super.merk = merk;
    }
    public void cetakInfo()
    {
         System.out.println("Merk Laptop : "+super.merk);
         System.out.println("Model Laptop : "+this.modelLaptop);
         System.out.println("Processors Laptop :"+this.prosessorLaptop);
         System.out.println("Memory Laptop :"+super.memory+" GB");
    }
    
}