class father{
    String height = "Tall";
    String nature = "Kind";
}

class soumya extends father{

}

public class Inheritance extends soumya{
    public static void main(String[] args) {
        soumya myself = new soumya();
        System.out.println(myself.height);
    }
}
