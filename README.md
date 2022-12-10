# kotlin-rent-a-car

This project is a culmination of a lot of projects
which will be listed below in Bosnian:
1. Modeliramo potrebne klase i funkcionalnost za Rent-a-car kucu. Kompanije iznajmljuje vozila iz
   sljedecih kategorija: automobili, kombi vozila i limuzine. Napravite klasu Vehicle koja opisuje
   neko vozilo. Klasa ima sljedece privatne atribute: regNo (String), model (String), year(int) i
   price (double, oznacava cijenu unajmljivanja vozila po satu). Dodajte klasi konstruktor koji
   prima kao parametre sve vrijednosti za atribute. Napravite get i set metode za svaki atribut,
   kao i metodu toString. <br><br>
2. Napravite klase Car, Van i Limo koje nasljeduje Vehicle. Dodatno, Car sadrzi atribut
   carType (String), Van sadrzi atribut height (double) i noOfSeats (int), a Limo sadrzi atribute
   length (double) te boolean varijable miniBar i sunRoof. Napravite klase PassengerVan i CargoVan
   koje nasljeduje klasu Van, a dodatno imaju privatne atribute noOfPassenger (int, za PassengerVan)
   tj. maxLoad (double, u kg, za CargoVan). Napravite get i set metode za svaki atribut svih klasa.<br><br>
3. U svim klasama napisite metodu getPricePerDay, i to tako da za objekte tipa Vehicle i Car metoda
   vraca cijenu iz varijable price pomnozenu s 24, za putnicka kombi vozila vraca 80% cijene po danu
   pomnozene s 24, a za teretna kombi vozila 110% cijene * 24, a za limuzine 150% cijene * 24. Takoder,
   u klasi Vehicle napisite metodue getPricePerMonth, koja ce vratiti cijenu vozila ako se unajmljuje
   na mjesec dana (30 * odgovarajuca cijena po danu). Ovu metodu oznacite kao final. U klasi Vehicle
   napisite i staticku metodu newestVehicle koja prima varijabilni broj parametara tipa Vehicle, a vraca
   vozilo koje ima najnoviju godinu proizvodnje (ako ih je vise, vratiti prvo po redu). Dodajte argument
   double cargoSpace u klasu Car (oznacava volumen prtljaznika). U klasi Vehicle napisite staticku metodu
   printAllVehiclesWithCargoSpaceGreaterThan koja kao prvi argument prima double broj koji predstavlja
   trazenu zapreminu, a nakon toga slijedi varijabilni broj argumenata tipa Vehicle. Metoda treba ispisati
   sva vozila koja imaju zapreminu teretnog prostora ili prtljaznika vecu od trazene.
   <br><br>
   Za isjecak koda koji slijedi:<br><br>
   val v: Vehicle = Car("DA1234AA", "Renault Clio", 2001, 20.0, "coupe", 200.0)<br>
   val car = Car("DA8818BB", "Renault Megane Grandtour", 2007, 25.0, "caravan", 800.0)<br>
   val van1: Van = CargoVan("DA0009PO", "Volkswagen Transporter", 2018, 28.0, 2.0, 3, 4500.0)<br>
   val van2 = PassengerVan("DA6282EA", "IMV 1600", 1978, 35.0, 2.0, 3, 0)<br>
   val limo: Vehicle = Limo("DA2238AB", "Zastava 750 LE", 1983, 220.0, 3.2, miniBar = false, sunRoof = false)<br>
   <br>
   println(v.getModel() + " price per day: " + v.getPricePerDay())<br>
   println(van1.getModel() + " price per day: " + van1.getPricePerDay())<br>
   println(van2.getModel() + " price per month: " + van2.getPricePerMonth())<br>
   <br>
   val newest: Vehicle? = Vehicle.getNewestVehicle(v, car, van1, van2, limo)<br>
   println("Newest: " + newest?.getModel() + ", " + newest?.getYear())<br>
   <br>
   Vehicle.printAllVehiclesWithCargoSpaceGreaterThan(500.0, v, car, van1, van2, limo)<br>
   <br>
   ocekuje se ovakav ispis:<br>
   <br>
   Renault Clio price per day: 480.0<br>
   Volkswagen Transporter price per day: 739.2<br>
   IMV 1600 price per month: 20160.0<br>
   Newest: Volkswagen Transporter, 2018<br>
   Vehicles with cargo space greater than 500.0 litre:<br>
   - Renault Megane Grandtour: 800.0<br>
   - Volkswagen Transporter: 4500.0<br>
