public class Taschenrechner {

    private Service s;

    public Taschenrechner(Service service){
        s= service;
    }


    public int rechne(int x, int y)
    {
        return s.add(x,y);
    }
}
