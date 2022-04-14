

public class Bitcoin  {

    private String address;

    private int year;

    private int day;

    private int length;
  //  @CsvBindByName(column = "weight")
    private double weight;
    //@CsvBindByName(column = "count")
    private int count;
    //@CsvBindByName(column ="looped" )
    private int looped;
    //@CsvBindByName(column = "neighbors")
    private int neighbors;
    //@CsvBindByName(column = "income")
    private double income;
    //@CsvBindByName(column = "label")
    private String label;



    // Constructor
    public  Bitcoin(String address, int year,int day, int length, double weight, int count, int looped,int neighbors,double income, String label){
        this.address= address;
        this.year= year;
        this.day=day;
        this.length= length;
        this.weight=weight;
        this.count=count;
        this.looped=looped;
        this.neighbors=neighbors;
        this.income=income;
        this.label=label;

    }
    public String getAddress(){
        return  address;
    }


  //  public int  getYear(){
        //return  year;


  //  public String getLength(){
       // return  length;
   // }

    public double getWeight(){
        return weight;
    }


    public String toString(){
        return this.address+","+this.year+","+this.day+","+this.length+","+this.weight+","+this.count+","+ looped+","+this.neighbors+","+this.income+","+this.label;

    }

    /*public int compareTo(Bitcoin other){
        int addressdiff=this.address.compareTo(other.getAddress());
        return addressdiff;




    }*/

}
