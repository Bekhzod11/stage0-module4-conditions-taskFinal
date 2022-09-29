package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
    String result =
            (x>0 && y>0) ? "first" :
                    (x<0 && y>0) ? "second" :
                            (x<0 && y>0) ? "third" :
                                    (x>0 && y>0) ? "fourth":
                                            "zero";
        System.out.println(result);
    }
}
