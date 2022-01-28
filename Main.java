public class Main {

    public static void main(String[] args) {
        Shop elvis = new Shop("Элвис");
        Shop uralAuto = new Shop("УралАвто");
        Shop renoult = new Shop("Рено");

        elvis.addCars(
                new Car("Phantom", "Черный", 999_999_999),
                new Car("Phantom S", "Коричневый", 1_999_999_999),
                new Car("Волга", "Черный", 1_999)
        );
        uralAuto.addCars(
                new Car("Crown", "Серебристый", 999_999),
                new Car("урал", "Зеленый", 99),
                new Car("Волга", "Черный", 999)
        );

        renoult.addCars(
                new Car("Duster", "Зеленый", 999),
                new Car("Capture", "Белый", 999),
                new Car("Arkana", "Красный", 999)
        );

        final Car boughtCar = searchAll("Волга", elvis, uralAuto, renoult);
        System.out.println("Ура! Мы купили! " + boughtCar);

    }


    public static Car searchAll(String model, Shop shop1, Shop shop2, Shop shop3) {
        //Поиск в автосалонах
        Car volgaElvis = shop1.search("Волга");

        if (volgaElvis == null) {
            System.out.println("Не нашли в автосалоне \"Элвис\"");
        } else {
            System.out.println("Элвис: " + volgaElvis);
        }

        Car volgaUral = shop2.search("Волга");

        if (volgaUral == null) {
            System.out.println("Не нашли в автосалоне \"УралАвто\"");
        } else {
            System.out.println("УралАвто: " + volgaUral);
        }

        Car volgaRenault = shop3.search("Волга");
        if (volgaRenault == null) {
            System.out.println("Не нашли в автосалоне \"Рено\"");
        } else {
            System.out.println("Рено: " + volgaRenault);
        }

        assert volgaElvis != null;
        assert volgaUral != null;
        if (volgaElvis.cost > volgaUral.cost) {
            System.out.println("Лучше купить в УралАвто");
            return volgaUral;
        } else
            System.out.println("Можно купить в Элвис");
        return volgaElvis;
    }
}

