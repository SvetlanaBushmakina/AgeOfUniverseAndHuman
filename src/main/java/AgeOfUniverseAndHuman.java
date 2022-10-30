public class AgeOfUniverseAndHuman {
    public static void main(String[] args) {

        final long ageOfUniverse = 13000000000L;
        System.out.println("Возраст Вселенной " + ageOfUniverse + " лет");

        final long ageOfHuman = 100000;
        System.out.println("Возраст человека, как вида " + ageOfHuman + " лет");

        final long differenceAgeUniverseBetweenHuman = ageOfUniverse / ageOfHuman;
        System.out.println("Вселенная старше людей в " + differenceAgeUniverseBetweenHuman + " раз");


    }
}
