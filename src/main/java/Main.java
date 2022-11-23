import Entity.LocationEntity;
import project.Listofpeopleinspace;

import javax.net.ssl.HandshakeCompletedEvent;
import java.sql.Connection;
import java.util.Scanner;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {

        private static Listofpeopleinspace main = new Listofpeopleinspace();

        final LocationEntity location1 = new LocationEntity(1668453798, 46.5357, 22.4044);
        final LocationEntity location2 = new LocationEntity(1668454557, 44.3262, 91.8486);
        final LocationEntity location3 = new LocationEntity(1668454610, 42.5446, 95.6753);
        final LocationEntity location4 = new LocationEntity(1668454618, 42.2636, 96.2323);
        final LocationEntity location5 = new LocationEntity(1668454624, 42.0509, 96.6466);
        class MathFunctions {
            public static void main(String[] args) {
                double firstDeltaX = 44.3262 - 42.5446;
                int second = 2;
                double power1DX = Math.pow(firstDeltaX, second);
                double firstFraction = 44.3262 * PI / 180;
                double cosinus = cos(firstFraction);
                double secondDeltaYMultiCosinus = cosinus * (95.6753 - 91.8486);
                double power2DY = Math.pow(secondDeltaYMultiCosinus, second);
                double sum = power1DX + power2DY;
                double sqrt = Math.sqrt(sum); //pierwiastek kwadratowy
                double distanse = sqrt * 40075.704 / 360;

                System.out.println("Odległość w kilometrach wynosi " + distanse);

                double time = (1668454610.0 - 1668454557.0) / 3600;

                System.out.println("czas w godzinach wynosi " + time);

                double result = distanse / time;

                System.out.println("Prędkość w km/h wynosi " + result);

//                Odległość w kilometrach wynosi 363.5987444709113
//                czas w godzinach wynosi 0.014722222222222222
//                Prędkość w km/h wynosi 24697.27320934492

            }

        // speed = l / delta T
        // delta = T2 - T1
        // high (R) = 413 000 m
        // l = alfa / 360 * 2 * PI * R = 64/ 360 *
        // ∆XPK = XK – XP                   ∆YPK = YK – YP
        // ∆X = 42.5446 - 44.3262 =  1,7816
        // ∆Y = 95.6753 - 91.8486 =  3,8267
        //2. Badamy znaki przyrostów współrzędnych:
        //
        //
        //jeżeli  ∆XPK > 0  oraz  ∆YPK > 0          to alfa APK = arctg ∆YPK  /∆XPK = arctg = 64 degree

//        {
//            "message": "success",
//                "timestamp": UNIX_TIME_STAMP,
//                "iss_position": {
//            "latitude": CURRENT_LATITUDE,
//                    "longitude": CURRENT_LONGITUDE
//        }
//        }

        System.out.println("Hello ");

        Session session = Connection.getSession();
        session.close();

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Select operation: ");
            System.out.println("1 - ListOfPeopleSpace");
            System.out.println("2 - Speed");
            System.out.println("0 - Exit");


        }
    }
}
