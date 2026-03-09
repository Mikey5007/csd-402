package erkol_mod_10_2;

public class UseDivision {

    public static void main(String[] args) {

        InternationalDivision intDiv1 =
                new InternationalDivision("Europe Sales", 101, "Germany", "German");

        InternationalDivision intDiv2 =
                new InternationalDivision("Asia Operations", 102, "Japan", "Japanese");

        DomesticDivision domDiv1 =
                new DomesticDivision("West Coast Sales", 201, "California");

        DomesticDivision domDiv2 =
                new DomesticDivision("East Coast Support", 202, "New York");

        intDiv1.display();
        intDiv2.display();
        domDiv1.display();
        domDiv2.display();
    }
}
