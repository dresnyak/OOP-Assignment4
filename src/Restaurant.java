public abstract class Restaurant {
    public void orderPasta(){
        System.out.println("Preparing pasta...");
        Pasta pasta = createPasta();
        pasta.prepare();
    }
    public abstract Pasta createPasta();

}
