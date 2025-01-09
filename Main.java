public class Main {
    public static void main(String[] args) {
        Tapparella tapparella1 = new Tapparella(120, 200);
        System.out.println(tapparella1);

        tapparella1.scendi(50);
        System.out.println(tapparella1);

        tapparella1.sali(30);
        System.out.println(tapparella1);

        TapparellaElettrica tapparellaElettrica = new TapparellaElettrica(100, 150);
        System.out.println(tapparellaElettrica);

        tapparellaElettrica.scendiCompletamente();
        System.out.println(tapparellaElettrica);

        tapparellaElettrica.saliCompletamente();
        System.out.println(tapparellaElettrica);
    }
}
