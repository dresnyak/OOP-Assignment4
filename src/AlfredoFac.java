public class AlfredoFac extends Restaurant{
    @Override
    public Pasta createPasta(){
        System.out.println("Creating Alfredo...");
        return new Alfredo();
    }
}
