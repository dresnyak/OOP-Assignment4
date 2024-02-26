public class CarbonaraFac extends Restaurant{
    @Override
    public Pasta createPasta(){
        System.out.println("Creating Carbonara...");
        return new Carbonara();
    }
}
