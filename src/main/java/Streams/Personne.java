package Streams;

public  class Personne {
    private String nom;
    private int age;
   public Personne(String nom, int age){
       this.nom = nom;
       this.age = age;
   }
   
   public String getNom(){
       //System.out.println("getNom de Personne");
       return this.nom;
   }
   
   public int getAge(){
       //System.out.println("getAge de Personne");
       return this.age;
   }
   
   public void setNom(String nom){
       this.nom = nom;
   }
   
   public static void main (String [] args) {
       Personne p1 = new Personne("n1", 15);
       System.out.println(p1.getAge());
   }
}

