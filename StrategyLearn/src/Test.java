public class Test {
    public static void main(String[] args) {
        PeopleExtStrategy peopleExtStrategy = new PeopleExtStrategy(new UpFansOneStrategyImpl());
        peopleExtStrategy.exc(1,2);

        PeopleExtStrategy peopleExtStrategy1 = new PeopleExtStrategy(new UpFansTwoStrategyImpl());
        peopleExtStrategy1.exc(3,4);
    }
}
