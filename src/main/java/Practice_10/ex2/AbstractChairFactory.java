package Practice_10.ex2;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair();
    MagicChair createMagicChair();
    FunctionalChair createFunctionalChair();
}