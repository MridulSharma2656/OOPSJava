package SkiilsPw.OOPSJava;

public class Animal {
    public static void main(String[] args) {
    forest f = new forest();
    f.allowAnimal(new Monkey());
    f.allowAnimal(new Lion());
    f.allowAnimal(new Deer());
    }
}
class Animal1{
    public void eats(){
        System.out.println("Animal eats");
    }
    public void sleeps(){
        System.out.println("Animal sleeps");
    }
}
class Monkey extends Animal1{
    public void eats(){
        System.out.println("Monkey eats");
    }
    public void sleeps(){
        System.out.println("Monkey sleeps");
    }
}
class Lion extends Animal1{
    public void eats(){
        System.out.println("Lion eats");
    }
    public void sleeps(){
        System.out.println("Lion sleeps");
    }
}
class Deer extends Animal1{
    public void eats(){
        System.out.println("Deer eats");
    }
    public void sleeps(){
        System.out.println("Deer sleeps");
    }
}
class forest{
    public void allowAnimal(Animal1 animal){
        animal.eats();
        animal.sleeps();
        System.out.println();
    }
}
