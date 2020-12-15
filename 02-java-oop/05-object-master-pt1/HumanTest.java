public class HumanTest{

    public static void main(String[] args){

    Human dan = new Human(); 
    Human ray = new Human(); 

   dan.attack(ray);
        System.out.println(ray.health);
    }
}