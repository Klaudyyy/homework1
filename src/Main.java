//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void
    main(String[] args) {
        var dog = 0.8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog + "," + cat + "," + paper);

        dog = dog + 2;
        cat = cat + 2;
        paper = paper + 2;
        System.out.println(dog + "," + cat + "," + paper);


        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog + "," + cat + "," + paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 5.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3/5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var TotalMass = boxer1 + boxer2;
        System.out.println("общая масса " + TotalMass + "кг");
        var Difference = boxer2 - boxer1;
        System.out.println("разница между бойцами составляет " + Difference + "кг");
        var Remainder = boxer2 % boxer1;
        System.out.println("остаток " + Remainder + "%");

        var TotalHours = 640;
        var TimeForOne = 8;
        var NumberOfEmployees = TotalHours / TimeForOne;
        System.out.println("Всего работников в компании " + NumberOfEmployees + "человек");

        NumberOfEmployees = NumberOfEmployees + 94;
        TotalHours = NumberOfEmployees * TimeForOne;
        System.out.println("Если в компании работает " + NumberOfEmployees + "человек, то всего " + TotalHours + "чвсов работы");
    }
}