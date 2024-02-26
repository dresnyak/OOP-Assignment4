public class LasagnaFac extends Restaurant{
    @Override
    public Pasta createPasta(){
        System.out.println("Creating Lasagna...");
        return new Lasagna();
    }
}
