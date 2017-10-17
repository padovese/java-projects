package academy.learnprogramming;

class MuseumClosed extends RuntimeException {
}

class MuseumClosedForLunch extends MuseumClosed {
}

public class CatchingExceptions {

    public static void main(String[] args) {
        try {
            visitMuseum();
        } catch (MuseumClosedForLunch ml) {
            System.out.println("Museum is closed for lunch.");
        } catch (MuseumClosed mc) {
            System.out.println("Museum is closed.");
        }
    }

    public static void visitMuseum() {
        boolean b = Math.random() < 0.5;

        if (b) {
            throw new MuseumClosed();
        }

        throw new MuseumClosedForLunch();

    }
}
